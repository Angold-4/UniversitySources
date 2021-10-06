import javax.swing.*;
import java.awt.GridLayout;

public class Region extends JFrame {
    private JLabel label = new JLabel("Select the region: ");
    private JRadioButton hkButton = new JRadioButton("Hong Kong Island", true);
    private JRadioButton klnButton = new JRadioButton("Kowloon");
    private JRadioButton ntButton = new JRadioButton("New Territories");
    private ButtonGroup optionGroup = new ButtonGroup();

    public Region() {
        setLayout(new GridLayout(4, 1));
        add(label);
        add(hkButton);
        add(klnButton);
        add(ntButton);

        optionGroup.add(hkButton);
        optionGroup.add(klnButton);
        optionGroup.add(ntButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

        int days = 0;
        
        if (optionGroup.getSelection() == hkButton) days = 2;
        else if(optionGroup.getSelection() == klnButton) days = 1;
        else if(optionGroup.getSelection() == ntButton) days = 3;
    }

    public static void main(String[] args) {
        Region regionSelection = new Region();
        regionSelection.setVisible(true);

    }
}
