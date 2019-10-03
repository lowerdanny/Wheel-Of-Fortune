/*	Player.java
 * 
 * 	Version 0.0.1	
 * 
 * Description: This class does the functions that are required to change the text of the labels
 * 				of the window class. This class also serves to do math for the total money gained per
 * 				round and the total bank per player.
 * 	Updated 10/3/2019
 * 		Work done:
 * 			- Created player file extending window for player information and manipulation
 * 			- Created backbone for player interaction through guessing letters
 * 
 * 
 */
public class Player extends Window
{

	

	public char playerInput(String input)	// User string input
	{
		input.toUpperCase();		// Casts all input to upper case letters
		letter = input.charAt(0);	// Letter input is first char of string
		
		/*		MAKE IF STATEMENT TO MAKE SURE THAT INPUT ISNT A NUMBER AND ONLY A LETTER
		 * 		IF NOT A LETTER, MAKE USER TRY AGAIN.
		if(letter )
		{
			
		}
		*/
		
		// If 
		/*else*/ //if()
		{
			
		}
		
		return letter;
	}
	
	// This method 
	public char cpuChoice()
	{
		char a = 'a';
		
		return a;
	}
}

