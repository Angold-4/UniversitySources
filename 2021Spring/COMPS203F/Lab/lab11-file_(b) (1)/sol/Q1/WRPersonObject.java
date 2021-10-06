import java.io.*;	//File I/O
import java.util.*;	//Arrays

public class WRPersonObject {

	public static void main(String[] args) {

		Person p1 = new Person("Rachel", 25, "Female");
		
		Person[] personArrOut = {	new Person("Ashley", 18, "Female"),
									new Person("Brian", 45, "Male"),
									new Person("Oscar", 16, "Male"),									
							 	};
							 
		Person[] personArrIn;

		try {
			FileOutputStream fout = new FileOutputStream(new File("PersonObjectFile.txt"));
			ObjectOutputStream out = new ObjectOutputStream(fout);

			// Write objects to file
			out.writeObject(p1);			
			out.writeObject(personArrOut);

			out.close();
			fout.close();

			FileInputStream fin = new FileInputStream(new File("PersonObjectFile.txt"));
			ObjectInputStream in = new ObjectInputStream(fin);

			// Read objects
			Person pr1 = (Person) in.readObject();
			personArrIn = (Person[]) in.readObject();			

			System.out.println(pr1+"\n");
			
			//print out array elements using Arrays.toString()
			System.out.println(Arrays.toString(personArrIn));			

			in.close();
			fin.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}