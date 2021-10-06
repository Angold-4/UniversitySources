import java.io.*;
import java.util.*;
import org.json.*;

public class OrderCreate {
  public static void main(String[] args) {
    JSONArray orderArray = new JSONArray();
    orderArray.put(new JSONObject()
                     .put("id", "1001")
                     .put("name", "coke") 
                     .put("qty", "10")
                     .put("price", "5.5"));                            

    orderArray.put(new JSONObject()
                     .put("id", "1002")
                     .put("name", "tea") 
                     .put("qty", "4")
                     .put("price", "16.3"));                            

    orderArray.put(new JSONObject()
                     .put("id", "1003")
                     .put("name", "butter") 
                     .put("qty", "2")
                     .put("price", "23"));                            
    
    JSONObject product = new JSONObject().put("product", orderArray);

    JSONObject json = new JSONObject().put("order", product);
    
    try {
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("json/order.json")));
      out.println(json);
      out.close();
    } catch (IOException e) {
      System.out.println("Export JSON problem: "+e.getMessage());
    }
    System.out.println(json);
  }
}
