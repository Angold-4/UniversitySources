//simple Button and Frame

import javax.swing.*;
import java.awt.event.*;

public class DemoButton extends JFrame implements ActionListener {

    private JButton button = new JButton("0");

    public DemoButton() {
        button.setToolTipText("Click to increase count by 1");
        add(button);            
        
        //add event handler
        button.addActionListener(this);
        
        //exit when window is closed: default is hide i.e [JFrame.HIDE_ON_CLOSE]
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //packs the components within the preferred sizes
        pack();
    }
    
    public void actionPerformed(ActionEvent e) {
        String buttonText = button.getText();
        int count = Integer.parseInt(buttonText) + 1;
        button.setText(Integer.toString(count));
        pack();
    }

    public static void main(String[] args) {
        DemoButton newFrame = new DemoButton();
        newFrame.setVisible(true);
    }
}
