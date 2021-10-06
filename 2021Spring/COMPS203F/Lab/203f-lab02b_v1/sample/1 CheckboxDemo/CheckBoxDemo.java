import javax.swing.*;		// Resolve class Jframe, JCheckBox
import java.awt.*; 			// Resolve class GridLayout
import java.awt.event.*; 	// Resolve class ActionListener

public class CheckBoxDemo extends JFrame implements ActionListener {
  private JCheckBox cboxJ = new JCheckBox("Java");
  private JCheckBox cboxP = new JCheckBox("Python");
  private JLabel label = new JLabel("CheckBox Demo:Java/Python");
  private JButton checkButton = new JButton("Check Price");

  public CheckBoxDemo() {
	super("CheckBox Demo");  
    setLayout(new GridLayout(4, 1));
    add(label);
    add(cboxJ);
    add(cboxP);
    add(checkButton);
    checkButton.addActionListener(this);
    setDefaultCloseOperation(EXIT_ON_CLOSE);  // need to comment out this line if invoked by PullDownMenu
    pack();
  }

  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == checkButton) {
	  String checkJ = "";  
	  String checkP = "";  
	  
      if (cboxJ.isSelected())
      	checkJ = cboxJ.getText();
        //or, checkJ = cboxJ.getText().substring(cboxJ.getText().indexOf(":") + 1);
        
      if (cboxP.isSelected())
        checkP = cboxP.getText().substring(cboxP.getText().indexOf("/") + 1);

      if (checkJ.length()==0 && checkP.length()==0)
      	checkButton.setText("nothing selected");	  
      else
      	checkButton.setText("checked: " + checkJ + " " + checkP);
      	
      pack();
    }
  }

  public static void main(String[] args) {
    CheckBoxDemo frame = new CheckBoxDemo();
    frame.setVisible(true);
  }
}
