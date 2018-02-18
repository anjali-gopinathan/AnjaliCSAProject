//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		int upBound;

		System.out.println("Guessing game - how many numbers?");
		upBound = keyboard.nextInt();
		GuessingGame guess = new GuessingGame(upBound);
		do {
			guess.playGame();
			out.println("Do you want to play again? (y or n)");
			response = keyboard.next().charAt(0);
		}while(response == 'y');



	}
}