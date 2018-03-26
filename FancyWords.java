//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		wordRay = sentence.split(" ");
//		setWords(sentence);
	}

	public void setWords(String sentence)
	{
//		Scanner read = new Scanner(sentence);
//		int len=0;
//		while(read.hasNext()) {
//			len++;
//		}
//		wordRay = new String[len];
//		int i=0;
//		while(read.hasNext()) {
//			wordRay[i] = read.next();
//			i++;
//		}
//		read.close();
	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;
		//finds length of longest word, sets it equal to max
		for(int i=0; i<wordRay.length; i++) {
			if(wordRay[i].length() >max) {
				max = wordRay[i].length();
			}
			wordRay[i] = new StringBuffer(wordRay[i]).reverse().toString();

		}
//		for(int k=0; k<wordRay.length; k++) {
//			wordRay[k] = new StringBuffer(wordRay[k]).reverse().toString();
//		}
		Collections.reverse(Arrays.asList(wordRay));
		for(int j=0; j<wordRay.length; j++) {
			while(wordRay[j].length()<max) {
				wordRay[j]+=" ";
			}
		}
		//adds the sentence to the output in the format
		for(int r=0; r<max; r++) {
			for(int c=0; c<wordRay.length; c++) {
				output+= ""+wordRay[c].charAt(r);
			}
			output+="\n";
		}
		
		return output+"\n\n";
	}
}