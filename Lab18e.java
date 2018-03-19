package lab18e;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import lab18e.Word2;

import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\APCSA\\Unit12\\Unit12-Assignments\\lab18e\\lab18e.dat"));
		ArrayList<Word2> words = new ArrayList<>();
		int size = file.nextInt();
		file.nextLine();
		while(file.hasNextLine()){
			String word1 = file.nextLine();
			words.add(new Word2(word1));
		}
		for(int i=0; i<size; i++){
			System.out.println(words.get(i));
		}
		//bubblesort
		
		for(int i=0; i<words.size()-1; i++){
			for(int j=0; j< size-1;j++){
				if(words.get(j).compareTo( words.get(j+1) ) >0 ){
					//swap
					Word2 temp = words.get(j);
					words.set(j, words.get(j+1));
					words.set(j+1, temp);
				}
			}
		}
		System.out.print("\n\n");
		for(int i=0; i<words.size(); i++){
			System.out.println(words.get(i));
		}		










	}
}