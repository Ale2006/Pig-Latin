package piglatin;

public class APigLatin {
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
}
