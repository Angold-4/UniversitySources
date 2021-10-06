import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonDemo extends JFrame implements ActionListener {
  private JRadioButton button1 = new JRadioButton("Computing Programme");
  private JRadioButton button2 = new JRadioButton("Engineering Programme");
  private ButtonGroup optionGroup = new ButtonGroup();
  private JButton submitButton = new JButton("Submit");

  public RadioButtonDemo() {
    setLayout(new GridLayout(3, 1));
    add(button1);
    add(button2);

    // add to the same optionGroup
    optionGroup.add(button1);
    optionGroup.add(button2);

    add(submitButton);
    
    button1.addActionListener(this);
    button2.addActionListener(this);

    submitButton.addActionListener(this);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // need to comment out this line if invoked by PullDownMenu
    pack();
  }

  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == submitButton) {
      if (button1.isSelected())
        JOptionPane.showMessageDialog(this,"Welcome Computing Student!");    
      else if (button2.isSelected())
        JOptionPane.showMessageDialog(this,"Welcome Engineering Student!");    
      else
        JOptionPane.showMessageDialog(this,"Please select your programme!");          	
    }
    pack();
  }

  public static void main(String[] args) {
    RadioButtonDemo mc = new RadioButtonDemo();
    mc.setVisible(true);
  }
}
