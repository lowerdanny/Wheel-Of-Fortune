/*	Name: Daniel V Dalessandro 
 * 	Description: This is the Main file class, and does nothing too special
 * 		*****DO NOT MAKE THIS FILE A CLUTTERED MESS*****
 * 	Input: None. Only a starter file.
 * 	Output: Main file runs all other files project files.
 * 
 * 	Version: 0.0.2
 * 	Last updated: 9/26/2019
 * 		Work done:
 * 			- Added Main method and a simple output to command line to verify that java was indeed working on machine.
 * 			- Commented what needed to be done to file
 * 
 * 	Update 9/28/2019
 * 		Work done: 
 * 			- Calls window object and gives String for title.
 */

/* IMPORT LIBRARIES */
// Not sure if there are any imported libraries tbh

public class Main		// Main class to run all other .java files
{
	/* DATA FIELDS */
	
	public static void main(String[] args)
	{
		new Window();
		new Player();
	}

}