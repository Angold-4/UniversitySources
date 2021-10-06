public class ArrayDemo {
	public static void main(String[] args) {
		
		//***Example 1 - a double type Array
		//declare an array (double type with 5 elements)
		double[] NumArr = {1, 3.9, 5, 6.3, 1};
		
		// Print out array
		System.out.println("***Example 1 - an Array (double type)");		
		System.out.println("Iterating the array:");			
		for (int i = 0; i < NumArr.length; i++) {
			System.out.println(NumArr[i]);
		}
		
		// Print out array using enhanced for-loop
		System.out.println("\nIterating the array (using enhanced for-loop):");	
		for (double i: NumArr) {
			System.out.println(i);
		}		
		
		// Sum all elements
		double total = 0;
		for (int i = 0; i < NumArr.length; i++) {
			total += NumArr[i];
		}
		
		System.out.println("\nSum of array: " + total);	  
		
		
		
		//***Example 2 - a String type Array	
		//declare an array (String type with 5 elements)
		String[] StringArr = new String[5];
		
		StringArr[0] = "Cat";
		StringArr[1] = "Fox"; 
		StringArr[2] = "Bear";
		StringArr[3] = "Fox";
		//[note]: StringArr[4] contains no/null values

		
		// Print out array 
		System.out.println("\n\n***Example 2 - an Array (String type)");		
		System.out.println("Iterating the array:");			
		for (int i = 0; i < StringArr.length; i++) {
			System.out.println(StringArr[i]);
		}	
		
		//add "Dog" to index[4] of StringArr
		System.out.println("\nAdded \"Dog\" to index[4] of StringArr");	
		StringArr[4] = "Dog";
					
		//print out array using enhanced for loop
		System.out.println("\nPrint out array (using enhanced for loop):");		
		for (String i: StringArr) {
			System.out.println(i);
		}	

			  
	}
}