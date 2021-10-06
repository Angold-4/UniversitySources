import java.io.*;
import java.util.*;
import org.json.*;

public class JSONCreate {
  public static void main(String[] args) {
    JSONArray studentArray = new JSONArray();
    studentArray.put(new JSONObject()
                     .put("name", "Ben Wong")
                     .put("phone", "99887766") );
    System.out.println(studentArray);
    studentArray.put(new JSONObject()
                     .put("name", "Cat Lee")
                     .put("phone", "99112233") );
    System.out.println(studentArray);    
    JSONObject student = new JSONObject().put("student", studentArray);
    System.out.println(student);
    JSONObject json = new JSONObject().put("university", student);
    System.out.println(json);    
    
    try {
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("json/university.json")));
      out.println(json);
      out.close();
    } catch (IOException e) {
      System.out.println("Export JSON problem: "+e.getMessage());
    }    
    
  }
}
