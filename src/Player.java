
public class Player 
{
	/* DECLARATIONS/DATA FIELDS */
    private String playerName;
    private int totalBalance;
    private int roundBalance;
    private boolean myTurn;
    
    // Constructor that doesn't do anything
    public Player(){}
    
    // Takes String and makes it the new player's name
    public void setName(String n)
    {
        playerName = n;
    }
    
    // Getter for receiving player's name
    public String getName()
    {
        return playerName;
    }
    
    // Method to reset the balance to 0 
    public void newGame()
    {
        totalBalance = 0;
        roundBalance = 0;
    }
    
    // Method to add money to round balance
    public void addrBal(int rb)
    {
       roundBalance += rb;
    }
    
    // Method to add the round balance to the total balance
    public void addTBal(int tb)
    {
        totalBalance += roundBalance;
    }
    
    // Getter to receive the total balance
    public int getTBal()
    {
        return totalBalance;
    }
    
    // Getter to receive the round balance
    public int getRBal()
    {
        return roundBalance;
    }
    
    // Sets round balance to 0 for the start of a new round
    public void bankrupt()
    {
        roundBalance = 0;
    }
    
    // Sets the boolean variable to tell whose turn it is
    public void isTurn(boolean t)
    {
        myTurn = t;
    }
    
    // Returns true or false to tell whose turn it is
    public boolean getTurn()
    {
        return myTurn;
    }
}
