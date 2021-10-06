import java.io.*;	//File I/O
import java.util.*;	//Arrays

public class WRPersonObject {

	public static void main(String[] args) {

		Person p1 = new Person(___________________);
		
		Person[] personArrOut = {	new Person(____________________),
									_______________________________,
									_______________________________,
							 	};
							 
		Person[] personArrIn;

		try {
			FileOutputStream fout = new FileOutputStream(new File(_____________________________));
			ObjectOutputStream out = new ObjectOutputStream(_____________);

			//Write objects to file

			//Read objects
					
			//print out array elements using Arrays.toString()


		} catch (IOException e) {
			__________________________________;
		} catch (________________________) {
			__________________________________;
		}
	}
}