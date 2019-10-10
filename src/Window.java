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
 * Update 10/3/2019
 * 		Work done:
 * 			- Added .png picture to JFrame object
 * 			- changed background to white to match the background of .png of wheel
 */

/* IMPORT LIBRARIES */
import java.awt.Color;
import java.awt.event.ActionEvent;		// Does actions based on user input
import java.awt.event.ActionListener;	// Needed for button pressing

import javax.swing.ImageIcon;
import javax.swing.JButton;				// Button for the user to buy a vowel
import javax.swing.JFrame;				// Needed for Jframe object
import javax.swing.JLabel;				// Labels to be put in frame
import javax.swing.JOptionPane;			// Needed for user input

public class Window implements ActionListener
{
	/* DATA FIELDS AND DECLARATIONS */
	final int WIDTH = 1200;
	final int HEIGHT = 800;
	
	JFrame frame = new JFrame();
	JLabel lblp1Bank = new JLabel("$" + Player.getp1Total());
	JLabel lblp2Bank = new JLabel("$" + Player.getp2Total());
	JLabel lblp3Bank = new JLabel("$" + Player.getp3Total());
	JLabel lblBankInfo = new JLabel("Player 1 total:           Player 2 total:          Player 3 total:");
	JButton buyAVowel = new JButton("Buy a Vowel!");	
	JLabel lblWheel = new JLabel();
	JLabel lblHint = new JLabel();
	
	int CurrentLevel = 0;
	
	// This array is the wheel information and depending what the random numbers when the wheel being spun, it corresponds to what
	// the user gets the certain amount of money from the wheel
	String WheelArr[] = {"LOSE A TURN", };
	String input;	// user input from JOptionPane
	
	
	char CharPuzzleOne[] = 
		{'E','L','O','N','M','U','S','K'};
	char CharPuzzleTwo[] = 
		{'B','L','A','C','K','P','A','N','T','H','E','R'};
	char CharPuzzleThree[] = 
		{'S','A','N','D','M','A','N','B','Y','M','E','T','A','L','L','I','C','A'};
	
	String Puzzle1 = "Proper Name";	
	String Puzzle2 = "Movie Title";
	String Puzzle3 = "Song/Artist";
	
	String Puzzle1Answer = "ELON MUSK";
	String Puzzle2Answer = "BLACK PANTHER";
	String Puzzle3Answer = "SANDMAN BY METALLICA";
	
	// CONTRUCTOR //
	public Window()
	{
		init();		// Calls and creates the window object to be seen by user
		setUp();	// Method calls on various arrays to be loaded into memory
		
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
		frame.setSize(WIDTH, HEIGHT);		// Sets the dimensions of the window frame to exact dimensions.
		frame.getContentPane().setBackground(Color.WHITE);	// Sets background color to white
		
		// Adds buttons to action listener (needed for pressing button)
		buyAVowel.addActionListener(this);
		
		// Add objects to window
		frame.add(lblp1Bank);
		frame.add(lblp2Bank);
		frame.add(lblp3Bank);
		frame.add(buyAVowel);
		frame.add(lblBankInfo);
		frame.add(lblWheel);
		lblWheel.setIcon(new ImageIcon("Pics/Wheel.png"));
		
		// Sets objects in certain areas of the frame object.
		lblBankInfo.setBounds(50,25,300,50);
		lblp1Bank.setBounds(50,40,50,50);
		lblp2Bank.setBounds(160,40,50,50);
		lblp3Bank.setBounds(265,40,50,50);
		buyAVowel.setBounds(500,400,150,100);
		lblWheel.setBounds(50,100,400,400);
		
	}
	
	public void setUp()
	{
		Boolean[] lettersGuessed = new Boolean[26];
		for(int i = 0; i < lettersGuessed.length; i++)
		{
			lettersGuessed[i] = false;
			
		}
		
		for(int i = 0; i < CharPuzzleOne.length; i++)
		{
			
		}
	}

	// This method handles user input (pressing a button)
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == buyAVowel)
		{
			input = JOptionPane.showInputDialog("Please guess a Vowel.");
		}
	}
}
