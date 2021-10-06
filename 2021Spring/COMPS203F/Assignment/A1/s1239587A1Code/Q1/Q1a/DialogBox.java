import javax.swing.*;

public class DialogBox {
    // JOptionPane
    JFrame f;
    int SGDAmount;
    boolean ST = true;
    // CST means the Cancel or No status
    boolean CST = true;


    public DialogBox() {
        // Just a simple parent component (wont be displayed)
        f = new JFrame("DialogBox");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public int inputSGDAmount() {
        int SGD;
        // Show the Input Dialog
        String StrSGD = JOptionPane.showInputDialog(f, "Input the SGD Amount:");
        try {
            SGD = Integer.parseInt(StrSGD);
        } catch (NumberFormatException e) {
            SGD = -1;
        }

        // Ask to Confirm
        int c = JOptionPane.showConfirmDialog(f, "The input is: " + StrSGD + ", is it corret?");
        if (c == JOptionPane.YES_OPTION) {
            return SGD;
        }
        else if (c == JOptionPane.CLOSED_OPTION) {
            System.exit(0);
        }
        // if No
        CST = false;
        return 0;
    }

    public void checkSGDAmount() {
        while(ST) {
            SGDAmount = inputSGDAmount();
            if (SGDAmount > 0) {
                ST = false;
            }
            else if (CST && SGDAmount <= 0) {
                JOptionPane.showMessageDialog(f, "The SGD amount should be greater than 0");
            }
        }
        System.exit(0);
    }

    public static void main(String[] args) {
        DialogBox DB = new DialogBox();
        DB.checkSGDAmount();
    }
}
