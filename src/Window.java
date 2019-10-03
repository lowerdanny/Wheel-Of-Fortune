/*	Window.java
 * 	Description: This is the main window class. This class uses all swing objects to disposal.
 * 	
 * 	Version 0.0.2
 * 
 * 	Update 9/28/2019
 * 		Work done:
 * 			- Created window object
 * 			- Created init() method that creates the window nothing more
 * 			- Added action listener to window for user input through buttons
 * 			- Created objects for buttons and textboxes
 * Update 10/3/2019
 * 		Work done:
 * 			- Created more objects to be added to the window
 * 			- Added Player.java class to project
 * 			- Added player total and round banks (default of $0 balance)
 * 			- Added a button for buying a vowel
 * 			- Added array to represent the wheel
 * 			- Added puzzle hint strings
 * 			- Decided to use JOptionPane for user input 
 * 			- Removed Window extends JFrame
 * 			- Player extends window to get player banks information for manipulation
 */

/* IMPORT LIBRARIES */
import java.awt.event.ActionEvent;		// Does actions based on user input
import java.awt.event.ActionListener;	// Needed for button pressing
import javax.swing.JButton;				// Button for the user to buy a vowel
import javax.swing.JFrame;				// Needed for Jframe object
import javax.swing.JLabel;				// Labels to be put in frame
import javax.swing.JOptionPane;			// Needed for user input

public class Window implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* DATA FIELDS AND DECLARATIONS */
	int p1Money = 0;		// Players 1-3's money for the individual rounds
	int p2Money = 0;
	int p3Money = 0;
	int p1TotalMoney = 0;	// Players 1-3's money for the total game so far
	int p2TotalMoney = 0;
	int p3TotalMoney = 0;
	
	JFrame frame = new JFrame();
	JLabel lblp1Bank = new JLabel("$" + p1Money);
	JLabel lblp2Bank = new JLabel();
	JLabel lblp3Bank = new JLabel();
	JButton buyAVowel = new JButton();
	
	// This array is the wheel information and depending what the random numbers when the wheel being spun, it corresponds to what
	// the user gets the certain amount of money from the wheel
	String WheelArr[] = {"LOSE A TURN", };
	
	String input;	// user input from JOptionPane
	char letter;	// Letter input from input
	
	char CharPuzzleOne[] = 
		{'T','H','I','S',				// Array 0-3
		'I','S',						// Array 4-5
		'A',							// Array 6
		'P','U','Z','Z','L','E',		// Array 7-12
		'E','X','A','M','P','L','E'};	// Array 13-19
	char CharPuzzleTwo[] = 
		{
				
		};
	char CharPuzzleThree[] = 
		{
				
		};
	
	String Puzzle1 = "This is a puzzle example";	
	String Puzzle2 = "";
	String Puzzle3 = "";
	
	// CONTRUCTOR //
	public Window()
	{
		init();		// Calls and creates the window object to be seen by user
		// System.out.println(CharPuzzleOne[19]); // Debug for puzzle arrays
	}
	
	// This method creates the window and all default objects associated with the window
	public void init()
	{
		// Default window operations
		frame.setTitle("Wheel of fortune");	// Gives frame a title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Closes on default 
		frame.setLayout(null);		// Cancels out affects from FlowLayout (puts all objects from left -> right and ignores bounds set by operator)
		frame.setLocation(250,100);	// This sets where on the screen the window opens when ran
		frame.setVisible(true);		// This allows the window that opens to be visible
		frame.setSize(1200,800);		// Sets the dimensions of the window frame to exact dimensions.
		
		// Add objects to window
		frame.add(lblp1Bank);
		frame.add(lblp2Bank);
		frame.add(lblp3Bank);
		frame.add(buyAVowel);
		//frame.add();
		
		// Sets objects in certain areas of the frame object.
		// lblp1Bank.setBounds();
		
	}

	
	// This method handles user input (pressing a button)
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == buyAVowel)
		{
			
		}
	}
}
