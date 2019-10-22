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

	 	mostrarPantalla( "Thanks for using the Pig Latin translator!\n" );
	}



    
public static String separarPalabras(String cadena, int menu){
String paltraducidas="";
Traductor objTraducido = new Traductor();

    if (cadena.isEmpty()) {
        return "Error";
    }

    for (String palabra : cadena.split(" ")) {
        
        String palunamenos=palabra.substring(0,(palabra.length()-1));
        String ultimocaracter=palabra.substring((palabra.length()-1),(palabra.length()));
        
        if (!palabra.matches("^[a-zA-Z ]*$")) {
         
      	  if(palabra.length()>2){
        
            if (menu==1) {
        	paltraducidas+= objTraducido.traducirJeri(palunamenos)+ ultimocaracter + " ";  
            }
            else{
      	        paltraducidas+= objTraducido.traducirPig(palunamenos)+ ultimocaracter + " ";
            }
            }
        else{
            paltraducidas+=palabra + " ";
        }
        }
        
        
        else {
        if (menu==1) {    
        paltraducidas+= objTraducido.traducirJeri(palabra) + " ";
        }  
        else{
        paltraducidas+= objTraducido.traducirPig(palabra) + " ";
        }
        }
    }



return paltraducidas;
}
	
public static void mostrarPantalla(String palabras){
		          
            System.out.println(palabras);
	    System.out.println("");
	}
}
