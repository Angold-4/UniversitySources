public class Encrypt{
	public static String encrypt(String inText, int shift){
    	String encrypted = "";
    	
        for (int i = 0; i < inText.length(); i++) {
          char ch = inText.charAt(i);
          if (ch >= '0' && ch <= '9') {
            ch += shift;
            if (ch > '9')
              ch -= 10;
          } 
          encrypted += ch;
        }
        return encrypted;
	} 	
	
	public static void main(String[] args) {
		
		//example 1
        String content = "0123456789";
		System.out.println("Original text:  "+content); 
		         
		//add 2 to content
		System.out.println("Encrypted text: "+encrypt(content, 2));  
		
		//example 2
		System.out.println("\nOriginal text:\n"+content);    
 		
		for(int i=0; i<5; i++){
			System.out.println("\nAdd " + (i+3) + " to text:");   			
			System.out.println(encrypt(content, i+3));  
		}           
	}    
}        
