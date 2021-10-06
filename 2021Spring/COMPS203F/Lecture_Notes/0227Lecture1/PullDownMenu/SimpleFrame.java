import javax.swing.*;
import java.awt.*;

public class SimpleFrame extends JFrame {
    private JButton button = new JButton("a button");

    public SimpleFrame() {
        // a container can contain other GUI objects
        Container contentPane = getContentPane();
        contentPane.add(button);
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
