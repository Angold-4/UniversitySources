//define a superclass Vehicle

public class Vehicle {
	private int licenseNo;
	private String ownerName;
	private int noOfTransfer;

	//constructor method	
	public Vehicle(int licenseNo, String ownerName){
		this.licenseNo = licenseNo;
		this.ownerName = ownerName;
		noOfTransfer = 0;
	}	

	public void transferOwnership(String newOwner) {
		ownerName = newOwner;
		noOfTransfer++;
	}
	
    public String toString() {
        return licenseNo + ": " + ownerName+ " , " + noOfTransfer + "-hand";
    }	
}
