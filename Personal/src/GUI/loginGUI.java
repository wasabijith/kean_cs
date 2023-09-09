package GUI;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class loginGUI 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(); 
		frame.setSize(350, 200); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.add(panel); 
		
		panel.setLayout(null); 

		//creates the text for user name label 
		JLabel userLabel = new JLabel("Username: ");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel); 
		
		//creates text field where user can enter user name
		JTextField userText = new JTextField(); 
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText); 
		
		
		//creates the text for user password label 
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel); 
		
		//creates text field where user can enter password
		JTextField userPassword = new JTextField(); 
		userPassword.setBounds(100, 50, 165, 25);
		panel.add(userPassword); 
		
		//creates the login button 
		JButton button = new JButton("Login");
		button.setBounds(100, 80, 80, 25);
		panel.add(button); 
		
		frame.setVisible(true); 
	}
}
