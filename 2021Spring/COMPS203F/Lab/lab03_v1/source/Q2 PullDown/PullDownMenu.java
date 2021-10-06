// Pull-down Menus
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PullDownMenu extends JFrame implements ActionListener {
  private JMenuBar menuBar = new JMenuBar();
  private JMenu fileMenu = new JMenu("File");
  private JMenuItem exit = new JMenuItem("Exit");

  private JMenu run = new JMenu("Run");
  private JMenuItem CP = new JMenuItem("Computer Price");
  private JMenuItem MC = new JMenuItem("Multiple Choice");
  
  public PullDownMenu() {

      setJMenuBar(menuBar);
      menuBar.add(fileMenu);
      fileMenu.add(exit);

      menuBar.add(run);
      run.add(CP); run.add(MC);

      exit.addActionListener(this);
      CP.addActionListener(this);
      MC.addActionListener(this);

    
    // exit when window is closed: default is hide
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // pack to give a better appearance
    pack();
  }

  // event handling
  public void actionPerformed(ActionEvent event) {
    Object source = event.getSource();
    if (source == CP) {
	    
	  //from class TextAreaDemo stored in the separate TextAreaDemo.java file
      ComputerPrice newFrame  = new ComputerPrice();    
      
      //display the textArea 
      newFrame.setVisible(true);   
    } 

    if (source == MC) {
	    
	  //from class TextAreaDemo stored in the separate TextAreaDemo.java file
      MultipleChoice newFrame  = new MultipleChoice();    
      
      //display the textArea 
      newFrame.setVisible(true);   
    } 


    if (source == exit) {
        dispose();
    } 

	  
  }  

  public static void main(String[] args) {    
    // create a frame 
    PullDownMenu aMenu = new PullDownMenu();
    
    // set the frame visible
    aMenu.setVisible(true);    
  }
      
}
