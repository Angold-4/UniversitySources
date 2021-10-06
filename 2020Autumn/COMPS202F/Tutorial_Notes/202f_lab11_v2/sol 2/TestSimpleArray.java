public class TestSimpleArray {
  public static void main(String[] args) {
	  
    SimpleArray array = new SimpleArray();
    
    System.out.println("Maximum is " + array.findMaximum());
    System.out.println("Average is " + array.findAverage());
    
	int value =3;
		    
	if (array.exists(value))
		System.out.println("\nThe value "+value+" exists in courseCount\n");
	else 
		System.out.println("\nThe value "+value+" does not exist in courseCount\n");
		
	array.findDuplicate();
  }
}