import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FileManager ___________________________________ {
  private JTextField textField = _____________;
  private JButton button = _____________;

  //menu
  private JMenuBar menuBar = _____________;
  private JMenu actionMenu = _____________;
  private JMenuItem renameItem = _____________;
  private JMenuItem deleteItem = _____________;
  ¡K	

  public FileManager() {
    //set title using super():
	
	//set menu below:

	//add Action Listeners

	//set layout using BorderLayout()

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  }

  public void actionPerformed(ActionEvent ae) {
    Object source = ae.getSource();

    //list
    if (source == button) {

	    // change null to this, the Message Dialog will appear in the same place as the parent JFrame
	    
	} 
	
	//rename
	else if (source == renameItem) {
      String oldName = textField.getText();
      File oldFile = new File(oldName);
      
      if (!oldFile.exists())
        _________________________________________________;
      else {
		_________________________________________________;
		_________________________________________________;
		
        if (newName != null) {
          File newFile = new File(newName);
          
		  //complete the details below
		  
        }
      }
    } 
    
    //delete
    else if (source == deleteItem) {
	    
		//complete the details below
    } 
  }

  public static void main(String[] args) {
    FileManager fm = new FileManager();
    fm.setVisible(true);
  }
}