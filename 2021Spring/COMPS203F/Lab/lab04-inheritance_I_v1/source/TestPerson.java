import java.util.*;

public class TestPerson {
   public static void main(String[] args) {
	   
	  //===Test Person class====
	  
      //call toString()
      Person person1 = new Person("Emma Lam", 8899);
      System.out.println(person1);
	   
      //===Test Student class===
      Student student1 = new Student("John lee", 1122);

      student1.addResult("COMPS202F", 54);
      student1.addResult("COMPS203F", 63);
      
      //call toString()
      System.out.println(student1);

      //call printGrades()
      student1.printGrades();
      
      //call getAverageGrade()
      double average = student1.getAverageGrade();
      System.out.println("Average:" + average);

      
      //===Test Teacher class     
      Teacher teacher1 = new Teacher("Alvin Chan", 5566);
      System.out.println(teacher1);

      //add courses to an array with String type
      String[] courses = {"COMPS203F", "COMPS358F", "COMPS203F", "ITS102F"};
	  
      //call addCourse using for loop
      for (String cs : courses) {
         if (teacher1.addCourse(cs)) {
            System.out.println(cs + " added." + "\n");
         } 
         else {
            System.out.println(cs + " duplicated and not added." + "\n");
         }
         
      }
      
   }
}
