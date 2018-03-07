//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{




	}

	public Histogram(char[] values, String fName)
	{
		try{
			Scanner file = new Scanner(new File(fName));
		}
		catch{
			System.out.println("problem uh oh");
		}




		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		







	}

	public char mostFrequent()
	{
		int c=0;
		for(int i=0; i<letters.size(); i++){
			if(){
				c++;
			}
		}
		return '#';
	}

	public char leastFrequent()
	{


		return '#';
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}