import javax.swing.*; // Resolve class Jframe, JCheckBox
import java.awt.*; // Resolve class GridLayout
import java.awt.event.*; // Resolve class ActionListener
import java.util.*; // Resolve ArrayList<>

public class ArrayListCheckbox extends JFrame implements ActionListener {
  private ArrayList<JCheckBox> checkList = new ArrayList<>();
  private JLabel label = new JLabel("ArrayList CheckBox Demo");  
  private JButton checkButton = new JButton("Check");

  public ArrayListCheckbox() {
	super("ArrayList Checkbox Demo");  	  
	
	//add checkbox (JCheckBox) to checkList (ArrayList<JCheckBox>)
    checkList.add(new JCheckBox("Java"));
    checkList.add(new JCheckBox("Python"));

    setLayout(new GridLayout(4, 1));
    add(label);    

    for (JCheckBox checkbox : checkList){
      //add each of the checkbox element to main frame
      add(checkbox);
	}
	
    //add button to main frame    
    add(checkButton);

    checkButton.addActionListener(this);
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);  
    pack();
  }

  public void actionPerformed(ActionEvent event) {        
	String select = "";
	  
    if (event.getSource() == checkButton) {
	  
	  //for each checkbox in the checkList (ArrayList<JCheckBox>)   
      for (JCheckBox checkbox : checkList) {
        if (checkbox.isSelected()){
          select += checkbox.getText()+" ";
        }
      }

      checkButton.setText("Checked: " + select);

      pack();
    }
  }

  public static void main(String[] args) {
    ArrayListCheckbox frame = new ArrayListCheckbox();
    frame.setVisible(true);
  }
}
