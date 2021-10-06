//Rectangle is a subclass of Shape

public class Rectangle extends Shape{ 
	private int length;
	private int width; 
	
	// constructor method
	public Rectangle(int length, int width, String name){ 
		super(name); 
		this.length = length; 
		this.width = width; 
	} 
	
	@Override
	public double perimeter(){
		return (length+width)*2;
	}
	
	@Override	
	public double area(){
		return length*width;
	}	
	
	@Override	
	public void drawShape(){
		int indentPos;		
		indentPos = getIndentPos();	
				
		for (int i=0; i<width; i++){			
			for (int k=0; k<indentPos; k++){
				System.out.print(" ");		
			}			
			for (int j=0; j<length; j++){
				System.out.print("*");
			}
			System.out.println("");			
		}
	}  

	@Override		  
    public String toString(){
        return super.toString() + "length:" + length + " width:" + width;
    }		
}
