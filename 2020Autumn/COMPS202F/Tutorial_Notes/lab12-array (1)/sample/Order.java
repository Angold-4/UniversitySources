//prepared by Terri Wong

import java.util.*;

class Order{
    private Item[] itemArr = new Item[3];
    
    //constructor with no parameter
	public Order(){
        itemArr[0] = new Item("red wine", 6);
        itemArr[1] = new Item("coke", 5);        
        itemArr[2] = new Item("beer", 3);   	
	}
	
    //constructor with three parameter	
	public Order(Item i1, Item i2, Item i3){
		itemArr[0] = i1;
        itemArr[1] = i2;  
        itemArr[2] = i3; 	//[note]: observe the result if this line of code is not executed
	}		
	
	
    //getter method
    public Item[] getItemArr() {
        return itemArr;
    }
	

    //copy an order object (using Array) to another object (using HashSet)
    public HashSet<Item> copy() {
	    
	    //create a set	 
        HashSet<Item> NewItemSet = new HashSet<>();
        
        //i.e. add the item from order1 into the newItemArr object
        for (Item i : itemArr) {
        	NewItemSet.add(i);
        }
        
        return NewItemSet;
    }
	        
    
    public static void main(String[] args) {

        // Create an Array Order1 of Item objects
        Order order1 = new Order();    
		
        //get the items to local array
        Item[] itemArr1 = order1.getItemArr();        
        System.out.println("Order1 contains the item array as:");       
        
        //print out the array elements
        for (int i=0; i<itemArr1.length; i++)         
        	System.out.println(itemArr1[i]);    
            
        // Create an Array Order2 of Item objects        
      	Order order2 = new Order(new Item("tea", 4), new Item("beer", 10), new Item("yogurt", 2));      	
        Item[] itemArr2 = order2.getItemArr();        
        
        System.out.println("\nOrder2 contains the item array as:");       
        for (int i=0; i<itemArr2.length; i++)         
        	System.out.println(itemArr2[i]);     

        System.out.println("\nOrder2 contains the item array as (excluding NULL values):");  
        for (int i=0; i<itemArr2.length; i++)         
        	if (itemArr2[i] != null)
        		System.out.println(itemArr2[i]);     
                	
		//copy an order object (using Array) to another object (using HashSet)
        System.out.println("\ncopy order1 from Array to HashSet: " + order1.copy());		        
              
	}
}
