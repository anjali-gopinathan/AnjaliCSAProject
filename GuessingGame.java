//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		//int myNum = Min + (int)(Math.random() * ((Max - Min) + 1))	//where min is 1, max is upperBound
				
		
		int myNum = 1 + (int)(Math.random() * upperBound);
		int yourGuess=0, numGuesses=0;
		//System.out.println("Guessing game - how many numbers?");
		//upperBound = keyboard.nextInt();
		
		while(yourGuess != myNum) {
			System.out.println("Enter a number between 1 and " + upperBound + ":\t");
			yourGuess = keyboard.nextInt();
			if(yourGuess >=1 && yourGuess<=upperBound) {
				numGuesses++;
			}
			else
				System.out.println("Number out of range!");
		}

		System.out.println("It took you " + numGuesses + " guesses to guess the number " + myNum + ".");
	}

	public String toString()
	{
		String output="";
		return output;
	}
}