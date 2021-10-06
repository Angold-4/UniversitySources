public class TestStudentSystem {
  public static void main(String[] args) {	  
	  
    StudentSystem record = new StudentSystem();   
     
    Student[] stud = record.getStudent();
    
    for (int i=0; i<stud.length; i++) {
        System.out.println("Student["+i+"]: " + stud[i]);
    }
    
    System.out.println("\nThe youngest student: "+record.findYoungestStudent());
    
    record.updateAge("John", 18);    
    System.out.println("\nAfter updating John's age to 18:");
    
    for (int i=0; i<stud.length; i++) {
        System.out.println("Student["+i+"]: " + stud[i]);
    }
  }
}