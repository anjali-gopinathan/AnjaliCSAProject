//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - FancyWords.java and lab15d.dat

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\anjgo\\Documents\\APCSA\\Unit13-2016\\Unit13-Assignments\\lab15d.dat"));
		String sent;
		int size = file.nextInt();
		file.nextLine();
		for(int i=0; i<size; i++) {
			sent = file.nextLine();
			FancyWords test = new FancyWords(sent);
			System.out.println(test);
		}
	}
}