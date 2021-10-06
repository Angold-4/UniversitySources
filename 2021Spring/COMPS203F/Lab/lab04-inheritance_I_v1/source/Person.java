//Person is a superclass

public class Person {
   //attributes
    private String name;
    private int id;
   
   //constructor
   public Person(String n, int i) {
       name = n;
       id = i;
   }
   
   //toString method
   @Override
   public String toString() {
       return name + "(" + Integer.toString(id) + ")";
   }
   
}
