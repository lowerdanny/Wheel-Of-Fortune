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
import java.util.Random;
import java.math.*;

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
			lblR, lblS, lblT, lblU, lblV, lblW, lblX, lblY, lblZ, lblGuessedLet, lblPuzSubject;
	JLabel 	puz1, puz2, puz3, puz4, puz5, puz6, puz7, puz8, puz9, puz10, puz11, puz12;

	JFrame 	frame = new JFrame();
	JLabel lblp1Bank, lblp2Bank, lblp3Bank, lblBankInfo;
	JButton buyAVowel = new JButton("Buy a Vowel!");
	JButton Solve = new JButton("Solve?");
	JButton Spin = new JButton ("Spin the Wheel!");
	JLabel lblWheel;
	JLabel lblHint;
	int CurrentLevel = 0;
	char letter;
	
	boolean run = false;	
	private static boolean okConst = false;
	private static boolean okVowel = false;

	// the user gets the certain amount of money from the wheel
	int WheelArr[] = 
		{-1,800,350,450,700,300,600,500,300,600,300,500,800,550,400,300,900,500,300,900,-2,600,400,300 };
	
	String input;	// user input from JOptionPane
	char CharPuzzleOne[] = 
		{'E','L','O','N','M','U','S','K'};						// 8 chars total
	char CharPuzzleTwo[] = 
		{'B','L','A','C','K','P','A','N','T','H','E','R'};		// 12 chars total
	char CharPuzzleThree[] = 
		{'A','N','T','H','E','M'};								// 6 chars total
	
	String Puz1Sub = "Subject:                               Famous People";	
	String Puz2Sub = "Subject:                               Movie Title";
	String Puz3Sub = "Subject:                               Video Game Title";
	String Puz1Ans = "ELON MUSK";
	String Puz2Ans = "BLACK PANTHER";
	String Puz3Ans = "ANTHEM";
	
	// CONTRUCTOR //
	public Window()
	{
		//LevelOne();
		// Adds buttons to action listener (needed for pressing buttons)
		buyAVowel.addActionListener(this);
		Solve.addActionListener(this);
		Spin.addActionListener(this);
		
		init();		// Creates main window
		create();	// Creates objects to be added to window 
		add();		// Adds objects to window
		set();		// Sets objects in window
		
		while(!run)
		{
			LevelOne();
			//LevelTwo();
			//LevelThree();
			
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
		
		lblPuzSubject = new JLabel();
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
		
		puz1 = new JLabel();
		puz2 = new JLabel();
		puz3 = new JLabel();
		puz4 = new JLabel();
		puz5 = new JLabel();
		puz6 = new JLabel();
		puz7 = new JLabel();
		puz8 = new JLabel();
		puz9 = new JLabel();
		puz10 = new JLabel();
		puz11 = new JLabel();
		puz12 = new JLabel();

	}
	
	public void add()
	{
		// Add objects to window
		frame.add(lblp1Bank);
		frame.add(lblp2Bank);
		frame.add(lblp3Bank);
		frame.add(buyAVowel);
		frame.add(Solve);
		frame.add(Spin);
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
		frame.add(lblPuzSubject);
		lblWheel.setIcon(new ImageIcon("Pics/Wheel.png"));
		
		frame.add(puz1);
		frame.add(puz2);
		frame.add(puz3);
		frame.add(puz4);
		frame.add(puz5);
		frame.add(puz6);
		frame.add(puz7);
		frame.add(puz8);
		frame.add(puz9);
		frame.add(puz10);
		frame.add(puz11);
		frame.add(puz12);


	}
	
	public void set()
	{
		// Sets objects in certain areas of the frame object.
				lblBankInfo.setBounds(50,25,300,50);
				lblp1Bank.setBounds(50,40,50,50);
				lblp2Bank.setBounds(160,40,50,50);
				lblp3Bank.setBounds(265,40,50,50);
				buyAVowel.setBounds(500,400,110,50);
				Solve.setBounds(610,400,110,50);
				Spin.setBounds(720,400,150,50);
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
				lblPuzSubject.setBounds(800,100,500,40);
				
				puz1.setBounds(800,200,20,20);
				puz2.setBounds(830,200,20,20);
				puz3.setBounds(860,200,20,20);
				puz4.setBounds(890,200,20,20);
				puz5.setBounds(920,200,20,20);
				puz6.setBounds(950,200,20,20);
				puz7.setBounds(980,200,20,20);
				puz8.setBounds(1010,200,20,20);
				puz9.setBounds(1010,200,20,20);
				puz10.setBounds(1040,200,20,20);
				puz11.setBounds(1070,200,20,20);
				puz12.setBounds(1100,200,20,20);
	}
	
	public void LevelOne()
	{
		setOne();
		/*
		boolean flag = false;
		while(!flag)
		{
			if(input == )
			
			flag = true;
		}
		*/
		//breakOne();
	}
	public void setOne()
	{
		lblPuzSubject.setText(Puz1Sub);
	}
	public void breakOne()
	{
		lblPuzSubject.setText("");
	}
	
	public void LevelTwo()
	{
		boolean test = false;
		//setTwo();
		while(test)
		{
			System.out.println("This is a test");
			if(test == false)
			{
				break;
			}
		}
		breakTwo();
	}
	public void setTwo()
	{
		
	}
	public void breakTwo()
	{
		
	}
	
	public void LevelThree()
	{
		
	}
	public void setThree()
	{
		
	}
	public void breakThree()
	{
		
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
		else if (e.getSource() == Solve)
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
		else if(e.getSource() == Spin)
		{
			Random R = new Random();
			int r = R.nextInt(24);
			JOptionPane.showMessageDialog(null, "The Wheel Landed on: $" + WheelArr[r]);
			do
			{
				input = JOptionPane.showInputDialog("Please guess a constonant");
				letter = Player.getChar(input);
				
			}
			while(okConst);
				
			if(WheelArr[r] == -1)
			{
				System.out.println("You lost a turn!");
			}
			else if(WheelArr[r] == -1)
			{
				System.out.println("You're Bankrupt! You lose all your money!");
			}
			
			
		}
	}
}
