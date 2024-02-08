import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener
{
	private JFrame frame;
	private JTextField num1box, num2box, resultbox;
	private JLabel operatorLabel;
	private JButton addButton, subtractButton, multiplyButton, divideButton, modButton;

	public Calculator()
	{
		// Create the frame and set the properties
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 300);
		frame.setLayout(new GridLayout(3, 4, 4, 6));

		// Create the new text fields
		num1box = new JTextField();
		num1box.setSize(10, 20);


		num2box = new JTextField();
		num2box.setSize(10, 20);

		resultbox = new JTextField();
		resultbox.setEditable(false);

		// Create the operator label
		operatorLabel = new JLabel("+");
		operatorLabel.setSize(40,20);
		Font font = new Font("Courier", Font.BOLD, 30);
		operatorLabel.setFont(font);

		// Create buttons
		// Add button color customization
		addButton = new JButton("+");
		addButton.setBackground(Color.cyan);
		addButton.setForeground(Color.BLACK);
		addButton.setFont(font);

		subtractButton = new JButton("-");
		subtractButton.setBackground(Color.orange);
		subtractButton.setForeground(Color.BLACK);
		subtractButton.setFont(font);

		multiplyButton = new JButton("x");
		multiplyButton.setBackground(Color.BLACK);
		multiplyButton.setForeground(Color.WHITE);
		multiplyButton.setFont(font);


		divideButton = new JButton("÷");
		divideButton.setBackground(Color.WHITE);
		divideButton.setForeground(Color.BLACK);
		divideButton.setFont(font);

		modButton = new JButton("%");
		modButton.setBackground(Color.pink);
		modButton.setForeground(Color.BLACK);
		modButton.setFont(font);


		// Add components to frame
		frame.add(new JLabel("First number:"));
		frame.add(num1box);
		frame.add(new JLabel("Operator:"));
		frame.add(operatorLabel);
		frame.add(new JLabel("Second number:"));
		frame.add(num2box);
		frame.add(new JLabel("Result:"));
		frame.add(resultbox);
		frame.add(addButton);
		frame.add(subtractButton);
		frame.add(multiplyButton);
		frame.add(divideButton);
		frame.add(modButton);

		// Add action listeners to buttons
		addButton.addActionListener(this);
		subtractButton.addActionListener(this);
		multiplyButton.addActionListener(this);
		divideButton.addActionListener(this);
		modButton.addActionListener(this);

		// Show frame
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		double num1 = Double.parseDouble(num1box.getText());
		double num2 = Double.parseDouble(num2box.getText());
		char sign = e.getActionCommand().charAt(0);

		//Switch operators that would determine outcome based on what operation is chosen
		switch (sign)
		{
		case '+':
			resultbox.setText(String.valueOf(num1 + num2));
			operatorLabel.setText("+");
			break;

		case '-':
			resultbox.setText(String.valueOf(num1 - num2));
			operatorLabel.setText("-");
			break;

		case 'x':
			resultbox.setText(String.valueOf(num1 * num2));
			operatorLabel.setText("x");
			break;

		case '÷':
			if (num2 == 0)
			{
				resultbox.setText("Error: Division by zero");
			}
			else
			{
				resultbox.setText(String.valueOf(num1 / num2));
			}
			operatorLabel.setText("÷");
			break;

		case '%':
			resultbox.setText(String.valueOf(num1 % num2));
			operatorLabel.setText("%");
			break;

		}
	}

	//Main method that calls the calculator
	public static void main(String[] args)
	{
		new Calculator();
	}
}