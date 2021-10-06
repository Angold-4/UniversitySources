//Student is a subclass of Person
import java.util.*; 

public class Student extends Person {
   //attributes	
   private ArrayList<String> courseList = new ArrayList<>();   
   private ArrayList<Integer> gradeList = new ArrayList<>();      
   
   //constructor
   public Student(String name, int id) {
       super(name, id);
   }
   
   //toString method
   public String toString() {
       return "[Student]" + "\n" +  super.toString();
   }

   //addResult method
   public void addResult(String course, int grade) {
       courseList.add(course);
       gradeList.add(grade);
   }

   //printGrades method
   public void printGrades() {
      for (int i = 0; i < courseList.size(); i++) {
         System.out.print(courseList.get(i) + ":" + gradeList.get(i) + " ");
      }
      System.out.print('\n');
   } 

   //getAverageGrade method
   public double getAverageGrade() {
       double avg = 0;

       for (int g : gradeList) {
           avg += g;
       }
       avg = avg / gradeList.size();
       return avg;
   }
}
