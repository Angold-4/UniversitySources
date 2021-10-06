import java.io.*;
import java.util.*;
import org.json.*;

public class OrderProcess {
  private JSONArray jsonArray;
  
  public JSONArray getJsonArray() { 
      return jsonArray; 
  }  
  public void setJsonArray(JSONArray jsonArray) { 
    this.jsonArray = jsonArray; 
  }  
  public void printArray() {
    JSONObject element;
    for (int i=0; i<jsonArray.length(); i++) {
      element = (JSONObject) jsonArray.get(i);
      System.out.println("  id: "+element.get("id"));      
      System.out.println("  name: "+element.get("name"));
      System.out.println("  qty: "+element.get("qty"));
      System.out.println("  price: "+element.get("price"));      
    }
  }  
  //overload method printArray() 
  public void printArray(String aID){
    JSONObject element;    
    for (int i=0; i<jsonArray.length(); i++) {
      element = (JSONObject) jsonArray.get(i);            
      if (element.get("id").equals(aID)){   
        element = (JSONObject) jsonArray.get(i);
        System.out.println("  id: "+element.get("id"));      
        System.out.println("  name: "+element.get("name"));
        System.out.println("  qty: "+element.get("qty"));
        System.out.println("  price: "+element.get("price"));      
      }
    }
  }   
  public void printFilter(double aPrice) {
    JSONObject element;
    for (int i=0; i<jsonArray.length(); i++) {
      element = (JSONObject) jsonArray.get(i);
      if (Double.parseDouble(String.valueOf(element.get("price"))) > aPrice){
        System.out.println("  id: "+element.get("id"));      
        System.out.println("  name: "+element.get("name"));
        System.out.println("  qty: "+element.get("qty"));
        System.out.println("  price: "+element.get("price"));      
      }
    }  
  }

  public void printTotal() {
    JSONObject element;    
    double total = 0.0;
    for (int i=0; i<jsonArray.length(); i++) {
      element = (JSONObject) jsonArray.get(i);
        int qty = Integer.parseInt(String.valueOf(element.get("qty")));             
        double price = Double.parseDouble(String.valueOf(element.get("price")));          
        total += qty*price;
    }
    System.out.println("  Order Total: $" + total);                  
  }   
  
  public String findName(String aID) {
    JSONObject element;
    for (int i=0; i<jsonArray.length(); i++) {
      element = (JSONObject) jsonArray.get(i);
      if (element.get("id").equals(aID)) 
        return (String) element.get("name");
    }
    return null;
  }
  public boolean changeQty(String aID, String newQty) {
    JSONObject element;
    for (int i=0; i<jsonArray.length(); i++) {
      element = (JSONObject) jsonArray.get(i);
      if (element.get("id").equals(aID)) { 
        element.put("qty", newQty);
        return true;
      }
    }
    return false;
  }

  public JSONObject importJSON(String filename) throws Exception {
    try {
      String content = readFile(filename);
      if (content == null) return null;
      return new JSONObject(content);  
    } catch (JSONException e) {
      System.out.println("Import JSON problem: "+e.getMessage());
    }
    return null;
  }
  public String readFile(String filename) {
    String content = "";
    try {
      BufferedReader in = new BufferedReader(new FileReader(filename));
      String line;
      while ((line = in.readLine()) != null) 
        content += line;
      in.close();
    } catch (IOException e) {
      System.out.println("File read problem: "+e.getMessage());
      return null;
    }
    return content;
  }
  public JSONObject exportJSON(String filename) {
    try {
      PrintWriter out = new PrintWriter(new BufferedWriter(
                        new FileWriter(filename)));
      JSONObject jsonObject = new JSONObject().put("order", 
                        new JSONObject().put("product", jsonArray));
      out.println(jsonObject);
      out.close();
      return jsonObject;
    } catch (IOException e) {
      System.out.println("Export JSON problem: "+e.getMessage());
    }
    return null;
  }
  public static void main(String[] args) {
    OrderProcess json = new OrderProcess();
    String jsonFile = "json/order.json";
    System.out.println("import json file: "+jsonFile);
    JSONObject jsonObject = null;
    try {
      jsonObject = json.importJSON(jsonFile);
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("All: \n  "+jsonObject);
    JSONObject order = (JSONObject) jsonObject.get("order");
    System.out.println("order: \n  "+order);
    JSONArray product = (JSONArray) order.get("product");
    json.setJsonArray(product);
    
    System.out.println("\nprint all element list:");        
    json.printArray();  

    System.out.println("\nprint element list for ID 1003:");
    json.printArray("1003");      
    
    System.out.println("\nprint element list for price > 10");    
    json.printFilter(10.0);

    System.out.println("\nprint order total:");         
    json.printTotal();     
    
    String aID = "1002";
    System.out.println("\nfind name of ID "+aID +":");    
    System.out.println("  "+ json.findName(aID));
    
    System.out.println("\nchange qty of 1002:");
    json.changeQty("1002", "18");
    json.printArray("1002"); 
    
    String newJsonFile = "json/order_output.json";
    System.out.println("\nexporting to "+newJsonFile);    
    System.out.println("  "+json.exportJSON(newJsonFile));    
  }  
}