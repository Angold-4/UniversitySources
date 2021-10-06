import javax.swing.*;
import java.awt.*;

public class BorderLayoutFrame extends JFrame {
    private JButton GM = new JButton("Good Morning");
    private JButton GA = new JButton("Good Afternon");
    private JButton GE = new JButton("Good Evening");

  public BorderLayoutFrame() {
      setLayout(new BorderLayout());
      add(GM, BorderLayout.NORTH);
      add(GA, BorderLayout.CENTER);
      add(GE, BorderLayout.SOUTH);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      pack();
  }

  public static void main(String[] args) {
      BorderLayoutFrame BF = new BorderLayoutFrame();
      BF.setVisible(true);
  }
}
