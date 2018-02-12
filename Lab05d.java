//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		char doAgain;
		do{
			out.print("Enter a character:\t\t");
			char letter = keyboard.next().charAt(0);				//scans next character
			CharacterAnalyzer test = new CharacterAnalyzer(letter);	//instantiates "test", which accesses CharacterAnalyzer file
			out.println(test);	
			out.println("Try again? (y or n)");
			doAgain = keyboard.next().charAt(0);
		}while(doAgain != 'n' && doAgain != 'N');		//loop will run again if first character of answer is not 'n'
	}
}