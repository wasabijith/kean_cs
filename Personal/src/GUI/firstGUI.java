package GUI;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class firstGUI implements ActionListener
{
	private int count = 0; 
	private JFrame frame; 
	private JLabel label; 
	private JPanel panel; 
	
	public firstGUI() 
	{
		frame = new JFrame(); 
		
		JButton button = new JButton("Click me"); 
		button.addActionListener(this);
		label = new JLabel("Number of clicks = 0");
		
		panel = new JPanel(); 
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30)); 
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button); 
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setTitle("Our GUI"); 
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new firstGUI();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		count++; 
		label.setText("Number of clicks: " + count);
	}
}
