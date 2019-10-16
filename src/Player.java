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
		return p1TotalMoney;
	}
	
	public static int getp2Total()
	{
		return p2TotalMoney;
	}
	
	public static int getp3Total()
	{
		return p3TotalMoney;
	}
	
	public static void setp1Total()
	{
		if(p1Money < 0)
		{
			
		}
		
		else if(p1Money > 0)
		{
			p1TotalMoney = p1TotalMoney + p1Money;
		}
	}
	
	public static void setp2Total()
	{
		if(p2Money < 0)
		{
			
		}
		
		else if(p2Money > 0)
		{
			p2TotalMoney = p2Money + p2TotalMoney;
		}
	}
	
	public static void setp3Total()
	{
		if(p3Money < 0)
		{
			
		}
		
		else if(p3Money > 0)
		{
			p3TotalMoney = p3Money + p3TotalMoney;
		}
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

