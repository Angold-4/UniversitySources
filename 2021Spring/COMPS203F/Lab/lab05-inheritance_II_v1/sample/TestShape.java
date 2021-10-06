public class TestShape{ 
	public static void main (String[] args) { 
	
		// create the Object of Square class 
		// and use Shape class reference
		Shape mySquare = new Square(3, "Square"); //Square constructor method is called		

		//Shape myShape = new Shape(3, "Square"); // this line causes error: Shape is abstract and cannot be instantiated
				
		//call toString()
		System.out.println(mySquare);
		
		//call member methods
		System.out.println("perimeter: "+ mySquare.perimeter());	
		System.out.println("area: "+ mySquare.area());		
		System.out.println("\ndrawShape: ");
		
		//note the indent is set to 4 through the line "static int indentPos = 4" in Shape.java
		mySquare.drawShape();	
				
		Shape myRectangle = new Rectangle(5, 2, "Rectangle");
		System.out.println(myRectangle);		
		System.out.println("perimeter: "+ myRectangle.perimeter());	
		System.out.println("area: "+ myRectangle.area());
		System.out.println("\ndrawShape: ");
		myRectangle.drawShape();		
		
		System.out.println("\nAfter setting Square\'s indent position to 8");
		//set indent position
		mySquare.setIndentPos(8);
		
		//print out Square details
		System.out.println(mySquare);		
		mySquare.drawShape();			
		
		//print out Rectangle details, notice the indent position also changed		
		System.out.println(myRectangle);		
		myRectangle.drawShape();			
	} 
} 


