package lab18d;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;

	}

	public int compareTo( Word rhs )
	{
		if(word.length()>rhs.toString().length())
			return 1;
		else if(word.length()<rhs.toString().length())
			return -1;
		else{
			if(word.compareTo(rhs.toString())>0)
				return 1;
			else if(word.compareTo(rhs.toString())<0)
				return -1;
			
//			if(word.charAt(0)<rhs.toString().charAt(0))
//				return 1;
//			int i=0;
//			while(i<word.length()){
//				if(word.charAt(i)<rhs.toString().charAt(i))
//					return 1;
//				else if(word.charAt(i)>rhs.toString().charAt(i))
//					return -1;
//				i++;
//			}
//			
					return 0;

		}
	}

	public String toString()
	{
		return word;
	}
}