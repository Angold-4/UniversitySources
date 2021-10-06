// Simple Label and Textfield

import javax.swing.*;
import java.awt.*;	//for setLayout() method
import java.awt.event.*;

public class DemoText extends JFrame implements ActionListener {
	private JButton button = new JButton("set");
	private JLabel label = new JLabel("a label");
	private JTextField textField = new JTextField(10); 
	
	public DemoText() {	
		//The FlowLayout class puts components in a row, sized at their preferred size	
		setLayout(new FlowLayout());
		
		add(textField);
		add(label);
		add(button);
		button.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}
	
	// event handling
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == button){
			String newLabel = textField.getText();		
			if (newLabel.length()>0){ 	  
				label.setText(newLabel);
				pack();
			}
			else{
				JOptionPane.showMessageDialog(this, "Enter a valid text");
				label.setText("a label");	
				pack();					
			}
		}
	}
	
	public static void main(String[] args) {
		DemoText newFrame = new DemoText();  
		newFrame.setVisible(true);
	}  
}
