import java.util.*;

/*	Oscar Chavez
 * 	Math 130
 * 	Lab 4- Loaded Die Game
 * 	March 22, 2022
 * 	Professor Juden
 */

public class Lab4_Chavez 
{

	public static void main(String[] args) 
	{
		
		// initializing win/tie accumulators
		int comWins = 0;
		int userWins = 0;
		int tie = 0;
		
		// Computer game data
		int unBiasedC = 0;
		int biasedC = 0;
		int diffC = 0;
		
		// User game data
		int unBiasedU = 0;
		int biasedU = 0;
		int diffU = 0;

		// will loop the 25 rounds
		for (int i = 1; i <= 25; i++) 
		{
			
			// computer player variables
			unBiasedC = normal();
			biasedC = loaded();
			diffC = Math.abs(unBiasedC - biasedC);
		
			// user player variables
			unBiasedU = normal();
			biasedU = loaded();
			diffU = Math.abs(unBiasedU - biasedU);
			
			// Round score printer
			System.out.printf("\nComputer Turn Round #%d\n", i);
			System.out.printf("- - - - - - - - - - - - - - - -\n");
			System.out.println("Normal Die:   " + unBiasedC);
			System.out.println("Loaded Die:   " + biasedC);
			System.out.println("Difference:   " + diffC);
			
			System.out.printf("\nUser Turn Round #%d\n", i);
			System.out.printf("- - - - - - - - - - - - - - - -\n");
			System.out.println("Normal Die:   " + unBiasedU);
			System.out.println("Loaded Die:   " + biasedU);
			System.out.println("Difference:   " + diffU);
			
			// accumulating wins
			if (diffC > diffU) 
			{
				comWins++;
				System.out.println("\nComputer wins this round.");
				
			}
			else if (diffC < diffU) 
			{
				userWins++;
				System.out.println("\nThe User wins this round.");
			}
			else
			{
				tie++;
				System.out.println("\nThe round is tied.");
			}

		}
		
		// will print out the total number of wins and ties for the game
		System.out.printf("\nTotal Number of Computer Wins: %d\n", comWins);
		System.out.printf("Total Number of User Wins: %d\n", userWins);
		System.out.printf("Total Number of tie games: %d\n", tie);
		
		// this will print out who the winner is
		if (comWins > userWins) 
		{
			System.out.println("The Computer is the GRAND CHAMPION!");
		}
		else if (userWins > comWins) 
		{
			System.out.println("The User is the GRAND CHAMPION!");
		}
		else 
		{
			System.out.println("Computer and User are Tied.");
		}
		
	}
	
	// this method outputs a random number from 1-7
	
	public static int normal () 
	{
		Random rnd = new Random();
		int resultNor = rnd.nextInt(7) + 1;
		return resultNor;
	}
	
	
	// this method returns the loaded dice such that number 1-7 have a predetermined chance of happening
	public static int loaded() 
	{
		Random rnd = new Random();
		int resultRan = rnd.nextInt(100) + 1;
		if (resultRan <= 79) 
		{
			return 7;
		}
		else if (resultRan <= 83) 
		{
			return 6;
		}
		else if (resultRan <= 87) 
		{
			return 5;
		}
		else if (resultRan <= 91) 
		{
			return 4;
		}
		else if (resultRan <= 94) 
		{
			return 3;
		}
		else if (resultRan <= 97) 
		{
			return 2;
		}
		else
		{
			return 1;
		}
		
	}

}
