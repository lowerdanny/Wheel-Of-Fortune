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
 * 	Updated 10/7/2019
 * 		Work done:
 * 			- Changed this file from confusion to an object class
 * 			- Class now represents the player and the Cpu that plays with person
 * 			- Still needs work done to get getters/setters to work properly
 * 			- All methods are static for some reason? It doesn't seem to bother anything though...
 */
public class Player
{
	private static char letter;	// Letter input from input
	private static int p1Money = 0;		// Players 1-3's money for the individual rounds
	private static int p2Money = 0;
	private static int p3Money = 0;
	private static int p1TotalMoney = 0;	// Players 1-3's money for the total game so far
	private static int p2TotalMoney = 0;
	private static int p3TotalMoney = 0;
	
	public Player()
	{
		
	}
	
	public static int getp1Total()
	{
		p1TotalMoney = p1Money + p1TotalMoney;
		return p1TotalMoney;
	}
	
	public static int getp2Total()
	{
		p2TotalMoney = p2Money + p2TotalMoney;
		return p2TotalMoney;
	}
	
	public static int getp3Total()
	{
		p3TotalMoney = p3Money + p3TotalMoney;
		return p3TotalMoney;
	}
	
	public static char getChar()
	{
		return letter;
	}
	
	public void getCPU()
	{
		
	}
	
	// This method 
	public char cpuChoice()
	{
		char a = 'a';
		
		return a;
	}
}

