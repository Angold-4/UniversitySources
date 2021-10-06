import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ComputerPrice extends JFrame implements ActionListener {
      private JCheckBox laptop = new JCheckBox("Laptop:$12000");
      private JCheckBox speaker = new JCheckBox("Speaker:$700");
      private JCheckBox bk = new JCheckBox("Bluetooth keyboard:$300");
      private JButton check = new JButton("Check Price");
      private ArrayList<JCheckBox> checkList = new ArrayList();

  public ComputerPrice() {
      setLayout(new GridLayout(4, 1));
      checkList.add(laptop); checkList.add(speaker); checkList.add(bk); 
      add(laptop);
      add(speaker);
      add(bk);
      add(check);

      check.addActionListener(this);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      pack();
  }

  public void actionPerformed(ActionEvent event) {
      int price = 0;
      String message = "";
      String checkmessage = "";

      if (laptop.isSelected()) {
          price += 12000;
          message += laptop.getText() + "\n";
      }
      if (speaker.isSelected()) {
          price += 700;
          message += speaker.getText() + "\n";
      }
      if (bk.isSelected()) {
          price += 300;
          message += bk.getText() + "\n";
      }

      checkmessage += "Total price is $" + price;

      check.setText(checkmessage);
      message += "------------ \n";
      message += checkmessage;

      JOptionPane.showMessageDialog(null, message);

  }

  public static void main(String[] args) {
    ComputerPrice frame = new ComputerPrice();
    frame.setVisible(true);
  }
}

