import java.util.*;

class Order{
    private ArrayList<Item> itemList = new ArrayList<>();
	
    //add item to itemList
    public void addItem(Item aItem) {
        itemList.add(aItem);
    }
	
    //getter method
    public ArrayList<Item> getItemList() {
        return itemList;
    }
	
    //count the no. of occurrence of a specified product
    public int count(String inProduct) {
	    int count = 0;

        for (Item anItem : itemList) {	    
        	if (inProduct.equals(anItem.getProduct()))  // should not use == for comparing String object
            	count++;
    	}
    	return count;
    }    
    
    public static void main(String[] args) {

        // Create an ArrayList Order1 of Item objects
        Order order1 = new Order();
        
        Item item1 = new Item("red wine", 6);
        Item item2 = new Item("coke", 5);        
        Item item3 = new Item("beer", 3);        
        
        order1.addItem(item1);
        order1.addItem(item2);
        order1.addItem(item3);                
        order1.addItem(item2);  //allow duplicate items in list                  

        System.out.println("Order1 contains the itemList as:");          
        System.out.println(order1.getItemList());    
            
        // Create an ArrayList Order2 of Item objects        
      	Order order2 = new Order();
        
        Item item4 = new Item("tea", 4);
        Item item5 = new Item("beer", 10);        

        order2.addItem(item4);
        order2.addItem(item5);

        System.out.println("\nOrder2 contains the itemList as:");                  
        System.out.println(order2.getItemList());  //call the getter method
	
        System.out.println("\nNumber of occurrences of \"coke\" in order1: " + order1.count("coke"));		
        System.out.println("Number of occurrences of \"coke\" in order2: " + order2.count("coke"));	             
	}
}

