//Square is a subclass of Shape

public class Square extends Shape {
	
	//subclass's specific property		
	private int length;
	
	//constructor method
	public Square(int length, String name){ 	
		//call the superclass (Shape) constructor method
		super(name); 
		this.length = length; 
	} 

    //Override perimeter() with its own details	
	@Override
	public double perimeter(){
		return length*4;
	}
	
	@Override	
	public double area(){
		return length*length;
	}	
	
	@Override	
	public void drawShape(){
		int indentPos;		
		
		//get indentPos value		
		indentPos = getIndentPos();		
		
		for (int i=0; i<length; i++){
			
			//output indent position
			for (int k=0; k<indentPos; k++){
				System.out.print(" ");		
			}		
			//print line			
			for (int j=0; j<length; j++){
				System.out.print("*");
			}
			//set to next line
			System.out.println("");			
		}
	}
	
    //Override toString() with its own details	
	@Override		  
    public String toString() {
        return super.toString() + "length:" + length;
    }	
}
