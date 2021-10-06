import java.io.*; //File I/O
import java.util.*;	//Arrays
import javax.swing.*; //Dialog

public class FileProperty {
	public static void main(String[] args) {
	
		String filename = "FileProperty.java";
		File f = new File(filename);
		
		//***[a] file properties
		System.out.println("[File Property:]");		
		System.out.println("File \""+filename+"\" exists: " +f.exists());
		System.out.println("File size: "+f.length());
		System.out.println("Can be read: "+f.canRead());
		System.out.println("Can be written: "+f.canWrite());
		System.out.println("Is a file: "+f.isFile());
		System.out.println("Is a directory: "+f.isDirectory());
		
		//list files in a directory		
		File dir = new File(".");  // current directory
		System.out.println("Files in current directory: " + Arrays.toString(dir.list()));    
		
		//***[b]rename file
		String oldName = "Test.txt";
		String newName = "Test2.txt";
		
		//create a new object containing a filename [it does not physically create a new file]
		f = new File(oldName);
		File f2 = new File(newName);
		
		//call method .renameTo() 
		System.out.println("\n[Rename File:]");				
		if (f.renameTo(f2) || f2.renameTo(f))
			System.out.println("Rename file successful");
		else
			System.out.println("Rename file failed");
		
		dir = new File(".");  // current directory		
		System.out.println("Files in current directory: " + Arrays.toString(dir.list()));    		

		//***[c] delete file
		File f3 = new File("Test3.txt");				
		System.out.println("\n[Delete File \"Test3.txt\":]");						
		
		if (!f3.exists()){
			try{
				//create Test3.txt physically if the file does not exist 
				//[note the file will be actually created]
		        FileOutputStream out = new FileOutputStream(f3); 	
				out.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} 
		} 
		//before delete
		dir = new File("."); 
		System.out.println("Files in current directory: " + Arrays.toString(dir.list()));    	
				
		// change null to this, the Message Dialog will appear in the same place as the parent JFrame				
		int option = JOptionPane.showConfirmDialog(null, "Are you sure to delete " + f3 + "?");
		
		if (option == JOptionPane.YES_OPTION) {
		  boolean deleteOK = f3.delete();
		  	if (deleteOK){
				System.out.println("Delete file successful");          
		    	JOptionPane.showMessageDialog(null, "Delete file successful"); // change null to this, the Message Dialog will appear in the same place as the parent JFrame				
		  	}else{
	  			System.out.println("Delete file failed");     
	    		JOptionPane.showMessageDialog(null, "Delete file failed");
			}
		}// no else part if user clicks "No" or "Cancel" in the confirmation dialog
		
		//after delete
		dir = new File("."); 
		System.out.println("Files in current directory: " + Arrays.toString(dir.list()));    	
		
	}
}
