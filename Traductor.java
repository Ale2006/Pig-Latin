/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;

/**
 *
 * @author a
 */
public class Traductor {
    
    
    public static String traducirPig(String cadena){
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
    
    public static String traducirJeri (String cadena){
    String palTraducida="";
    boolean isQ=false;
    
        for (char x: cadena.toCharArray()){
        
            palTraducida+=x;
            String i = Character.toString(x);
            
            
            if (x=='q') {
             isQ=true;
            }
            
            if (i.matches("^[aeiou]$")) {
                
                if (x=='u' && isQ) {
                    isQ=false;
                }
                
                else if(isQ==false){
                palTraducida+= 'p'+ i;  
            
                }
                }
            
        }
        
    
    
    return palTraducida;
    }
    
}
