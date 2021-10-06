// Pull-down Menus
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PullDownMenuDemo extends JFrame implements ActionListener {
  private JMenuBar menuBar = new JMenuBar();
  private JMenu demoMenu = new JMenu("Demo");
  private JMenuItem textMenuItem = new JMenuItem("TextArea");

  
  public PullDownMenuDemo() {
	//set menu bar
    setJMenuBar(menuBar);
    
    //add menu
    menuBar.add(demoMenu);    
    
    //add menu item
    demoMenu.add(textMenuItem);
    
    // register the action listener
    textMenuItem.addActionListener(this);
    
    // exit when window is closed: default is hide
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // pack to give a better appearance
    pack();
  }

  // event handling
  public void actionPerformed(ActionEvent event) {
    Object source = event.getSource();
    if (source == textMenuItem) {
	    
	  //from class TextAreaDemo stored in the separate TextAreaDemo.java file
      TextAreaDemo newFrame  = new TextAreaDemo();    
      
      //display the textArea 
      newFrame.setVisible(true);   
    } 
  }  

  public static void main(String[] args) {    
    // create a frame 
    PullDownMenuDemo aMenu = new PullDownMenuDemo();
    
    // set the frame visible
    aMenu.setVisible(true);    
  }
      
}
