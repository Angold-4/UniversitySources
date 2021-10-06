// with action handling
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleFrame3 extends JFrame implements ActionListener {
    private JButton button = new JButton("clicks: 0");
    public SimpleFrame3() {
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
        String buttonText = button.getText();
        String newButtonText = buttonText.substring(0,8) + 
            (Integer.parseInt(buttonText.substring(8)) + 1);
        button.setText(newButtonText);
    }
}

