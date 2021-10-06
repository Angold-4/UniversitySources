import javax.swing.*;		
import java.awt.*; 			
import java.awt.event.*; 	// Resolve class ActionListener

public class Conversion extends JFrame implements ActionListener {
    GridBagConstraints gbc = new GridBagConstraints();
    JTextField InputSGD = new JTextField(15);
    JLabel OutputHKD = new JLabel("          ");
    JButton Calculate = new JButton("Calculate");

    public Conversion() {
        setLayout(new GridBagLayout());

        Calculate.addActionListener(this);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(InputSGD, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(OutputHKD, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        add(Calculate, gbc);

        setLocationRelativeTo(null);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        double SGD = Double.parseDouble(InputSGD.getText());
        double HKD = SGD * 5.7;
        String OHKD = String.valueOf(HKD);
        OutputHKD.setText(OHKD);
    }

    public static void main(String[] args) {
        Conversion CV = new Conversion();
    }
}
