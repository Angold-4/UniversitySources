//simple Dialogs

import javax.swing.*;

public class DemoDialogs {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello, Welcome to 203F");

        String inputName = JOptionPane.showInputDialog("Enter your name:");
        
        //show name in dialog
        JOptionPane.showMessageDialog(null,"Hello "+ inputName);     
        
        //show name in output window        
        System.out.println("The input name is: " + inputName);

        int option = JOptionPane.showConfirmDialog(null, "Have you learnt Java before?");
        System.out.println("Have you learnt Java before?");        
        
        if (option == JOptionPane.YES_OPTION) {
            System.out.println("Yes, you did");
        } else if (option == JOptionPane.NO_OPTION) {
            System.out.println("No, you didn't");
        } else if (option == JOptionPane.CANCEL_OPTION) {
            System.out.println("Cancel is pressed");
        }
        
        JOptionPane.showMessageDialog(null,"Bye");            
    }
}