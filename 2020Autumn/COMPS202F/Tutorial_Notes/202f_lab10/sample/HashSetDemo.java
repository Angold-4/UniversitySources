import java.util.*; 
  
class HashSetDemo
{ 
    public static void main(String[]args) 
    { 
        HashSet<String> place = new HashSet<>(); 
  
        //***Example 1 - a set containing String type values
        
        // Adding elements into HashSet usind add() 
        // The order of the elements in the set is unknown
        place.add("Hong Kong"); 
        place.add("Australia"); 
        place.add("South Africa"); 
        
        // sets do not contains duplicated items     
        place.add("Hong Kong");
        
        // Displaying the set 
		System.out.println("**Example 1 - a set containing String type values***\n");        
        System.out.println("Display the set (order is unknown):\n" + place); 
        
		//check if the set 
    	System.out.println("\nChecking the set:");		
        if (place.contains("Hong Kong"))        
    		System.out.println("The set contains Hong Kong\n");
    	else
    		System.out.println("The set does not contains Hong Kong\n");
  
        // Removing items from set using remove() 
        place.remove("Australia"); 
        System.out.println("The set after removing Australia:\n"+place); 
  
        // Iterating over set items 
        System.out.println("\nIterating over set:"); 
	    for (String aString : place)
	      System.out.println(aString);
	      
        //***Example 2 - a set containing Object type values
		System.out.println("\n\n**Example 2 - a set containing Object type values***\n");    
		    
        // Adding elements into HashSet with String and Integer typed values        
		HashSet<Object> objSet = new HashSet<>(); 		        
		
		//String type values
        objSet.add("apple");
        objSet.add("orange");         
        
		//Integer type values        
        objSet.add(1);
        objSet.add(2);

    	System.out.println("Display objSet: "+ objSet);    	        
                
        //create another HashSet with Integer type
    	HashSet<Integer> intSet = new HashSet<>();
    
    	intSet.add(333);        
    	intSet.add(999);            	
    	System.out.println("Display IntSet: "+ intSet);
    	
    	//add intSet into objSet
    	objSet.add(intSet);        
    	System.out.println("Display objSet (After adding IntSet): "+ objSet);    	
    } 
} 