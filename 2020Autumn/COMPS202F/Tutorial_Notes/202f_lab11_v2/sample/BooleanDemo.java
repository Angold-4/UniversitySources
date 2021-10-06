public class BooleanDemo{

	private int num = 5;
	
    public boolean isEvenNum(int anNum) {
		boolean result;
		
		if (anNum % 2 == 0)
			result = true;
		else 
			result = false;
			
        return result;
    }

    public boolean isEqual(int anNum) {
		boolean result;
		
		switch (anNum){
			case 5:
				result = true;		
				break;
			default:
				result = false;
				break;
		}
		return result;
    }    
    
    public static void main(String[] args) {
		
	    BooleanDemo test = new BooleanDemo();
	    
	    boolean result;
	    
	    for (int i=1; i<=5; i++){
	    	result = test.isEvenNum(i);
	    	
		    if (result == true)
		        System.out.println(i + " is even no.");
		    else 
		        System.out.println(i + " is not even no.");
    	}
    	
		System.out.println("\nIs 3 equals to 5? " + test.isEqual(3));    	
    	
    }
}