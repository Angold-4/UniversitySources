import java.util.*;

public class CollectionTasks {

  public static void trySet() {
	  
    HashSet<Object> objSet = new HashSet<>();
    
    objSet.add("Hello World");
    objSet.add(88);
    objSet.add(88);

    System.out.println(objSet);    
    System.out.println(objSet.size()+"\n");
            
    HashSet<String> stringSet = new HashSet<>();
    
    stringSet.add("202F");
    stringSet.add("311F");    
    objSet.add(stringSet);
    
    System.out.println(objSet);
    System.out.println(objSet.size()+"\n");
    
    for (Object obj : objSet)
      System.out.println(obj);
      
    if (objSet.contains("Hello World"))
      System.out.println("\nThe set contains the string \"Hello World\""+"\n");
  }

  public static void tryList() {
	  
    ArrayList<Integer> aList = new ArrayList<>();
    
    aList.add(0, 1);
    aList.add(1, 2);
    aList.add(2, 3);  //replace this line with aList.add(3, 3) shows error
    
    System.out.println("The list contains: " + aList);
    
    System.out.println("\nIterating over list:"); 
    for (Integer i : aList) 
      System.out.println(i);
      
    System.out.println("\nElement with index 2: " + aList.get(2));    
 
    aList.add(4);
    System.out.println("\nAdd value 4 to the end of the list: " + aList);
    
    aList.remove(new Integer(3));
    System.out.println("\nRemove an integer 3 from the list: " + aList);
  }

  public static void main(String[] args) {
    CollectionTasks.trySet();
    CollectionTasks.tryList();
  }
}