// HexEditor

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 	// Resolve class ActionListener
import java.io.*;

public class HexEditor extends JFrame implements ActionListener {
    private JMenuBar menuBar = new JMenuBar();
    private JMenu File = new JMenu("File");
    private JMenuItem Load = new JMenuItem("Load");
    private JMenuItem Save = new JMenuItem("Save");

    private JPanel PanelTextArea = new JPanel();
    private JTextArea TextArea = new JTextArea(5, 10);
    private JLabel Blank = new JLabel();

    private JPanel PanelDisplayArea = new JPanel();
    private JTextArea DisplayArea = new JTextArea(5, 20);

    private JButton Update = new JButton("Update hex");

    private JScrollPane spt = new JScrollPane(TextArea);
    private JScrollPane spd = new JScrollPane(DisplayArea);

    // Some Global Variables
    String FileName = "";

    public HexEditor() {
        setLayout(new BorderLayout());
        setJMenuBar(menuBar);
        File.add(Load);
        File.add(Save);
        menuBar.add(File);
        Load.addActionListener(this);
        Save.addActionListener(this);
        Update.addActionListener(this);

        PanelTextArea.add(spt);
        PanelDisplayArea.add(spd);

        add(PanelTextArea, BorderLayout.WEST);
        add(Blank, BorderLayout.CENTER);
        add(PanelDisplayArea, BorderLayout.EAST);
        add(Update, BorderLayout.SOUTH);

        setLocationRelativeTo(null);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        Object Source = ae.getSource();
        if (Source == Load) {
            FileName = JOptionPane.showInputDialog("Please input the file you want to load: ");

            try {
                FileInputStream in = new FileInputStream(FileName);

                String FileContent = "";

                int inputByte;
                while ((inputByte = in.read()) != -1) {
                    FileContent += (char) inputByte;
                }

                TextArea.append(FileContent);
                in.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        if (Source == Update) {
            String FileContent1 = TextArea.getText();
            for (int i = 0; i < FileContent1.length(); i++) {
                char ch = FileContent1.charAt(i);
                DisplayArea.append(Integer.toHexString(ch));
                DisplayArea.append(" ");
            }
        }

        if (Source == Save) {
            if (FileName == "") {
                FileName = JOptionPane.showInputDialog("Please input the file you want to save: ");
            }

            try {
                FileOutputStream out = new FileOutputStream(FileName);

                String SaveContent = TextArea.getText();

                for (int i = 0; i < SaveContent.length(); i++) {
                    char ch = SaveContent.charAt(i);
                    out.write(ch);
                }

                out.close();


            } catch (IOException e) {
                System.out.println(e.getMessage());
            }


        }

    }

}

