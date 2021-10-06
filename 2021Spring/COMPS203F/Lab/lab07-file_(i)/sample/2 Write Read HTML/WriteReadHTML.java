import java.io.*;    

public class WriteReadHTML { 
    public static void main(String[] args) throws IOException { 
  
        try { 
            FileInputStream in = new FileInputStream("in.html"); 
            FileOutputStream out = new FileOutputStream ("out.txt"); 
            
			String contentChar = "";               
			
            // Reading source file and writing content to target 
            int inputByte; 
            while ((inputByte = in.read()) != -1) {	//end of file (EOF) = -1
                out.write(inputByte);  				//or, out.write((byte)inputByte);
                
                //char by char
                contentChar += (char) inputByte;
            }

			System.out.println("Content read in Char: \n\n"+contentChar);
			System.out.println("\nOpen out.txt to see the result");			
						
            in.close();
            out.close();           
            
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
    } 
} 
