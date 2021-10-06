// read object from a file

import java.io.*;	//File I/O
import java.util.*; //Arrays

public class ReadStuObject {
	public static void main(String[] args) {
		try {
			//new a student array object
			Student[] students;
			
			//set input file
			FileInputStream fin = new FileInputStream("StuObjectFile.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			
			//read data to student array
			students = (Student[]) in.readObject();
			
			//call Arrays.toString() to print out array elements
			System.out.println(Arrays.toString(students));
			
			//close all connections
			in.close();
			fin.close();			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
