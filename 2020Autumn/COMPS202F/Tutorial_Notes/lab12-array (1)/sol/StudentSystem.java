public class StudentSystem {
  private Student[] studentArr = new Student[5];
  
  public StudentSystem() {
    studentArr[0] = new Student("John", 20);
    studentArr[2] = new Student("Kitty", 19);
    studentArr[3] = new Student("Ken", 22);
    //studentArr[4] = null;	//set null to array;
        
  }
  
  public Student[] getStudent() {
    return studentArr;
  }
  
  public Student findYoungestStudent() {
    Student youngest = studentArr[0];
    for (int i=0; i<studentArr.length; i++) {
      if (studentArr[i] != null) 
        if (studentArr[i].getAge() < youngest.getAge())
          youngest = studentArr[i];
    }    
    return youngest;
  }
  
  public void updateAge(String aName, int newAge) {
    for (int i=0; i<studentArr.length; i++) {
      if (studentArr[i] != null) 
        if (studentArr[i].getName().equals(aName)) {
          studentArr[i].setAge(newAge);
        }
    }    
  }
}