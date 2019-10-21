
public class Puzzle 
{
	// Moves the puzzle String to a char array
	public static char[] phraseToArray(String newPhrase)
	{
		char[] array = new char[newPhrase.length()];
		for (int index = 0; index < newPhrase.length(); index++) {
			array[index] = newPhrase.charAt(index);
		}
		return array;
	}

	// Moves the newly created array to a hidden char array
	public static char[] phraseArrayToBlank(char[] phraseArray)
	{
		char[] hiddenArray = new char[phraseArray.length];
		for (int index = 0; index < phraseArray.length; index++) {
			if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(Character.toUpperCase(phraseArray[index])) >= 0)
				hiddenArray[index] = '*';

			else
				hiddenArray[index] = phraseArray[index];
		}
		return hiddenArray;
	}

	// 
	public static String letterRemove(String letterStr, char letter)
	{
		String letterStrRemove = "";
		int findIndex = letterStr.indexOf(Character.toUpperCase(letter));

		letterStrRemove = letterStr.substring(0, findIndex) + letterStr.substring(findIndex + 1);

		return letterStrRemove;
	}

	// returns true/false if the guess is part of the real array or if bad guess
	public static boolean isGuessCorrect(char[] phraseArray, char guess)
	{
		boolean correct = false;
		for (int index = 0; index < phraseArray.length; index++) {
			// if the guess is found in the char array
			if (phraseArray[index] == (Character.toUpperCase(guess))) {
				correct = true;
				break;
			} else
				correct = false;
		}
		if (correct == true)
			return true;
		else
			return false;
	}

	// Uses the puzzle array and hidden array to compare and reveal the good guessed letter
	public static char[] revealLetter(char[] phraseArray, char[] phraseArrayHidden, char guess)
	{
		for (int index = 0; index < phraseArray.length; index++) {
			if (phraseArray[index] == Character.toUpperCase(guess))
				phraseArrayHidden[index] = phraseArray[index];
		}
		return phraseArrayHidden;
	}

	// 
	public static boolean isPhraseSolved(char[] phraseArray, char[] phraseArrayHidden)
	{
		boolean playerWin = false;
		for (int index = 0; index < phraseArrayHidden.length; index++) {
			if (Character.toUpperCase(phraseArrayHidden[index]) == (phraseArray[index]))

				playerWin = true;

			else {
				playerWin = false;
				break;
			}
		}
		if (playerWin == true)
			return true;
		else
			return false;
	}

	/*
	{ // create and label arrays
		String[] before_and_after = new String[5];
		String[] events = new String[5];
		String[] movie_title = new String[5];
		String[] on_the_map = new String[5];
		String[] what_are_you_doing = new String[5];

		before_and_after[0] = "A BLAST FROM THE PAST PRESENT AND FUTURE";
		before_and_after[1] = "A CHIP OFF OF THE OLD BLOCK PARTY";
		before_and_after[2] = "A HOLE IN ONE WAY TICKET";
		before_and_after[3] = "A HOUSE IS NOT A HOME ON THE RANGE";
		before_and_after[4] = "A LONG SHOT IN THE DARK";

		events[0] = "AFTERSCHOOL ACTIVITIES";
		events[1] = "BOXING MATCH";
		events[2] = "TUESDAY NIGHT JAVA CLASS";
		events[3] = "FOOTBALL GAMES";
		events[4] = "GRADUATION DAY";

		movie_title[0] = "A CLOCKWORK ORANGE";
		movie_title[1] = "BLAZING SADDLES";
		movie_title[2] = "CHITTY CHITTY BANG BANG";
		movie_title[3] = "DOCTOR STRANGE";
		movie_title[4] = "FROM RUSSIA WITH LOVE";

		on_the_map[0] = "CHATTANOOGA TENNESSEE";
		on_the_map[1] = "NASSAU BAHAMAS";
		on_the_map[2] = "HONOLULU HAWAII";
		on_the_map[3] = "BORA BORA";
		on_the_map[4] = "PARIS FRANCE";

		what_are_you_doing[0] = "BITING MY TOUNGUE";
		what_are_you_doing[1] = "BUYING A ROUND FOR EVERYONE";
		what_are_you_doing[2] = "CASTING MY VOTE";
		what_are_you_doing[3] = "WRITING JAVA STATEMENT";
		what_are_you_doing[4] = "FINISHING THE GROUP PROJECT";
	}
	*/
}
