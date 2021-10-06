import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultipleChoice extends JFrame implements ActionListener {
    private JLabel label = new JLabel("Which of the following is false");
    private JRadioButton op1 = new JRadioButton("More than one check boxes can be selected.");
    private JRadioButton op2 = new JRadioButton("More that one radio button can be selected.");
    private JRadioButton op3 = new JRadioButton("There are at most five components in Border Layout Manager");
    private JButton Submit = new JButton("Submit");

    private ButtonGroup optionGroup = new ButtonGroup();

  public MultipleChoice() {
      setLayout(new GridLayout(5, 1));
      add(label);
      add(op1);
      add(op2);
      add(op3);
      add(Submit);

      optionGroup.add(op1);
      optionGroup.add(op2);
      optionGroup.add(op3);

      Submit.addActionListener(this);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      pack();

  }

  public void actionPerformed(ActionEvent event) {
      String txt = "Your answer is: ";
      if (optionGroup.getSelection() == op2) txt += "true.";
      else txt += "false.";
      Submit.setText(txt);
  }

  public static void main(String[] args) {
    MultipleChoice mc = new MultipleChoice();
    mc.setVisible(true);
  }
}
