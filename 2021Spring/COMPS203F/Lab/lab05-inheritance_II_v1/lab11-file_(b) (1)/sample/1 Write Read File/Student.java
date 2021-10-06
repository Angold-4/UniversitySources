import java.io.*;

public class Student implements Serializable {
  private String name;
  private int age;
  
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  public String toString() { 
    return "(" + name + ", " + age +")"; 
  }
}
