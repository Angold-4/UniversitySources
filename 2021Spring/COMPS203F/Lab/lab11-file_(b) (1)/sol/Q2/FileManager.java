import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FileManager extends JFrame implements ActionListener {
  private JTextField textField = new JTextField(20);
  private JButton button = new JButton("List");
  
  private JMenuBar menuBar = new JMenuBar();
  private JMenu actionMenu = new JMenu("Action");
  private JMenuItem renameItem = new JMenuItem("Rename");
  private JMenuItem deleteItem = new JMenuItem("Delete");

  private String fileName;

  public FileManager() {
    super("Simple File Manager");

    setJMenuBar(menuBar);
    menuBar.add(actionMenu);
    actionMenu.add(renameItem);
    actionMenu.add(deleteItem);

    renameItem.addActionListener(this);
    deleteItem.addActionListener(this);
    button.addActionListener(this);    

    setLayout(new BorderLayout());
    add(textField, BorderLayout.NORTH);
    add(button, BorderLayout.SOUTH);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  }

  public void actionPerformed(ActionEvent ae) {
    Object source = ae.getSource();

    //list
    if (source == button) {
	    File dir = new File(".");
	    JOptionPane.showMessageDialog(this, Arrays.toString(dir.list()));  
	    // change null to this, the Message Dialog will appear in the same place as the parent JFrame
	    
	} 
	//rename
	else if (source == renameItem) {
      String oldName = textField.getText();
      File oldFile = new File(oldName);
      if (!oldFile.exists())
        JOptionPane.showMessageDialog(this, "Original file does not exist. Please input again.");
      else {
        String newName;
        newName = JOptionPane.showInputDialog(this, "Input the new file name:");

        if (newName != null) {
          File newFile = new File(newName);
          if (newFile.exists())
            JOptionPane.showMessageDialog(this, "New file already exists. Please input again.");
          else {
            boolean renameOK = oldFile.renameTo(newFile);
            if (renameOK)
              JOptionPane.showMessageDialog(this, "Rename operation successful");
            else
              JOptionPane.showMessageDialog(this, "Rename operation failed");
          }
        }
      }
    } 
    
    //delete
    else if (source == deleteItem) {
      String filename = textField.getText();
      File deleteFile = new File(filename);
      if (!deleteFile.exists())
        JOptionPane.showMessageDialog(this, "The file specified does not exist. Please input the correct file name to delete.");
      else {
        int option = JOptionPane.showConfirmDialog(this, "Are you sure to delete the file " + filename + "?");
        if (option == JOptionPane.YES_OPTION) {
          boolean deleteOK = deleteFile.delete();
          if (deleteOK)
            JOptionPane.showMessageDialog(this, "Delete operation successful");
          else
            JOptionPane.showMessageDialog(this, "Delete operation failed");
        } // no else part if user clicks "No" or "Cancel" in the confirmation dialog
      }
    } 
  }

  public static void main(String[] args) {
    FileManager fm = new FileManager();
    fm.setVisible(true);
  }
}