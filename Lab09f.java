//© A+ Computer Science  -  www.apluscompsci.com
//Name - Anjali Gopinathan
//Date - 2/14/18
//Class -APCSA Mauro p2
//Lab  - unit 6 

//import static java.lang.System.*;

//import java.util.Scanner;

public class Lab09f
{
	public static void main( String args[] )
	{
		//add test cases
		//Scanner read = new Scanner(System.in);
		
		LetterRemover extract = new LetterRemover();
		//extract.LetterRemover(read.next());
		//extract.removeLetters();
		extract.setRemover("I am Sam I am", 'a');
		extract.removeLetters();
		System.out.println(extract);
		
		extract.setRemover("ssssssssxssssesssssesss", 's');
		extract.removeLetters();
		System.out.println(extract);
		
		extract.setRemover("qwertyqwertyqwerty", 'a');
		extract.removeLetters();
		System.out.println(extract);
		
		extract.setRemover("abababababa", 'b');
		extract.removeLetters();
		System.out.println(extract);
					
		extract.setRemover("abaababababa", 'b');
		extract.removeLetters();
		System.out.println(extract);
	}
}