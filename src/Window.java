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
	JLabel 	lblA, lblB, lblC, lblD, lblE, lblF, lblG, lblH, lblI, lblJ, lblK, lblL, lblM, lblN, lblO, lblP, lblQ,
			lblR, lblS, lblT, lblU, lblV, lblW, lblX, lblY, lblZ, lblGuessedLet, lblPuz1Sub, lblPuz2Sub, lblPuz3Sub;
	JLabel 	puz1_1, puz1_2, puz1_3, puz1_4, puz1_5, puz1_6, puz1_7, puz1_8;
	JLabel 	puz2_1, puz2_2, puz2_3, puz2_4, puz2_5, puz2_6, puz2_7, puz2_8, puz2_9, puz2_10, puz2_11, puz2_12;
	JLabel 	puz3_1, puz3_2, puz3_3, puz3_4, puz3_5, puz3_6, puz3_7, puz3_8, puz3_9, puz3_10, 
			puz3_11, puz3_12, puz3_13, puz3_14, puz3_15, puz3_16, puz3_17, puz3_18, puz3_19;
	JFrame 	frame = new JFrame();
	JLabel lblp1Bank, lblp2Bank, lblp3Bank, lblBankInfo;
	JButton buyAVowel = new JButton("Buy a Vowel!");
	JButton solve = new JButton("Solve?");
	JButton Spin = new JButton ("Spin the Wheel!");
	JLabel lblWheel;
	JLabel lblHint;
	int CurrentLevel = 0;
	
	boolean running = false;
	
	// the user gets the certain amount of money from the wheel
	int WheelArr[] = 
		{-1,800,350,450,700,300,600,500,300,600,300,500,800,550,400,300,900,500,300,900,-2,600,400,300 };
	
	String input;	// user input from JOptionPane
	char CharPuzzleOne[] = 
		{'E','L','O','N','M','U','S','K'};
	char CharPuzzleTwo[] = 
		{'B','L','A','C','K','P','A','N','T','H','E','R'};
	char CharPuzzleThree[] = 
		{'S','A','N','D','M','A','N','B','Y','M','E','T','A','L','L','I','C','A'};
	
	String Puz1Sub = "Proper Name";	
	String Puz2Sub = "Movie Title";
	String Puz3Sub = "Song/Artist";
	String Puz1Ans = "ELON MUSK";
	String Puz2Ans = "BLACK PANTHER";
	String Puz3Ans = "SANDMAN BY METALLICA";
	
	// CONTRUCTOR //
	public Window()
	{
		// Adds buttons to action listener (needed for pressing button)
		buyAVowel.addActionListener(this);
		solve.addActionListener(this);
		
		init();		// Creates main window
		create();	// Creates objects to be added to window 
		add();		// Adds objects to window
		set();		// Sets objects in window
		
		while(running)
		{
			
		}
		
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
	}
		
	public void create()
	{
		lblp1Bank = new JLabel("$" + Player.getp1Total());
		lblp2Bank = new JLabel("$" + Player.getp2Total());
		lblp3Bank = new JLabel("$" + Player.getp3Total());
		lblBankInfo = new JLabel("Player 1 total:           Player 2 total:          Player 3 total:");
		
		lblWheel = new JLabel();
		lblHint = new JLabel();
		
		lblGuessedLet = new JLabel("Guessed Letters:");
		lblA = new JLabel("");
		lblB = new JLabel("");
		lblC = new JLabel("");
		lblD = new JLabel("");
		lblE = new JLabel("");
		lblF = new JLabel("");
		lblG = new JLabel("");
		lblH = new JLabel("");
		lblI = new JLabel("");
		lblJ = new JLabel("");
		lblK = new JLabel("");
		lblL = new JLabel("");
		lblM = new JLabel("");
		lblN = new JLabel("");
		lblO = new JLabel("");
		lblP = new JLabel("");
		lblQ = new JLabel("");
		lblR = new JLabel("");
		lblS = new JLabel("");
		lblT = new JLabel("");
		lblU = new JLabel("");
		lblV = new JLabel("");
		lblW = new JLabel("");
		lblX = new JLabel("");
		lblY = new JLabel("");
		lblZ = new JLabel("");
	}
	
	public void add()
	{
		// Add objects to window
		frame.add(lblp1Bank);
		frame.add(lblp2Bank);
		frame.add(lblp3Bank);
		frame.add(buyAVowel);
		frame.add(lblBankInfo);
		frame.add(lblWheel);
		frame.add(lblA);
		frame.add(lblB);
		frame.add(lblC);
		frame.add(lblD);
		frame.add(lblE);
		frame.add(lblF);
		frame.add(lblG);
		frame.add(lblH);
		frame.add(lblI);
		frame.add(lblJ);
		frame.add(lblK);
		frame.add(lblL);
		frame.add(lblM);
		frame.add(lblN);
		frame.add(lblO);
		frame.add(lblP);
		frame.add(lblQ);
		frame.add(lblR);
		frame.add(lblS);
		frame.add(lblT);
		frame.add(lblU);
		frame.add(lblV);
		frame.add(lblW);
		frame.add(lblX);
		frame.add(lblY);
		frame.add(lblZ);
		frame.add(lblGuessedLet);
		lblWheel.setIcon(new ImageIcon("Pics/Wheel.png"));
	}
	
	public void set()
	{
		// Sets objects in certain areas of the frame object.
				lblBankInfo.setBounds(50,25,300,50);
				lblp1Bank.setBounds(50,40,50,50);
				lblp2Bank.setBounds(160,40,50,50);
				lblp3Bank.setBounds(265,40,50,50);
				buyAVowel.setBounds(500,400,110,50);
				lblWheel.setBounds(50,100,400,400);
				lblGuessedLet.setBounds(100, 650, 100, 50);
				lblA.setBounds(100,685,20,20);
				lblB.setBounds(120,685,20,20);
				lblC.setBounds(140,685,20,20);
				lblD.setBounds(160,685,20,20);
				lblE.setBounds(180,685,20,20);
				lblF.setBounds(200,685,20,20);
				lblG.setBounds(220,685,20,20);
				lblH.setBounds(240,685,20,20);
				lblI.setBounds(260,685,20,20);
				lblJ.setBounds(280,685,20,20);
				lblK.setBounds(300,685,20,20);
				lblL.setBounds(320,685,20,20);
				lblM.setBounds(340,685,20,20);
				lblN.setBounds(360,685,20,20);
				lblO.setBounds(380,685,20,20);
				lblP.setBounds(400,685,20,20);
				lblQ.setBounds(420,685,20,20);
				lblR.setBounds(440,685,20,20);
				lblS.setBounds(460,685,20,20);
				lblT.setBounds(480,685,20,20);
				lblU.setBounds(500,685,20,20);
				lblV.setBounds(520,685,20,20);
				lblW.setBounds(540,685,20,20);
				lblX.setBounds(560,685,20,20);
				lblY.setBounds(580,685,20,20);
				lblZ.setBounds(600,685,20,20);
	}
	
	public void setUp()
	{
		Boolean[] lettersGuessed = new Boolean[26];
		for(int i = 0; i < lettersGuessed.length; i++)
		{
			lettersGuessed[i] = false;
			
		}
	}

	// This method handles user input (pressing a button)
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == buyAVowel)
		{
			input = JOptionPane.showInputDialog("Please guess a Vowel.");
		}
		else if (e.getSource() == solve)
		{
			input = JOptionPane.showInputDialog("Please Solve the Puzzle:");
			if (CurrentLevel == 0)
			{
				input.toUpperCase();
				
				if(input == Puz1Ans)
				{
					
				}
				else if(input != Puz1Ans)
				{
					
				}
				CurrentLevel++;
			}
			
			else if (CurrentLevel == 1)
			{
				input.toUpperCase();
				
				if(input == Puz2Ans)
				{
					
				}
				else if(input  != Puz2Ans)
				{
					
				}
				CurrentLevel++;
			}
			
			else if (CurrentLevel == 2)
			{
				input.toUpperCase();
				
				if(input == Puz3Ans)
				{
					
				}
				else if(input != Puz3Ans)
				{
					
				}
				JOptionPane.showMessageDialog(null, "Thank you for playing! You made a total of $" + Player.getp1Total());
			}
			
		}
	}
}
