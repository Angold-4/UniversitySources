import javax.swing.*; 		// Resolve class JFrame, JCheckBox, etc
import java.awt.*; 			// Resolve class FlowLayout, etc
import java.awt.event.*; 	// Resolve class ActionListener

public class ClerkInfoFrame extends JFrame {
	
	//create three panels
	private JPanel labelPanel = new JPanel();
	private JPanel inputPanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	
	private JLabel nameLabel = new JLabel("Name: ");
	private JLabel salaryLabel = new JLabel("Basic salary: ");
	
	private JTextField nameField = new JTextField(20);
	private JTextField salaryField = new JTextField(20);
	
	private JButton exitButton = new JButton("Exit");
	
	public ClerkInfoFrame() {
		
		//set title
		super("Clerk information");
		
		//set panel layout
		labelPanel.setLayout(new GridLayout(2,1));
		inputPanel.setLayout(new GridLayout(2,1));
		
		//add label to panel
		labelPanel.add(nameLabel);
		labelPanel.add(salaryLabel);
		
		//add textField to panel
		inputPanel.add(nameField);
		inputPanel.add(salaryField);
		
		//add button to panel
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(exitButton);
		
		//add panel to main frame with specific positions
		add(labelPanel, BorderLayout.WEST);
		add(inputPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	
	public static void main(String[] args) {
		ClerkInfoFrame frame = new ClerkInfoFrame();
		frame.setVisible(true);
	}
}
