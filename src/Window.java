
/*	Window.java
 * 	Description: This is the main window class. This class uses all swing objects to disposal.
 * 	
 * 
 */

/* IMPORT LIBRARIES */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;	// Needed for button pressing
import javax.swing.JFrame;				// Needed for Jframe object

public class Window extends JFrame implements ActionListener
{
	/* DATA FIELDS */
	JFrame frame;
	
	// CONTRUCTOR //
	public Window(String s)
	{
		super(s);	// Gives frame a title
		init();		// Calls and creates the window object to be seen by user
	}
	
	// This method creates the window and all default objects associated with the window
	public void init()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Closes on default 
		setLayout(null);		// Cancels out affects from FlowLayout (puts all objects from left -> right and ignores bounds set by operator)
		setLocation(250,100);	// This sets where on the screen the window opens when ran
		setVisible(true);		// This allows the window that opens to be visible
		setSize(1200,800);		// Sets the dimensions of the window frame to exact dimensions.
	}

	// This method handles user input (pressing a button)
	public void actionPerformed(ActionEvent e)
	{
		
	}
}
