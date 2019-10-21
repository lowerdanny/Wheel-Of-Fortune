import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
/* Some methods were inherited by another Wheel of Fortune project made by:
 * Randy Gillette, Gail Morrison, Stephen Dembrak, Mackenzie Davis, and Jared Ward
 */
public class WheelOfFortune 
{
	/* DECLARATIONS/DATA FIELDS */
    private static int spinInt;//need to add 1 because random end is exclusive
    private static final int[] spinCash = {0,1,800,350,450,700,300,600,500,300,600,300,500,800,550,400,300,900,500,350,900,600,400,300};
    static int u = 0;
    static String choice;
    static Player p1 = new Player();
    static Player p2 = new Player();
    static Player p3 = new Player();
    static Player p4 = new Player();
    static ArrayList<Player> players = new ArrayList<Player>();
    static int rob;
    static String strGuess;
    static char[] finalGuess;
    static char chGuess;
    static String genre;
    static char[] puzzle;
    static char[] hidden;
    static int playerAmount;
    static Random randNum = new Random();
    static Scanner scMain = new Scanner(System.in);
    static Scanner scMain1 = new Scanner(System.in).useDelimiter("\n");
    
    static String[] before_and_after = new String [5];
    static String[] events = new String [5];
    static String[] movie_title = new String [5];
    static String[] on_the_map = new String [5];
    static String[] what_are_you_doing = new String [5];
    
    // Main method to run entire game
    public static void main(String[] args) 
    {
        //Variables
        
        p1.isTurn(false);
        p2.isTurn(false);
        p3.isTurn(false);
        p4.isTurn(false);
        

        System.out.println("Welcome to Wheel of Fortune!");
        
        int fk = 0;
        while(fk == 0)
        {
            System.out.println("To play the game, enter S.");
            System.out.println("To exit enter E.");
            String startMain = scMain.next();
            switch (startMain)
            {
                case "s": 
                {
                	 before_and_after [0] = "A BLAST FROM THE PAST PRESENT AND FUTURE";
                     before_and_after [1] = "A CHIP OFF OF THE OLD BLOCK PARTY";
                     before_and_after [2] = "A HOLE IN ONE WAY TICKET";
                     before_and_after [3] = "A HOUSE IS NOT A HOME ON THE RANGE";       
                     before_and_after [4] = "A LONG SHOT IN THE DARK";
     
                     events [0] = "AFTERSCHOOL ACTIVITIES";
                     events [1] = "BOXING MATCH";
                     events [2] = "TUESDAY NIGHT JAVA CLASS";
                     events [3] = "FOOTBALL GAMES";
                     events [4] = "GRADUATION DAY";

                     movie_title [0] = "A CLOCKWORK ORANGE";
                     movie_title [1] = "BLAZING SADDLES";
                     movie_title [2] = "CHITTY CHITTY BANG BANG";
                     movie_title [3] = "DOCTOR STRANGE";
                     movie_title [4] = "FROM RUSSIA WITH LOVE";
     
                     on_the_map [0] = "CHATTANOOGA TENNESSEE";
                     on_the_map [1] = "NASSAU BAHAMAS";
                     on_the_map [2] = "HONOLULU HAWAII";
                     on_the_map [3] = "BORA BORA";
                     on_the_map [4] = "PARIS FRANCE";
     
                     what_are_you_doing [0] = "BITING MY TOUNGUE";
                     what_are_you_doing [1] = "BUYING A ROUND FOR EVERYONE";
                     what_are_you_doing [2] = "CASTING MY VOTE";
                     what_are_you_doing [3] = "WRITING JAVA STATEMENT";
                     what_are_you_doing [4] = "FINISHING THE GROUP PROJECT";
                     fk++;
                }
        }
        
        System.out.print("There must be 3 players present to play.");
        playerAmount = 3;
        System.out.println();
        System.out.print("How many puzzles would you like to play? (1-25):");
        int puzzleAmount = scMain.nextInt();
        for(int ran = 0; ran <= puzzleAmount; ran++)
        {

        // Player Name Initialization.
        String playName;
        
        for(int k = 0; k < playerAmount; k++)
        {
            switch (k)
            {
                case 0: System.out.println("Enter Player " + (k+1) + "'s name:");
                        players.add(p1);
                        playName = scMain.next();
                        players.get(k).setName(playName);
                        players.get(k).newGame();
                    break;
                case 1: System.out.println("Enter Player " + (k+1) + "'s name:");
                        playName = scMain.next();
                        players.add(p2);
                        players.get(k).setName(playName);
                        players.get(k).newGame();
                    break;
                case 2: System.out.println("Enter Player " + (k+1) + "'s name:");
                        playName = scMain.next();
                        players.add(p3);
                        players.get(k).setName(playName);
                        players.get(k).newGame();
                    break;
            }
        }
        
        p1.isTurn(true);
        String hide;
        newPuzz();
        // Display Each Player's Balance
        while(u < playerAmount)
        {
            if(players.get(u).getTurn())
            {        
            	System.out.println("___________________________________________________");
            	System.out.println(players.get(u).getName() + "'s Balance: " + players.get(u).getRBal());
            	System.out.println("Its " + players.get(u).getName() + "'s turn");
            	System.out.println("Subject: " + genre);
            	System.out.println();
            	hide = Arrays.toString(hidden);
            	System.out.println(hide);
            	takeTurn();
            }
        
        	}
        }
        
        }
    }
    
