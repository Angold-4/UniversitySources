// with action handling
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleFrame2 extends JFrame implements ActionListener {
    private JButton button = new JButton("a button");
    public SimpleFrame2() {
        add(button);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // A component without an action listener will not be monitored.
        button.addActionListener(this);
        // with pack() all its contents are at or above their preferred sizes.
        pack();
    }

    // event handling (must have defined in interface) 
    @Override
    public void actionPerformed(ActionEvent event) {
        button.setText("button pressed");
    }
}
