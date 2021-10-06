import javax.swing.*; // Resolve class JFrame, JCheckBox, etc
import java.awt.*; // Resolve class FlowLayout, etc
import java.awt.event.*; // Resolve class ActionListener

public class SalespersonInfoFrame extends JFrame {
  private JPanel labelPanel = new JPanel();
  private JPanel inputPanel = new JPanel();
  private JPanel buttonPanel = new JPanel();

  private JLabel nameLabel = new JLabel("Name: ");
  private JLabel salary = new JLabel("Basic salary: ");
  private JLabel volumn = new JLabel("Sales volumn: ");
  private JLabel rate = new JLabel("Commission rate(%): ");

  private JTextField nameField = new JTextField(20);
  private JTextField salaryField = new JTextField(20);
  private JTextField volumnField = new JTextField(20);
  private JTextField rateField = new JTextField(20);

  private JButton editButton = new JButton("Edit");
  private JButton cancelButton = new JButton("Cancel");


  public SalespersonInfoFrame() {
    super("Salesperson information");
    labelPanel.setLayout(new GridLayout(4, 1));
    inputPanel.setLayout(new GridLayout(4, 1));

    labelPanel.add(nameLabel);
    labelPanel.add(salary);
    labelPanel.add(volumn);
    labelPanel.add(rate);

    inputPanel.add(nameField);
    inputPanel.add(salaryField);
    inputPanel.add(volumnField);
    inputPanel.add(rateField);

    buttonPanel.setLayout(new FlowLayout());
    buttonPanel.add(editButton);
    buttonPanel.add(cancelButton);

    add(labelPanel, BorderLayout.WEST);
    add(inputPanel, BorderLayout.CENTER);
    add(buttonPanel, BorderLayout.SOUTH);


    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  }

  public static void main(String[] args) {
    SalespersonInfoFrame frame = new SalespersonInfoFrame();
    frame.setVisible(true);
  }
}
