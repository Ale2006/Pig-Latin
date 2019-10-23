package piglatin;

public class AJeringoso {
    public String Traducir (String cadena){
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
