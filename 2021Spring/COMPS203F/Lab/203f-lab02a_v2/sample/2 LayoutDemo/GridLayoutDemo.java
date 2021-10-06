import javax.swing.*;	// Resolve class Jframe, JCheckBox
import java.awt.*;		// Resolve class GridLayout


public class GridLayoutDemo extends JFrame {
  private JButton oneButton = new JButton("One");
  private JButton twoButton = new JButton("Two");
  private JButton threeButton = new JButton("Three");
  private JButton fourButton = new JButton("Four");


  public GridLayoutDemo() {
    super("GridLayoutDemo");
    
    setLayout(new GridLayout(2, 2));
    add(oneButton);
    add(twoButton);
    add(threeButton);
    add(fourButton);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  }

  public static void main(String[] args) {
    GridLayoutDemo frame = new GridLayoutDemo();
    frame.setVisible(true);
  }
}