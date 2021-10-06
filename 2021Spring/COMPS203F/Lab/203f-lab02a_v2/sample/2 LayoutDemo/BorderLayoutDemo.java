import javax.swing.*;	// Resolve class Jframe, JCheckBox
import java.awt.*;		// Resolve class BorderLayout

public class BorderLayoutDemo extends JFrame {
  private JButton buttonEast = new JButton("East");
  private JButton buttonSouth = new JButton("South");
  private JButton buttonWest = new JButton("West");
  private JButton buttonNorth = new JButton("North");
  private JButton buttonCenter = new JButton("Center");     

  public BorderLayoutDemo() {
	  
	//set frame title  
    super("BorderLayoutDemo");
    
    //set layout
    setLayout(new BorderLayout());   
    
    //add buttons to frame     
	add(buttonEast, BorderLayout.EAST);
	add(buttonSouth, BorderLayout.SOUTH);
	add(buttonWest, BorderLayout.WEST);
	add(buttonNorth, BorderLayout.NORTH);
	add(buttonCenter, BorderLayout.CENTER);
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    //size the buttons to frame    
    pack();
  }

  public static void main(String[] args) {
    BorderLayoutDemo frame = new BorderLayoutDemo();    
    frame.setVisible(true); 
  }
}
