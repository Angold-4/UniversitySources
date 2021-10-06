import javax.swing.*;		// Resolve class JFrame, JTextArea
import java.awt.*; 			// Resolve class FlowLayout
 
public class TextAreaDemo extends JFrame {
  private JTextArea textArea = new JTextArea(2,25); //JTextArea(row,col)
	 
  public TextAreaDemo() {

	super("TextAreaDemo Example");  	   

    setLayout(new FlowLayout());
    add(textArea);

    String content = "Hello World!\nHello World!\nHello World!\n";

    // Wite text to the text area.
    textArea.setText(content);
 
    // Appends the given text to the end of text area.
    textArea.append("This is the last line");
 
	JScrollPane scrollPane = new JScrollPane(textArea);
    add(scrollPane);    	
	    
    // read contents of the text area.
    //String str = textArea.getText();
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();    
 
  }
 
  public static void main(String[] args) {
    JFrame frame = new TextAreaDemo();
    frame.setVisible(true);
  }
 
}
