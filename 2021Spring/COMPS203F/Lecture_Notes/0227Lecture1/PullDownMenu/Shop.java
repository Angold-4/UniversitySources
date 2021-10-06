import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;

public class Shop extends JFrame implements ActionListener {
    private JCheckBox BaseSystem = new JCheckBox("BaseSystem: $2000");
    private JCheckBox LCD = new JCheckBox("LCD monitor: $1500");
    private JCheckBox DVD = new JCheckBox("DVD + RW: $400");
    private JButton CheckPrice = new JButton("Check Price");
    private JLabel aLabel = new JLabel("Please select the item(s) you want: ");

    public Shop() {
        setLayout(new GridLayout(5, 1));
        add(aLabel);
        add(BaseSystem);
        add(LCD);
        add(DVD);
        add(CheckPrice);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        CheckPrice.addActionListener(this);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent Event) {
        double total = 0;
        if (BaseSystem.isSelected()) {
            total += 2000;
        }

        if (LCD.isSelected()) {
            total += 1500;
        }

        if (DVD.isSelected()) {
            total += 400;
        }

        String CheckOut = "Total Price is $" + total;
        CheckPrice.setText(CheckOut);
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setVisible(true);
    }

}
