package piglatin;

import java.util.Scanner;

public class PigLatin {

   
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
		System.err.println("Bienvenido al traductor Ingles-PigLatin");

		System.err.println("Ingrese el texto en ingles a traducir (vacio para terminar): ");

		String cadena;
		while ((cadena= scn.nextLine())!=null && !cadena.isEmpty()) { 
			mostrarArray( traducir(cadena) );
			System.err.println("Ingrese el texto en ingles a traducir (vacio para terminar): ");
		}

		mostrarArray( traducir("Thanks for using the Pig Latin translator!") );
	}




	public static String[] palabras(String cadena) {
	
                String [] arrayCadena= cadena.split(" ");
		return llenarArray(arrayCadena, cadena);
	}

	public static String[] traducir(String cadena) {
		return traducir( palabras(cadena) );
	}

	public static String[] traducir(String[] palabras){
		//PodemosAprender: esta funcion es un caso particular de Map, recorre una estructura de datos y le aplica una func a cada elemento
		//SEE: https://dzone.com/articles/how-to-use-map-filter-collect-of-stream-in-java-8

		//TODO: como traducir sin perder los signos de puntuacion?
		String[] r= new String[ palabras.length ];
		for (int i = 0; i < palabras.length ; i++) {
                    
                    r[i]= traducirUna( palabras[i] );
                    
                    }
		return r;
	}

	public static String traducirUna(String palabra) {
		//PodemosAprender: conviene hacer funciones lo mas chiquitas y especializadas que puedas, en este problema la unidad es convertir UNA palabra
		String palabraPigLatin= "ERROR!"; //DFLT

		if (palabra.length()<2) { return palabra; } //A: si tiene menos de dos letras, la dejamos igual

		boolean isVocal1raLetra= isVocal(palabra.substring(0,1));   
		boolean isVocal2daLetra= isVocal(palabra.substring(1,2));
		
      if(isVocal1raLetra){ //A: empieza con vocal
		   palabraPigLatin= palabra+"yay";
		}
		else if (!isVocal1raLetra && !isVocal2daLetra){ //A: empieza con dos consonantes  
			palabraPigLatin= palabra.substring(2) + palabra.substring(0,2) + "ay";
		}
		else if (!isVocal1raLetra && isVocal2daLetra) { //A: empieza con consonante (falso el primer if) pero la segunda es vocal (falso segundo if) 
			palabraPigLatin= palabra.substring(1) + palabra.substring(0,1) + "ay";
		}
		else {
			//TODO: error, puede pasar? como se maneja?
		}
		return palabraPigLatin;
	}

	public static String traducirUnaConRegex(String cadena){

		String empiezaVocal="^[aeiou]{1}.*";
		String dosConsonantes="^[^aeiou]{2}.*";

		if (cadena.matches(empiezaVocal)){ 
			cadena=cadena + "yay";

		}
		else if (cadena.matches(dosConsonantes)) {
			cadena= cadena.substring(2) + cadena.substring(0,2)+"ay";

		}
		else{
			cadena= cadena.substring(1) + cadena.substring(0,1)+"ay";
		}
		return cadena;
	}

	public static String[] llenarArray(String[] arrayCadena, String cadena){
		int j=0;
		cadena= cadena.toLowerCase();
                

		for (int i= 0; i < arrayCadena.length; i++) {
			arrayCadena[i]="";
		}

		for (char x : cadena.toCharArray()) {
			
                        if (isLetra(x)){  //|| x== ',') { //esto esta a prueba
				arrayCadena[j]+=x;   
			}
			
                        else if(x== ' '){
			    j++;
			}
		}
		return arrayCadena;
	}


	public static boolean isLetra(char c) {
		return Character.isLetter(c); //SEE: https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isAlphabetic(int)
	}

	public static boolean isVocal(String x){
	        String empiezaVocal="^[aeiou]{1}.*";
		
		if (x.matches(empiezaVocal)) 
			return true;
			
            
                return false;
	}
        
        
	public static void mostrarArray(String[] palabras){
		for (String palabra : palabras) {
			System.out.print(palabra + " ");
		}
		System.out.println("");
	}

}