    // Spin method handles random numbers to go between 0 and 24 (Size of wheel)
    public static int spin()
    {
        // Spins a number to the array loaded at beginning
        int fin = 0;
        spinInt = randNum.nextInt(23);
        if(spinInt >= 2)
        {
           fin = spinCash[spinInt]; 
        }
        // If spun a "0" in the array, you lose a turn
        else if(spinInt == 0)
        {
            fin = 0;
        }
        // If spun "1" in the array, you go bankrupt
        else if(spinInt == 1)
        {
            fin = 0;
        }
        return fin;
    }
    
    // This method handles whose turn it is and whose turn is next
    public static void takeTurn()
    {
                    System.out.println("Would you like to Spin (S), Solve the Puzzle (P), or buy a vowel (B)?");
                    choice = scMain.next();
                    //System.out.println(choice);
                    int rbal;
                    switch (choice)
                    {
                        case "s":rob = spin();
                                 
                                 if (spinCash[spinInt] == 0)
                                 {
                                     System.out.println("You lose a turn!");
                                     u++;
                                     if (u >= playerAmount)
                                        {
                                            u = 0;
                                            players.get(u).isTurn(true);
                                            
                                        }
                                        
                                        else
                                        {
                                            players.get(u).isTurn(true);
                                        }
                                 }
                                 else if (spinCash[spinInt] == 1)
                                 {
                                     System.out.println("Bankrupt!");
                                     u++;
                                     if (u >= playerAmount)
                                        {
                                            u = 0;
                                            players.get(u).isTurn(true);
                                            
                                        }
                                        
                                        else
                                        {
                                            players.get(u).isTurn(true);
                                        }
                                 }
                                 else
                                 {
                                	 System.out.println("The wheel landed on: $" + spinCash[spinInt]);
                                	 System.out.println("What constonant will you guess?");
                                     strGuess = scMain.next();
                                     chGuess = strGuess.charAt(0);
                                     while(chGuess == 'a'|| chGuess == 'e'||chGuess =='i'||chGuess =='o'||chGuess =='u'||chGuess =='y')
                                    {
                                    	System.out.println("Guess cannot be a vowel. Try again.");                                   
                                    	strGuess = scMain.next();
                                    	chGuess = strGuess.charAt(0);
                                     }
                                     
                                    if(!isGuessCorrect(puzzle, chGuess))
                                    {
                                        System.out.println("Wrong choice, End of turn");
                                        players.get(u).isTurn(false);
                                        u++;//ends turn
                                        //System.out.println(u);
                                        //System.out.println(playerAmount);
                                        if (u >= playerAmount)
                                        {
                                            u = 0;
                                            players.get(u).isTurn(true);
                                            
                                        }
                                        
                                        else
                                        {
                                            players.get(u).isTurn(true);
                                        }
                                        //System.out.println(u);
                                       // System.out.println(playerAmount);
                                        break;
                                    }
                                    else
                                    {
                                        hidden = revealLetter(puzzle ,hidden, chGuess);
                                        rbal = rob * spinMulti();
                                        players.get(u).addrBal(rbal);
                                        if (isPhraseSolved(puzzle, hidden))
                                        {
                                            players.get(u).addTBal(0);
                                            System.out.println("Congratulations!");
                                            newPuzz();
                                            for(int lit = 0; lit < playerAmount; lit++)
                                            {
                                                players.get(lit).bankrupt();
                                            }
                                        }
                                    }
                                 }
                                 
                                 break;
                        case "p":System.out.println("What is your guess?");
                                 strGuess = scMain1.next();
                                 strGuess = strGuess.toUpperCase();
                                 String strPuzzle = puzzle.toString();
                                 //finalGuess = strGuess.toCharArray();
                                 if (isFinalGuessCorrect(strPuzzle, strGuess))
                                 {
                                     System.out.println("Correct!");
                                     System.out.println("");
                                     players.get(u).addTBal(1000);
                                     newPuzz();
                                     for(int li = 0; li < playerAmount; li++)
                                     {
                                         players.get(li).bankrupt();
                                     }
                                    
                                 }
                                 else
                                 {
                                     System.out.println("Incorrect, your turn is over");
                                     players.get(u).isTurn(false);
                                     u++;//ends turn
                                     if (u >= playerAmount)
                                     {
                                         players.get(0).isTurn(true);
                                         u = 0;
                                     }
                                     else
                                     {
                                         players.get(u).isTurn(true);
                                     }
                                 }
                                 break;
                        case "b": 
                        if(players.get(u).getRBal() > 250)
                        {
                        	System.out.println("What vowel would you like to buy?");
                        	//remove 250 from balance
                        	players.get(u).addrBal(-250);
                        	
                        	strGuess = scMain.next();
                            chGuess = strGuess.charAt(0);
                        	while(chGuess=='b'||chGuess=='c'||chGuess=='d'||chGuess=='f'||chGuess=='g'||chGuess=='h'||chGuess=='j'||chGuess=='k'||
                        		  chGuess=='l'||chGuess=='m'||chGuess=='n'||chGuess=='p'||chGuess=='q'||chGuess=='r'||chGuess=='s'||chGuess=='t'||
                        		  chGuess=='v'||chGuess=='x'||chGuess=='z')
                            {
                            	System.out.println("Guess must be a vowel. Try again.");
                            	strGuess = scMain.next();
                            	chGuess = strGuess.charAt(0);
                            }
                        	
                        	if(!isGuessCorrect(puzzle, chGuess))
                        	{
                        		System.out.println("Wrong choice, End of turn");
                        		players.get(u).isTurn(false);
                        		u++;//ends turn
                        		//System.out.println(u);
                        		//System.out.println(playerAmount);
                        		if (u >= playerAmount)
                        		{
                        			u = 0;
                        			players.get(u).isTurn(true);
                                
                        		}
                            
                        		else
                        		{
                        			players.get(u).isTurn(true);
                        		}
                        		//System.out.println(u);
                        		// System.out.println(playerAmount);
                        		break;
                        	}
                        	else
                        	{
                        		hidden = revealLetter(puzzle ,hidden, chGuess);
                        		//rbal = rob * spinMulti();
                        		//players.get(u).addrBal(rbal);
                        		if (isPhraseSolved(puzzle, hidden))
                        		{
                        			players.get(u).addTBal(0);
                        			System.out.println("Congratulations!");
                        			newPuzz();
                        			for(int lit = 0; lit < playerAmount; lit++)
                        			{
                        				players.get(lit).bankrupt();
                        			}
                        		}
                        	}
                        	break;
                        }
                        else 
                        {
                        	System.out.println("You don't have the funds available!");
                        }
                        default: System.out.println("");
                                 System.out.println("Not an option");
                                 break;
                    }
    }
    
