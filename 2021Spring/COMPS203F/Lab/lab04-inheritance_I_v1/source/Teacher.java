//Teacher is a subclass of Person
import java.util.*; 

public class Teacher extends Person {
	//attribute
    ArrayList<String> courceList = new ArrayList<>();
	
	//constructor
    public Teacher(String name, int id) {
        super(name, id);
    }
	
	//toString method
    public String toString() {
        return "[Teacher]" + "\n" + super.toString();
        
    }
   
	public boolean addCourse(String aCourse) {
		// Check if the course already existed in the courseList
		for (String s : courceList){
			if (s.equals(aCourse)) return false;
		}
        courceList.add(aCourse);
        return true;
		//the course is not in the courseList, add the course to it
	}

}
   
