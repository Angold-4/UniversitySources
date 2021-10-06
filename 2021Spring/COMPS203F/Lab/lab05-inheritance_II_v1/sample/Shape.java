/* 	Shape is an abstract class which have
	non-abstract methods and abstract methods
*/

public abstract class Shape{ 
	//abstract class can have its own properties
	private String objectName; 
	private static int indentPos = 4; //will get memory only once and retain its value  
	
	//constructor method
	public Shape(String objectName){ 
		this.objectName = objectName; 
	} 
	
	// setter method
	// non-abstract method which has its default implementation details	
	public void setIndentPos(int newIndentPos){ 
		//set indent position
		indentPos = newIndentPos;
	} 
	
	// getter method	
	public int getIndentPos(){
		return indentPos;
	}

    public String toString(){
        return "\n[" + objectName + "]\n" + "indent:" + indentPos + " ";
    }
    		
	// abstract methods which will be implemented by its subclasses i.e. Classes Square and Rectangle
    // overide
	public abstract double perimeter(); 	
	public abstract double area(); 	
	public abstract void drawShape();	
} 

