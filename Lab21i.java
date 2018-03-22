//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\APCSA\\Unit14\\Unit14-Assignments\\lab21i.dat"));
		
		while(file.hasNext()){
			int len = file.nextInt();
			int[][] maze = new int[len][len];
			Maze test = new Maze();
			System.out.println(test);
		}
	}
}