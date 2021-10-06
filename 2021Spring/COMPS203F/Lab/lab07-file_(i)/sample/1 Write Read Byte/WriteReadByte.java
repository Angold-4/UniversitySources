//lab 11 sample 1

import java.io.*;    

public class WriteReadByte { 
    public static void main(String[] args) throws IOException { 
  
        try { 
            FileInputStream in = new FileInputStream("in.txt"); 
            FileOutputStream out = new FileOutputStream ("out.txt"); 
            
            //Example 1 - read text from the input file
			String contentChar = "";               
			String contentByte = ""; 
			String amendedChar = "";               			
  
            // Reading source file and writing content to target 
            int inputByte; 
            while ((inputByte = in.read()) != -1) {	//end of file (EOF) = -1
            
                //byte by byte 
                contentByte += inputByte; 			//or, contentByte += (byte) inputByte;
                
                //char by char
                contentChar += (char) inputByte;
                
                //Example 2 - replace a char '.' to '!' to the output file
                if (inputByte == '.'){
	                amendedChar += '!';
                	out.write('!'); 
            	}
            	else{
	                amendedChar += (char) inputByte;            	
                	out.write(inputByte);  				//or, out.write((byte)inputByte);
            	}
            }
            
            System.out.println("Example 1:");            
            System.out.println("Original content read in Byte: "+contentByte);
			System.out.println("Original content read in Char: "+contentChar);
			
            System.out.println("\nExample 2:");            			
			System.out.println("Amended content read in Char: "+amendedChar);
                           
			//Example 3 - append a string to the output file     
            System.out.println("\nExample 3:");            						
			System.out.println("Append \"\\nGoodbye\" to file out.txt");
			System.out.println("Open out.txt to see the result");
						
			String str = "\nGoodbye";
						
			//write string value to file 
			for(int i=0; i<str.length(); i++)
                out.write(str.charAt(i)); 			
						
            in.close();
            out.close();           
            
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
    } 
} 
