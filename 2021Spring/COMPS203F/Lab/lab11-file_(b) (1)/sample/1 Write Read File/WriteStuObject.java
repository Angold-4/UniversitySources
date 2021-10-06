// write object to a file

import java.io.*; //File I/O

public class WriteStuObject {
	public static void main(String[] args) {
		try {
			//student objects
			Student[] students = {	new Student("Ada", 19), 
									new Student("Ben", 20)
								 };
								 
			//create output file physically [note a new file will be actually created]
			FileOutputStream fout = new FileOutputStream("StuObjectFile.txt");
			
			//open file connection
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			//write student objects to the text file
			out.writeObject(students);

			//close all connections						
			out.close();
			fout.close();			
		
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	} 
}
