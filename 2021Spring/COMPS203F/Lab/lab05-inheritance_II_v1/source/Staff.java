/*
 * Q1 a,b
public class Staff {
	//Note: you may need to change Staff to abstract class starting from Q1 (iii)
    private String id;
    private String name;

    public Staff(String i, String n) {
        this.id = i; 
        this.name = n;
    }
    @Override
    public String toString() {
        return id + ": " + name;
    }
	
}
*/

public abstract class Staff{
    //abstract class can have its own properties
    private String id;
    private String name;

    public Staff(String i, String n) {
        this.id = i;
        this.name = n;
    }

    public String toString() {
        return id + ": " + name;
    }

    // abstract methods which will be implemented by its subclasses
    public abstract double findSalary();

} 
