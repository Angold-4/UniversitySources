import java.util.*;
import java.io.*;

public class CustomerSystem implements Serializable {
  private Map<String,Customer> customerMap = new HashMap<>();
  public Map<String,Customer> getCustomerMap() { return customerMap; }
  public void setCustomerMap(Map<String,Customer> aMap) { customerMap = aMap; }

  public Customer add(String id, String name) {
    if (id.length() > 0 && name.length() > 0 && !customerMap.containsKey(id)) {
      Customer cust = new Customer(id, name);
      customerMap.put(id, cust);
      return cust;
    } else {
      return null;
    }
  }
  public Customer delete(String id) {
    return customerMap.remove(id);
  }
  public Customer update(String id, String name) {
    if (customerMap.containsKey(id)) {
      Customer cust = new Customer(id, name);
      customerMap.put(id, cust);
      return cust;
    } else {
      return null;
    }
  }
  public Customer findByID(String id) {
    return customerMap.get(id);
  }
  public List<Customer> findByName(String partialName) {
    List<Customer> custList = new ArrayList<>();
    for (Customer customer : customerMap.values()) {
      if (customer.getName().indexOf(partialName) >= 0) {
        custList.add(customer);
      }
    }
    return custList;
  }
  public boolean saveMap(String filename) {
    try {
      ObjectOutputStream out = new ObjectOutputStream(
                               new FileOutputStream(filename));
      out.writeObject(customerMap);
      out.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
      return false;
    }
    return true;
  } 
  public Map<String,Customer> loadMap(String filename) {
    Map<String,Customer> inMap = null;
    try {
      ObjectInputStream in = new ObjectInputStream(
                              new FileInputStream(filename));
      inMap = (Map<String,Customer>) in.readObject();
      in.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
      return null;
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
      return null;
    }
    return inMap;
  } 
}
class Customer implements Serializable {
  private String id;
  private String name;
  public Customer(String id, String name) {
    this.id = id;
    this.name = name;
  }
  public String getId() { return id; }
  public void setId(String id) { this.id = id; }
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public String toString() { return id + "," + name; }
}
