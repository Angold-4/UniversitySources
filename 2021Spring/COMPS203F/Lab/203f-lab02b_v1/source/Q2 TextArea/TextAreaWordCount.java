import javax.swing.*;		
import java.awt.*; 			
import java.awt.event.*; 	// Resolve class ActionListener

 
public class TextAreaWordCount extends JFrame implements ActionListener{
	private JTextArea textArea = new JTextArea(3,25); //JTextArea(row,col)
    private JLabel words = new JLabel("Words:?");
    private JLabel characters = new JLabel("Characters:?");
    private JButton count = new JButton("Count");

	 
	public TextAreaWordCount() {
        super("TextArea WordCount example");
        setLayout(new GridLayout(4, 1));
        add(words);
        add(characters);
        add(textArea);
        add(count);
        count.addActionListener(this);

        for (int i = 0; i < 10; i++)
            textArea.append(i + ": Hello World!\n");
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
  	
	}

	public void actionPerformed(ActionEvent event){
        String[] arrOfStr = textArea.getText().split(" ");
        words.setText("Words: " + arrOfStr.length);
        characters.setText("Characters: " + textArea.getText().length());
	}    
	
  public static void main(String[] args) {
    JFrame frame = new TextAreaWordCount();
    frame.setVisible(true);
  }
 
}
