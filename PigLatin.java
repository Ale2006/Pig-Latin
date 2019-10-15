package piglatin;

import java.util.Scanner;

public class PigLatin {

   
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String cadena=" ";
        int palabras=0;
        
        
        while (cadena.length()!=0 && !cadena.isEmpty()) {            
        
        System.out.println("Bienvenido al traductor Ingles-PigLatin");
        System.out.print("Ingrese el texto en ingles a traducir: ");
        cadena= scn.nextLine();
            
            
        if (cadena.isEmpty()) {
            System.out.println("No ingreso ninguna palabra...");
            cadena=" ";
        }
        
        else{
            
        palabras= contadorPalabras(cadena);
        
        String [] arrayCadena= new String[palabras];
        
        
            
        arrayCadena= llenarArray(arrayCadena, cadena);
        
        arrayCadena=traductor(arrayCadena);
         
        mostrarArray(arrayCadena);
        
        }
        }
    }
    
    
    public static String [] traductor (String []array){
    String aux="";
        
    
        for (int i = 0; i < array.length ; i++) {
         
            if(esVocal(array[i].substring(0,1))){//  bloque para vocales
            
            array[i]=array[i]+"yay";
            
            }
            
            else if (!esVocal(array[i].substring(0,1)) && !esVocal(array[i].substring(1,2))) { //bloque para las que empiezan con 2 consonantes
                
                aux= array[i].substring(2);
                aux+= array[i].substring(0,2)+"ay";
                array[i]=aux;
                
            }
            
            else if (!esVocal(array[i].substring(0,1))){  //bloque para las que empiezan con 1 consonante
                aux= array[i].substring(1);
                aux+= array[i].substring(0,1)+"ay";
                array[i]=aux;
 
            }
            
            
            System.out.print(" ");
            
        }
        
        System.out.println("");
    
        return array;
    }
   
    
    public static String [] llenarArray(String[] arrayCadena, String cadena){
    int j=0;
    cadena= cadena.toLowerCase();
        
    for (int i = 0; i < arrayCadena.length; i++) {
                arrayCadena[i]="";
            }
        
            for (char x : cadena.toCharArray()) {
                
                if (x!=' ') {
                arrayCadena[j]+=x;   
                }
                else{
                j++;
                }
            }
    return arrayCadena;
    }
    
    
    public static int contadorPalabras(String cadena){
    int palabras=1;
    
    for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==' ' && i<cadena.length()-1) {
             palabras++;
            }
            }    
    return palabras;
    }
    
    
    
    public static boolean esVocal(String x){
    String vocales="aeiou";
    
        for (char l: vocales.toCharArray()) {
            
            if (l== x.charAt(0)) {
                return true;
            }
        }
        return false;
    }
    
  
    public static void mostrarArray(String[]cadena){
    
        for (String palabras : cadena) {
            
            System.out.print(palabras + " ");
            
        }
        System.out.println("");
    }
    
    
    
}


