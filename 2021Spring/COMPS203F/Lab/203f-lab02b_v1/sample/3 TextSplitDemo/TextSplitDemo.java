//demonstrate split() 
public class TextSplitDemo { 
	public static void main(String args[]) 
	{ 
		String str = "COMPS203F - Java Programming";         
		String[] arrOfStr = str.split("-"); 
		
      	System.out.println("no. of characters: "+ str.length());
      
      	System.out.println("\nCalling .split(\"-\"): ");
      	
      	System.out.println("no. of words: "+ arrOfStr.length +"\n");   
      	   	      
      	System.out.println("Array elements:");      	            	
		for (String result : arrOfStr) 
			System.out.println(result); 
	} 
} 
