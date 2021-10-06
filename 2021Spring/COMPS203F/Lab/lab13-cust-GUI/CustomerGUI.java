import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class CustomerGUI extends JFrame implements ActionListener {
  private JLabel idLabel = new JLabel(" Customer ID : ");
  private JTextField id = new JTextField(10); 
  private JLabel nameLabel = new JLabel(" Customer Name : ");
  private JTextField name = new JTextField(30); 
  private JButton add = new JButton("Add");
  private JButton delete = new JButton("Delete");
  private JButton update = new JButton("Update");
  private JButton find = new JButton("Find");
  private JButton load = new JButton("Load");
  private JButton save = new JButton("Save");
  private JLabel messageLabel = new JLabel(" ");
  private JPanel labelPanel = new JPanel(new GridLayout(0,1));
  private JPanel textPanel = new JPanel(new GridLayout(0,1));
  private JPanel buttonPanel = new JPanel(new GridLayout(1,0));
  private JPanel bottomPanel = new JPanel(new GridLayout(2,1));
  
  private CustomerSystem customerSystem = new CustomerSystem();
    
  public CustomerGUI() {
    //setLayout(new FlowLayout());
    add(labelPanel, BorderLayout.WEST);
    add(textPanel, BorderLayout.CENTER);
    add(bottomPanel, BorderLayout.SOUTH);
    labelPanel.add(idLabel);
    labelPanel.add(nameLabel);
    textPanel.add(id);
    textPanel.add(name);
    buttonPanel.add(add);
    buttonPanel.add(delete);
    buttonPanel.add(update);
    buttonPanel.add(find);
    buttonPanel.add(load);
    buttonPanel.add(save);
    bottomPanel.add(buttonPanel);
    bottomPanel.add(messageLabel);
    add.addActionListener(this);
    delete.addActionListener(this);
    update.addActionListener(this);
    find.addActionListener(this);
    load.addActionListener(this);
    save.addActionListener(this);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
  }
  // event handling
  public void actionPerformed(ActionEvent event) {
    messageLabel.setText("");
    Object source = event.getSource();
    String id2 = id.getText().trim();
    String name2 = name.getText().trim();
    if (source == add) {
      add(id2, name2);
    } else if (source == delete) {
      delete(id2);
    } else if (source == update) {
      update(id2, name2);
    } else if (source == find) {
      find(id2, name2);
    } else if (source == load) {
      customerSystem.setCustomerMap(customerSystem.loadMap("customer.dat"));
      messageLabel.setText("Customer information loaded");
      System.out.println(customerSystem.getCustomerMap());
    } else if (source == save) {
      customerSystem.saveMap("customer.dat");
      messageLabel.setText("Customer information saved");
      System.out.println(customerSystem.getCustomerMap());
    }
  }
  public void add(String id, String name) {
    if (id.length() == 0 || name.length() == 0) {
      messageLabel.setText("id and name cannot be empty, id: "+id+", name: "+name);
      return;
    }
    Customer cust = customerSystem.add(id, name);
    if (cust == null)
      messageLabel.setText("Customer not found, id: "+id);
    else {
      messageLabel.setText("Customer added: "+cust);
      System.out.println(customerSystem.getCustomerMap());
    }
  }
  public void delete(String id) {
    if (id.length() == 0) {
      messageLabel.setText("id cannot be empty, id: "+id);
      return;
    }
    Customer cust = customerSystem.delete(id);
    if (cust == null)
      messageLabel.setText("Customer not found, id: "+id);
    else
      messageLabel.setText("Customer deleted: "+cust);
    System.out.println(customerSystem.getCustomerMap());
  }
  public void update(String id, String newName) {
    if (id.length() == 0 || newName.length() == 0) {
      messageLabel.setText("id and name cannot be empty, id: "+id+", name: "+newName);
      return;
    }
    Customer cust = customerSystem.update(id, newName);
    if (cust == null)
      messageLabel.setText("Customer information with id "+id+" not found");
    else
      messageLabel.setText("Customer information with id "+id+" updated, new name: "+newName);
    System.out.println(customerSystem.getCustomerMap());
  }
  public void find(String id, String partialName) {
    if (id.length() > 0) {
      Customer cust = customerSystem.findByID(id);
      if (cust == null)
        messageLabel.setText("Customer with id "+id+" not found");
      else {
        name.setText(cust.getName());
        messageLabel.setText("Customer with id "+id+" found, name: "+cust.getName());
      }
    } else {
      if (partialName.length() > 0) {
        java.util.List<Customer> custList = customerSystem.findByName(partialName);
        JOptionPane.showMessageDialog(this, "Customer with name matching "
          +partialName+"\n"+custList);
      } else {
        messageLabel.setText("Please enter id or name to search");
      }
    }
  }
  
  public static void main(String[] args) {
    CustomerGUI custGUI = new CustomerGUI();    
    custGUI.setVisible(true);    
  }
}

