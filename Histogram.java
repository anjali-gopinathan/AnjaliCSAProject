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
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();



	}

	public Histogram(char[] values, String fName)
	{
		fileName = fName;
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		for (int i = 0; i < values.length; i++) {
			letters.add(values[i]);
		}

		out.println("search letters = " + letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		//fName = new ArrayList<String>();
		String str="";
	//	try{
			for (int i = 0; i < letters.size(); i++) {
				Scanner file = new Scanner(new File(fileName));
				int j = 0;
				
				while (file.hasNext()) {
					str = file.next();
					for (int k = 0; k < str.length(); k++) {
						if (str.charAt(k) == letters.get(i)){
							j++;
						}
						
					}

				
				}
				count.add(j);
			}
//		}
//		catch(Exception e){out.println("Houston we have a problem!");}
	}

	public char mostFrequent()
	{
		int max = count.get(0), c=0;
		for(int i=0; i<count.size(); i++){
			
			if(count.get(i) > max){
				max = count.get(i);
				c++;
			}
			
		}
		return letters.get(c);
	}

	public char leastFrequent()
	{
		int min = count.get(0), c=0;
		for(int i=0; i<count.size(); i++){
			
			if(count.get(i) < min){
				min = count.get(i);
				c++;
			}
			
		}
		return letters.get(c);

	}

	public String toString()
	{
	   return fileName + "\n" + letters + "\n" + count + "\n\n\n";
	}
}