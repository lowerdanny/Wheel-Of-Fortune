/*	Window.java
 * 	Description: This is the main window class. This class uses all swing objects to disposal.
 * 	
 * 	Version 0.0.1
 * 
 * 	Update 9/28/2019
 * 		Work done:
 * 			- Created window object
 * 			- Created init() method that creates the window nothing more
 * 			- Added action listener to window for user input through buttons
 * 			- Created objects for buttons and textboxes
 * 
 */

/* IMPORT LIBRARIES */
import java.awt.event.ActionEvent;		// Does actions based on user input
import java.awt.event.ActionListener;	// Needed for button pressing
import javax.swing.JFrame;				// Needed for Jframe object
import javax.swing.JTextArea;

public class Window extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* DATA FIELDS */
	JFrame frame;
	JTextArea tb;
	
	String input;	// user input from textbox
	char a;			// Letter input from input
	
	// CONTRUCTOR //
	public Window(String s)
	{
		super(s);	// Gives frame a title
		init();		// Calls and creates the window object to be seen by user
	}
	
	// This method creates the window and all default objects associated with the window
	public void init()
	{
		// Default window operations
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Closes on default 
		setLayout(null);		// Cancels out affects from FlowLayout (puts all objects from left -> right and ignores bounds set by operator)
		setLocation(250,100);	// This sets where on the screen the window opens when ran
		setVisible(true);		// This allows the window that opens to be visible
		setSize(1200,800);		// Sets the dimensions of the window frame to exact dimensions.
		
		// Add objects to window
	}

	// This method handles user input (pressing a button)
	public void actionPerformed(ActionEvent e)
	{
		
	}
}
