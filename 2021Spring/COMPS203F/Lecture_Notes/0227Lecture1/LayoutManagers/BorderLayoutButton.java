import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BorderLayoutButton extends JFrame {
    private JButton north = new JButton("North");
    private JButton west = new JButton("West");
    private JButton center = new JButton("Center");
    private JButton east = new JButton("East");
    private JButton south = new JButton("South");

    public BorderLayoutButton() {
        setLayout(new BorderLayout());
        add(north, BorderLayout.NORTH);
        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);
        add(east, BorderLayout.EAST);
        add(south, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        BorderLayoutButton borderlayout = new BorderLayoutButton();
        borderlayout.setVisible(true);
    }


}
