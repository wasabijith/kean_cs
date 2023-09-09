package Graphics;
import java.awt.*;       // Using AWT's Graphics and Color  
import java.awt.event.*; // Using AWT event classes and listener interfaces  
import javax.swing.*;    // Using Swing's components and containers  

public class CGTemplate extends JFrame 
{      
	public static final int CANVAS_WIDTH  = 640;      
	public static final int CANVAS_HEIGHT = 480;      
	private DrawCanvas canvas; 
	//Constructor to set up the GUI components and event handlers  
	public CGTemplate() 
	{  
		canvas = new DrawCanvas();    // Construct the drawing canvas         
		canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));  

		// Set the Drawing JPanel as the JFrame's content-pane  
		Container cp = getContentPane();  
		cp.add(canvas);     
		setDefaultCloseOperation(EXIT_ON_CLOSE);   // Handle the CLOSE button          
		pack();              // Either pack() the components; or setSize()         
		setTitle("Lab4 – Let’s make a Circle");  // "super" JFrame sets the title         
		setVisible(true);    // "super" JFrame show  
	}  
	private class DrawCanvas extends JPanel 
	{  
		// Override paintComponent to perform your own painting  
		@Override  
		public void paintComponent(Graphics g) 
		{            
			super.paintComponent(g);     // paint parent's background            
			setBackground(Color.WHITE);  // you can update this                
			g.setColor(Color.GREEN);    // set the drawing color  
			g.drawOval(50, 50, 100, 100); // first two numbers are X&Y coordinates, 100 & 100 are width and height   
			g.fillOval(200, 50, 100, 100);  
			g.setFont(new Font("Monospaced", Font.PLAIN, 12));  
			g.drawString("Circles c1, c2, c3, c4 and c5", 10, 20); 
			
			//circle 2
			g.setColor(Color.BLUE); 
			g.drawOval(50, 50, 500, 500);
			g.fillOval(200, 50, 500, 500);  
			
			//circle 3
			g.setColor(Color.RED); 
			g.drawOval(50, 50, 200, 200);
			g.fillOval(200, 50, 200, 200);  

			//circle 4
			g.setColor(Color.YELLOW); 
			g.drawOval(50, 50, 250, 250);
			g.fillOval(200, 50, 250, 250);  

			//circle 5
			g.setColor(Color.BLACK); 
			g.drawOval(50, 50, 800, 800);
			g.fillOval(200, 50, 800, 800);  
		}
	}  

	public static void main(String[] args) 
	{         
		SwingUtilities.invokeLater(new Runnable() 
		{  
			@Override            
			public void run() {               
				new CGTemplate();   
			}  
		});  
	}  
}  