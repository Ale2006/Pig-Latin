package piglatin;

import java.util.Scanner;


public class PigLatin {

   
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
		System.err.println("Bienvenido al traductor Ingles-PigLatin");

		System.err.println("Ingrese el texto en ingles a traducir (vacio para terminar): ");

		String cadena;
                
		while ((cadena= scn.nextLine())!=null && !cadena.isEmpty()) { 
			
                    mostrarArray( separarPalabras(cadena.toLowerCase()) );
		    System.err.println("Ingrese el texto en ingles a traducir (vacio para terminar): ");
		}

	 	mostrarArray( "Thanks for using the Pig Latin translator!" );
	}



    
public static String separarPalabras(String cadena){
String paltraducidas="";

    for (String palabra : cadena.split(" ")) {
        
        String palunamenos=palabra.substring(0,(palabra.length()-1));
        String ultimocaracter=palabra.substring((palabra.length()-1),(palabra.length()));
        
        if (!palabra.matches("^[a-zA-Z ]*$")) {
        
            int pos= palabra.indexOf(','|'!'|'?'|'.'|':'|';'|'-'|'_');
        paltraducidas+= traducirPalabra(palunamenos)+ ultimocaracter + " ";
        }
        
        else {
        paltraducidas+= traducirPalabra(palabra) + " ";
        }
    }



return paltraducidas;
}

public static String traducirPalabra(String cadena){
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

	
	public static boolean isLetra(char c) {
		return Character.isLetter(c); //SEE: https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isAlphabetic(int)
	}

	        
	public static void mostrarArray(String palabras){
		          
            System.out.println(palabras);
	    System.out.println("");
	}

}
