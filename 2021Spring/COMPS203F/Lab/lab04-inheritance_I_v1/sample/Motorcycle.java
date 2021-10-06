//Motorcycle is a subclass of Vehicle

public class Motorcycle extends Vehicle {
	
	//subclass's specific property
	private boolean hasSidecar;
	
	//constructor method
    public Motorcycle(int licenseNo, String ownerName, boolean anSidecar){	    
        super(licenseNo, ownerName);
        hasSidecar = anSidecar;
    }

	//Override method toString() with its own details  
    public String toString() {
        return super.toString() + ", Motorcycle, " + " has side car: " + hasSidecar;
    }

    //find the total no. of seats     
    public double findSeats() {
        if (hasSidecar == true)
        	return 3;
        else
        	return 2;
    }	
	
}	