    // Method handles final guess and String of current puzzle
    private static boolean isFinalGuessCorrect(String strPuz, String fGuess)
    {
    	boolean correct;
		if(strPuz == fGuess)
		{
			correct = true;
		}
		else
		{
			correct = false;
		}
		return correct;
	}

    // Method handles the ability to spin multiple times
	public static int spinMulti()
    {
        int i = 0;
        String s = Arrays.toString((puzzle));
        
        for(int m = 0; m < s.length(); m++)
        {
            if(Character.toUpperCase(s.charAt(m)) == Character.toUpperCase(chGuess))
            {
                i++;
            }
        }
        
        return i;
    }
    
	// Random numbers to designate what category and what puzzle is next
    public static void newPuzz()
    {
        int puzCat = 0;
        puzCat = randNum.nextInt(25);
        switch(puzCat)
        {
            case 0: puzzle = phraseToArray(before_and_after[0]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "Before and After"; 
                break;
            case 1: puzzle = phraseToArray(before_and_after[1]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "Before and After"; 
                break;
            case 2: puzzle = phraseToArray(before_and_after[2]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "Before and After"; 
                break;
            case 3: puzzle = phraseToArray(before_and_after[3]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "Before and After"; 
                break;
            case 4: puzzle = phraseToArray(before_and_after[4]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "Before and After"; 
                break;
            case 5: puzzle = phraseToArray(events[0]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "Events"; 
                break;
            case 6: puzzle = phraseToArray(events[1]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "Events";
                break;
            case 7: puzzle = phraseToArray(events[2]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "Events";
                break;
            case 8: puzzle = phraseToArray(events[3]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "Events";
                break;
            case 9: puzzle = phraseToArray(events[4]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "Events";
                break;
            case 10: puzzle = phraseToArray(movie_title[0]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "Movie Title";
                break;
            case 11: puzzle = phraseToArray(movie_title[1]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "Movie Title";
                break;
            case 12: puzzle = phraseToArray(movie_title[2]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "Movie Title";
                break;
            case 13: puzzle = phraseToArray(movie_title[3]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "Movie Title";
                break;
            case 14: puzzle = phraseToArray(movie_title[4]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "Movie Title";
                break;
            case 15: puzzle = phraseToArray(on_the_map[0]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "On the Map";
                break;
            case 16: puzzle = phraseToArray(on_the_map[1]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "On the Map";
                break;
            case 17: puzzle = phraseToArray(on_the_map[2]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "On the Map";
                break;
            case 18: puzzle = phraseToArray(on_the_map[3]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "On the Map";
                break;
            case 19: puzzle = phraseToArray(on_the_map[4]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "On the Map";
                break;
            case 20: puzzle = phraseToArray(what_are_you_doing[0]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "What are you Doing?";
                break;
            case 21: puzzle = phraseToArray(what_are_you_doing[1]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "What are you Doing?";
                break;
            case 22: puzzle = phraseToArray(what_are_you_doing[2]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "What are you Doing?";
                break;
            case 23: puzzle = phraseToArray(what_are_you_doing[3]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "What are you Doing?";
                break;
            case 24: puzzle = phraseToArray(what_are_you_doing[4]);
                    hidden = phraseArrayToBlank(puzzle);
                    genre = "What are you Doing?";
                break;
        }
        
    }
    
    // Convert phrase (string) to array (Char array) used for guessing
    public static char[] phraseToArray(String newPhrase)
        {
            char[] array = new char [newPhrase.length()];
            for (int index = 0; index < newPhrase.length(); index++)
            {
                array[index] = newPhrase.charAt(index);
            }
            return array;
            
        }
    
    // Changes the array of the real puzzle to hidden array
    public static char[] phraseArrayToBlank (char[] phraseArray)
        {
            char[] hiddenArray = new char [phraseArray.length];
            for (int index = 0; index < phraseArray.length; index++)
            {
                if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(Character.toUpperCase(phraseArray[index])) >= 0)  
                    hiddenArray[index] = '*';
                
                else 
                    hiddenArray[index] = phraseArray[index];
                    }
            return hiddenArray;
        }
       
    /*
    // Simply removes
    public static String letterRemove (String letterStr, char letter)
        {
            String letterStrRemove = "";
            int findIndex = letterStr.indexOf (Character.toUpperCase(letter));
            
            letterStrRemove = letterStr.substring(0,findIndex) + letterStr.substring(findIndex+1);
            
            return letterStrRemove;
        }
      
        */
    
    // Controls if the guess in string form (before .charAt()) is correctly guessed to final answer
    public static boolean isGuessCorrect (char[] phraseArray, char guess)
        {
            boolean correct = false;
            for (int index = 0; index < phraseArray.length; index++)
            {
                //if the guess is found in the char array
                if (Character.toUpperCase(phraseArray[index]) == (Character.toUpperCase(guess)))
                {
                    correct = true;
                    break;
                }
                else
                    correct = false;
            }
            if (correct == true)
                return true;
            else
                return false;
        }

    // Arrays compare each other to see if letter has been guessed correctly and reveals good letters
    public static char[] revealLetter (char[] phraseArray, char[] phraseArrayHidden,char guess)
                {
                    for (int index = 0; index < phraseArray.length; index++)
                    {
                        if (Character.toUpperCase(phraseArray[index]) == Character.toUpperCase(guess))
                            phraseArrayHidden[index] = phraseArray[index];
                    }
                    return phraseArrayHidden;
                }
    
    // Checks to see if the hidden array has been fully solved
    public static boolean isPhraseSolved (char[] phraseArray, char[] phraseArrayHidden)
        {
            boolean playerWin;
            String pa;
            String pah;
            pa = Arrays.toString(phraseArray);
            pah = Arrays.toString(phraseArrayHidden);
            System.out.println(pah.toUpperCase());
            playerWin = pa.toUpperCase().equals(pah.toUpperCase());
            
            return playerWin;
        }
}
