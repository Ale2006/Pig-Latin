package piglatin;

public class APigLatin extends AOtroIdioma{
    
    public String traducir(String cadena){
    String empiezaVocal="^[aeiou]{1}.*";
    String dosConsonantes="^[^aeiou]{2}.*";
    
       if (cadena.matches(empiezaVocal) && cadena.length()>1){ 
			cadena=cadena + "yay";

	}
      
	else if (cadena.matches(dosConsonantes)) {
	    cadena= cadena.substring(2) + cadena.substring(0,2)+"ay";

	}
        else if(!cadena.matches(empiezaVocal)){
	    cadena= cadena.substring(1) + cadena.substring(0,1)+"ay";
	}
		return cadena;
	}
}
