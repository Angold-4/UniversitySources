import java.io.*;
import java.util.*;
import org.json.*;

public class JSONProcess {
  private JSONArray jsonArray;
  
  public JSONArray getJsonArray() { return jsonArray; }
  public void setJsonArray(JSONArray jsonArray) { 
    this.jsonArray = jsonArray; 
  }
  
  public void printArray() {
    JSONObject element;
    for (int i=0; i<jsonArray.length(); i++) {
      element = (JSONObject) jsonArray.get(i);
      System.out.println("  name: "+element.get("name"));
      System.out.println("  phone: "+element.get("phone"));
    }
  }
  public String findPhone(String name) {
    JSONObject element;
    for (int i=0; i<jsonArray.length(); i++) {
      element = (JSONObject) jsonArray.get(i);
      if (element.get("name").equals(name)) 
        return (String) element.get("phone");
    }
    return null;
  }
  public boolean changePhone(String name, String newPhone) {
    JSONObject element;
    for (int i=0; i<jsonArray.length(); i++) {
      element = (JSONObject) jsonArray.get(i);
      if (element.get("name").equals(name)) { 
        element.put("phone", newPhone);
        return true;
      }
    }
    return false;
  }
  public JSONObject deleteStudent(String name) {
    JSONObject element;
    for (int i=0; i<jsonArray.length(); i++) {
      element = (JSONObject) jsonArray.get(i);
      if (element.get("name").equals(name)) {
        return (JSONObject)jsonArray.remove(i);
      }
    } 
    return null;
  }
  public JSONArray addStudent(String name, String phone) {
    return jsonArray.put(new JSONObject()
                         .put("name", name)
                         .put("phone", phone)
                         );
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
      JSONObject jsonObject = new JSONObject().put("university", 
                        new JSONObject().put("student", jsonArray));
      out.println(jsonObject);
      out.close();
      return jsonObject;
    } catch (IOException e) {
      System.out.println("Export JSON problem: "+e.getMessage());
    }
    return null;
  }
  public static void main(String[] args) {
    JSONProcess json = new JSONProcess();
    String jsonFile = "json/university.json";
    System.out.println("import json file: "+jsonFile);
    JSONObject jsonObject = null;
    try {
      jsonObject = json.importJSON(jsonFile);
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("All: \n  "+jsonObject);
    JSONObject university = (JSONObject) jsonObject.get("university");
    System.out.println("university: \n  "+university);
    JSONArray student = (JSONArray) university.get("student");
    json.setJsonArray(student);
    json.printArray();  
    String aName = "Cat Lee";
    System.out.println("find phone number of "+aName);
    System.out.println("  "+aName + "'s Phone no.: " + json.findPhone(aName));
    System.out.println("change phone number of Cat...");
    json.changePhone(aName, "66778899");
    json.printArray();    
    System.out.println("delete student Ben: "+json.deleteStudent("Ben Wong"));
    json.printArray();    
    System.out.println("add student Rachel... ");
    json.addStudent("Rachel Chan", "99001122");
    json.printArray();    
    String newJsonFile = "json/university_output.json";
    System.out.println("exporting to "+newJsonFile);    
    System.out.println("  "+json.exportJSON(newJsonFile));    
  }  
}