import java.util.*; 
  
class ArrayListDemo
{ 
    public static void main(String[]args) 
    { 
        //***Example 1 - an ArrayList of String values
		System.out.println("\n\n**Example 1 - an ArrayList containing String type values***\n");            
        
        // Creating an ArrayList of String
        ArrayList<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Rabbit");
        animals.add("Fox");

        System.out.println(animals + "\n");

        // Adding an element at a particular index in an ArrayList                        
        animals.add(2, "Cat");                
        animals.add(3, "Dog");

        System.out.println(animals + "\n");

        // Modify an element at a duplicate index in an ArrayList
        animals.add(2, "Bear");

        System.out.println(animals + "\n");

        // Iterating over list items 
        System.out.println("Iterating over list:"); 
	    for (String aString :animals)
	      System.out.println(aString);        
        
     	// Retrieve the element at a given index        
        System.out.println("\nRetrieve the element at a given index:");
        System.out.println("call animals.get(1): " + animals.get(1));     	
        
        System.out.println("call animals.get(animals.size() - 1): " + animals.get(animals.size() - 1) + "\n");     	        

        
        // Check if an ArrayList contains a given element
        System.out.println("Does animals list contain \"Cat\"? : " + animals.contains("Cat"));        
        System.out.println("Does animals list contain \"Whale\"? : " + animals.contains("Whale"));

        // Find the index of the first occurrence of an element in an ArrayList
        System.out.println("\nindexOf \"Cat\": " + animals.indexOf("Cat"));        	      
        System.out.println("indexOf \"Whale\": " + animals.indexOf("Whale"));        	              
        
        
        //***Example 2 - an ArrayList of Integer values
		System.out.println("\n\n**Example 2 - an ArrayList containing Integer type values***\n");    
		
		ArrayList<Integer> iList = new ArrayList<>();

		iList.add(5);				
		iList.add(3);
		iList.add(8);
		iList.add(2);
		iList.add(6);	
		iList.add(3);				

		System.out.println("Original list:\n"+ iList); 
		
		//remove the element at the specified index and some elements shifted to left
 		System.out.println("\nremoved the element at index (3) and some elements shifted to left:");		
		iList.remove(3);		
		System.out.println(iList);
				
				
		//remove the first occurrence of an integer value 3 from the list 
 		System.out.println("\nremoved the first occurrence of an integer value 3 from the list:");				
		iList.remove(new Integer(3));
		
		System.out.println(iList);
    } 
} 