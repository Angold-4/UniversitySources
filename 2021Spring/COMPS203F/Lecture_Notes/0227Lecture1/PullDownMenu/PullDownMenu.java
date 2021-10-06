import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PullDownMenu extends JFrame implements ActionListener {
    private JMenuBar menuBar = new JMenuBar();

    private JMenu SimpleFrame = new JMenu("SimpleFrame");
    private JMenu Display = new JMenu("Display");
    private JMenu Shopping = new JMenu("Shopping");

    private JMenuItem SimpleFrame1 = new JMenuItem("SimpleFrame1");
    private JMenuItem SimpleFrame2 = new JMenuItem("SimpleFrame2");
    private JMenuItem SimpleFrame3 = new JMenuItem("SimpleFrame3");
    private JMenuItem SimpleFrame4 = new JMenuItem("SimpleFrame4");

    private JMenuItem TextArea = new JMenuItem("TextArea");
    private JMenuItem LayoutManagers = new JMenuItem("LayoutManagers");

    private JMenuItem Region = new JMenuItem("Region");
    private JMenuItem Shop = new JMenuItem("Shop");

    public PullDownMenu() {
        setJMenuBar(menuBar);

        menuBar.add(SimpleFrame);
        SimpleFrame.add(SimpleFrame1);
        SimpleFrame.add(SimpleFrame2);
        SimpleFrame.add(SimpleFrame3);
        SimpleFrame.add(SimpleFrame4);

        SimpleFrame1.addActionListener(this);
        SimpleFrame2.addActionListener(this);
        SimpleFrame3.addActionListener(this);
        SimpleFrame4.addActionListener(this);

        menuBar.add(Display);
        Display.add(TextArea);
        Display.add(LayoutManagers);

        TextArea.addActionListener(this);
        LayoutManagers.addActionListener(this);

        menuBar.add(Shopping);
        Shopping.add(Region);
        Shopping.add(Shop);

        Region.addActionListener(this);
        Shop.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source == SimpleFrame) {
            SimpleFrame simpleframe1 = new SimpleFrame();
            simpleframe1.setVisible(true);
        }

        if (source == SimpleFrame2) {
            SimpleFrame2 simpleframe2 = new SimpleFrame2();
            simpleframe2.setVisible(true);
        }

        if (source == SimpleFrame3) {
            SimpleFrame3 simpleframe3 = new SimpleFrame3();
            simpleframe3.setVisible(true);
        }

        if (source == SimpleFrame4) {
            SimpleFrame4 simpleframe4 = new SimpleFrame4();
            simpleframe4.setVisible(true);
        }

        if (source == TextArea) {
            TextArea5 textArea5 = new TextArea5();
            textArea5.setVisible(true);
        }

        if (source == LayoutManagers) {
            BorderLayoutButton BT = new BorderLayoutButton();
            BT.setVisible(true);
        }

        if (source == Region) {
            Region region = new Region();
            region.setVisible(true);
        }

        if (source == Shop) {
            Shop shop = new Shop();
            shop.setVisible(true);
        }
    }

    public static void main(String[] args) {
        PullDownMenu Menu = new PullDownMenu();
        Menu.setVisible(true);
    }


}
