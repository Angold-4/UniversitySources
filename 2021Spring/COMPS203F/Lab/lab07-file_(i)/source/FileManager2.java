import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileManager2 extends JFrame implements ActionListener {
  private JTextField textField = new JTextField(20);
  private JRadioButton readButton = new JRadioButton("Read file");
  private JRadioButton encryptButton = new JRadioButton("Encrypt");
  private JButton button = new JButton("Go");
  private String content = "";
  private boolean toEncrypt = true;
  
  //add more Swing Control objects below:


  public FileManager2() {
      setLayout(new GridLayout(4, 1));
      add(textField);
      add(readButton);
      add(encryptButton);
      add(button);

      button.addActionListener(this);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      pack();
  }

  public void actionPerformed(ActionEvent ae) {
    Object source = ae.getSource();
    if (source == button) {
      String contentChar = "";
      //add a new JFrame
        
      int inputByte;
      try {
        FileInputStream in = new FileInputStream(textField.getText());
        while ((inputByte = in.read()) != -1) {

            contentChar += (char) inputByte;
        }
        in.close();

    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

      if (readButton.isSelected()) {
        //read from file using FileInputStream
        
        try {
            FileInputStream in = new FileInputStream(textField.getText());
            while ((inputByte = in.read()) != -1) {

                contentChar += (char) inputByte;
            }
            //display to console
            System.out.println("File contents: ");
            System.out.println(contentChar);
            in.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
                
        //add a new JFrame
          
        JFrame displayFrame = new JFrame("File content");
        JTextField fileContent = new JTextField(contentChar, 2);
        displayFrame.add(fileContent);
        displayFrame.pack();
        displayFrame.setVisible(true);
        displayFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        

      } else if (encryptButton.isSelected()) {

          if (toEncrypt) {
              content = encrypt(contentChar, 13);
              System.out.println(content);
              toEncrypt = false;
          } 
          else {
              content = encrypt(content, -13);
              System.out.println(content);
              System.out.println("false executed");
              toEncrypt = true;
          }

          JFrame displayFrame = new JFrame("File content");
          JTextField fileContent = new JTextField(content, 2);
          displayFrame.add(fileContent);
          displayFrame.pack();
          displayFrame.setVisible(true);
          displayFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
          fileContent.setText(content);
      }
    }
  }

  public static String encrypt(String inText, int shift) {
      String encrypted = "";
      for (int i = 0; i < inText.length(); i++) {
          char ch = inText.charAt(i);
          if (ch >= 'A' && ch <= 'Z') {
              ch += shift;
              if (ch > 'Z') 
                  ch -= 26;
              else if (ch < 'A') 
                  ch += 26;
          }

          else if (ch >= 'a' && ch <= 'z') {
              ch += shift;
              if (ch > 'z') 
                  ch -= 26;
              else if (ch < 'a') 
                  ch += 26;
          }

          encrypted += ch;
      }
      return encrypted;

  }

  public static void main(String[] args) {
    FileManager2 fm2 = new FileManager2();
    fm2.setVisible(true);
  }
}
