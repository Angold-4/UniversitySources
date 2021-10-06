// with action handling
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleFrame4 extends JFrame implements ActionListener {
    private JButton button = new JButton("Set");
    private JLabel label = new JLabel("a label");
    private JTextField textField = new JTextField(10);

    public SimpleFrame4() {
        setLayout(new FlowLayout());
        add(textField);
        add(label);
        add(button);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // A component without an action listener will not be monitored.
        button.addActionListener(this);
        // with pack() all its contents are at or above their preferred sizes.
        
        button.setToolTipText("Click to increase count by 1");
        pack();
    }

    // event handling (must have defined in interface) 
    @Override
    public void actionPerformed(ActionEvent event) {
        String newLabel = textField.getText();
        label.setText(newLabel);
    }
}


