import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private double result = 0;
    private JLabel label = new JLabel(Double.toString(result));
    private JButton Add = new JButton("Add");
    private JButton Substract = new JButton("Substract");
    private JButton Multiply = new JButton("Multiply");
    private JButton Divide = new JButton("Divide");
    private JTextField Number = new JTextField(10);
    
    public SimpleCalculator() {
        setLayout(new FlowLayout());
        add(label);
        add(Number);
        add(Add);
        add(Substract);
        add(Multiply);
        add(Divide);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Add.addActionListener(this);
        Substract.addActionListener(this);
        Divide.addActionListener(this);
        Multiply.addActionListener(this);


        pack();
    }

    public void actionPerformed(ActionEvent e) {
        String NumberText = Number.getText();
        String Answer = label.getText();
        double number = Double.parseDouble(NumberText);
        double answer = Double.parseDouble(Answer);

        if (e.getSource() == Add) {
            answer += number;
        }
        else if (e.getSource() == Substract) {
            answer -= number;
        }
        else if (e.getSource() == Multiply) {
            answer *= number;
        }
        else if (e.getSource() == Divide) {
            answer /= number;
        }

        label.setText(Double.toString(answer));
        Number.setText("");

    }

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        calc.setVisible(true);
    }
}
