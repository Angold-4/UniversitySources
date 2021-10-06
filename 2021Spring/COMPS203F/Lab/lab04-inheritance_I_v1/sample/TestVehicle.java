public class TestVehicle {
	public static void main(String[] args) {
		//Test Car class
		Car newCar = new Car(2310, "Ashley", 5);
		
		//call toString()
		System.out.println("[Car]\n" +  newCar);		
		
		//call findSeats()
		System.out.println("call method findSeats(): " + newCar.findSeats());				
		
		//call transferOwnership() once
		newCar.transferOwnership("Tom");
		
		//call toString()
		System.out.println("\nAfter calling method transferOwnership()");								
		System.out.println(newCar);				
		
		//an array of owners
		String[] owners = {"Ryan", "James", "Emily"};
		
		//call method transferOwnership() using for loop
		for (String owner: owners) {
			newCar.transferOwnership(owner);
			System.out.println(newCar);
		}		
		
		//Test Motorcycle class
		Motorcycle newMotor = new Motorcycle(6233, "Joe", true);
		System.out.println("\n[Motorcycle]\n" + newMotor);		
		System.out.println("call method findSeats(): " + newMotor.findSeats());			
		
	}	
}
