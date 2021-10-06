public class TestStudent {
  public static void main(String[] args) {
	  
    Student john = new Student("John", 20);
    Student peter = new Student("Peter",19);
    peter = john;
        
    System.out.println(john);
    System.out.println(peter);
    john.setAge(29);
    System.out.println(peter);
  }
}
