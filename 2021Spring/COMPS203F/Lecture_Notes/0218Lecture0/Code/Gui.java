import javax.swing.*;

public class Gui{
    public static void main(String[] args){
        JFrame frame = new JFrame("Hello Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);

        // JOptionPane
        JOptionPane.showMessageDialog(null, "Hello");
        JOptionPane.showInputDialog(null, "Input number:");
        int option = JOptionPane.showConfirmDialog(null, "Are you sure?");

        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Thanks!");
        }
    }
}
