package Lab_Assignment_4;

public class TestCircle 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Circle c1 = new Circle(); 
		System.out.println(c1.toString());
		System.out.println("The radius of c1 = " + c1.getRadius());
		
		//set color 
		c1.setColor(Color.GREEN);
		
		//create a circle with radius 5 
		Circle c2 = new Circle(5);
		c2.setColor(Color.BLUE);
		
		//create a circle with radius 2
		Circle c3 = new Circle(2);
		c3.setColor(Color.RED);
		
		//create a circle with radius 2.5 
		Circle c4 = new Circle(2.5);
		c4.setColor(Color.YELLOW);
		
		//create a circle with radius 10
		Circle c5 = new Circle(10);
		c5.setColor(Color.BLACK);
		c5.setRadius(8); 
		c5.setColor(Color.BROWN);
		
		//add graphics 
		javax.swing.JFrame frame = new javax.swing.JFrame(""); 
		javax.swing.JOptionPane.showMessageDialog(frame, c1.toString(), " c1 information ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
	}
}
