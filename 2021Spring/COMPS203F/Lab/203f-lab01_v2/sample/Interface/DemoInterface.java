/*
interface Animal {
	public void type(); 		//abstract method without a body
	public int noOfLegs(); 	
	public boolean warmBlooded();
}
*/

//new class Rabbit
class Rabbit {
	
	private String breed;
	
	//constructor method
	public Rabbit(String aBreed){
		breed = aBreed;	
	}

	public String getBreed(){
		return breed;	
	}	
	
	public void type() {
		System.out.println("Type: Mammals");
	}
	
	public int noOfLegs() {
		return 4;
	}	
	
	public boolean warmBlooded(){
		return true;
	}  
}
	
class Snake {

	private String breed;
			
	//constructor method
	public Snake(){
		breed = "Rattlesnake";	
	}

	public String getBreed(){
		return breed;	
	}	
		
	public void type() {
		System.out.println("Type: Reptiles");
	}
	public int noOfLegs() {
		return 0;
	}	
	public boolean warmBlooded(){
		return false;
	}  
	
}

class DemoInterface {
	public static void main(String[] args) {
		
		//new object myRabbit
		Rabbit myRabbit = new Rabbit("American Fuzzy Lop");
		System.out.println("[Rabbit]");
		System.out.println("Breed: "+ myRabbit.getBreed());	
		myRabbit.type();
		System.out.println("no. of legs: "+ myRabbit.noOfLegs());
		System.out.println("warm-blooded: "+ myRabbit.warmBlooded());
		
		Snake mySnake = new Snake();
		System.out.println("\n\n[Snakes]");
		System.out.println("Breed: "+ mySnake.getBreed());	
		mySnake.type();
		System.out.println("no. of legs: "+ mySnake.noOfLegs());
		System.out.println("warm-blooded: "+ mySnake.warmBlooded());		
	}
}
