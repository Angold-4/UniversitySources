import javax.swing.*;

public class TextArea5 extends JFrame {
    private JTextArea textArea;
    public TextArea5() {
        String content = "Hello World!\n";
        for (int i=0; i < 5; i++) content += content;
        // row column
        textArea = new JTextArea(content, 5, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        TextArea5 textArea = new TextArea5();
        textArea.setVisible(true);
    }
}
