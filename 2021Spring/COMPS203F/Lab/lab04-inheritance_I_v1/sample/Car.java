//Car is a subclass of Vehicle

public class Car extends Vehicle {	
	//subclass's specific property	
	private int noOfSeats;	
	
	//constructor method
    public Car(int licenseNo, String ownerName, int noOfSeats){	    
		//call the superclass (Vehicle) constructor method
        super(licenseNo, ownerName);        
        this.noOfSeats = noOfSeats;
    }

    //Override method toString() with its own details
    public String toString() {	    
	    //call the superclass (Vehicle) member method using super.toString()
        return super.toString() + ", Car, " + noOfSeats + "-seat";
    }
	
    //find the total no. of seats 
    public double findSeats() {
        return noOfSeats;
    }	
	
}	
