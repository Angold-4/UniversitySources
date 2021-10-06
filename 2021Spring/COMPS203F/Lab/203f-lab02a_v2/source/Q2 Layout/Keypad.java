import javax.swing.*;
import java.awt.*;

public class Keypad extends JFrame {
    private JButton zero = new JButton("0");
    private JButton one = new JButton("1");
    private JButton two = new JButton("2");
    private JButton three = new JButton("3");
    private JButton four = new JButton("4");
    private JButton five = new JButton("5");
    private JButton six = new JButton("6");
    private JButton seven = new JButton("7");
    private JButton eight = new JButton("8");
    private JButton nine = new JButton("9");
    private JButton dot = new JButton(".");
    private JButton equal = new JButton("=");


  public Keypad() {
      setLayout(new GridLayout(4, 3));
      add(seven);
      add(eight);
      add(nine);
      add(four);
      add(five);
      add(six);
      add(one);
      add(two);
      add(three);
      add(zero);
      add(dot);
      add(equal);

      setDefaultCloseOperation(EXIT_ON_CLOSE);

      pack();

  }

  public static void main(String[] args) {
      Keypad KP = new Keypad();
      KP.setVisible(true);

  }
}
