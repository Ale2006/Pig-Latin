package piglatin;

import java.util.Scanner;


public class PigLatin{

   
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String cadena;
        int menu=0;
		         
		do{ 
			
                    System.err.println("Bienvenido al traductor Ingles-PigLatin y Español-Jeringoso");

                    System.err.println("Seleccione el idioma: ");
                    System.err.println("1-Jeringoso ");
                    System.err.println("2-PigLatin ");
                    
                    menu= scn.nextInt();
                    scn.nextLine();
		    System.err.println("Ingrese el texto en a traducir: ");
                    cadena= scn.nextLine();
                    
                    mostrarPantalla( separarPalabras(cadena.toLowerCase(), menu) );
		    
                    System.err.print("Desea seguir traduciendo? (S/N): ");
                    cadena= (scn.nextLine()).toLowerCase();
                    
                }while (cadena.charAt(0)!='n');

	 	mostrarPantalla( "Thanks for using the Pig Latin translator!" );
                mostrarPantalla( "Gracias por usar el traductor Jeringoso!" );
	}



    
    
public static String separarPalabras(String cadena, int menu){

 int pos=1;
 String palabra="";
 String palabratraducida="";
    
    AOtroIdioma AllIdioma= new AOtroIdioma();

    if (menu==1) {
        AllIdioma= new AJeringoso();
    }
    else if (menu==2) {
        AllIdioma= new APigLatin();
    }
  
     for (char c : cadena.toCharArray()) {
         
       if(pos==cadena.length() && Character.isLetter(c)){
       
       palabratraducida+=AllIdioma.traducir(palabra);
       }  
       else if(!Character.isLetter(c) || c==' '){
           if (palabra.length()>=1) {
               palabratraducida+=AllIdioma.traducir(palabra) +c; 
               palabra="";
           } else {
               palabratraducida+=c;
           }
       }
       else if (Character.isLetter(c)) {
             palabra+=c;
         }
       else{
       return "Error";
       }
       
       pos++;
     }
     
 return palabratraducida;
}
 
	public static void mostrarPantalla(String palabras){
		          
            System.out.println(palabras);
	    System.out.println("");
	}
}

