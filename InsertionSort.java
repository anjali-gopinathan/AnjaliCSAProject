//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList<String>();
	}

	//modfiers
	public void add( String  word)
	{
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i).equals(word)) {
//				return;
//			}
//		}
		int loc = Collections.binarySearch(list, word);
		//if word is not found in the list, loc is equal to (-(insertion point)-1)
		//where insertion point is the point where the word would be inserted 
		//To get insertion point, add 1 to loc, then take the absolute value.
		if(loc<0) {
			list.add(Math.abs(loc+1), word);
		}
	}

	public void remove(String word)
	{
		int loc = Collections.binarySearch(list,word);
		if(loc>=0) {
			list.remove(word);
		}
	}

	public String toString()
	{
		String put="";
		put+=Arrays.toString(list.toArray());
		return put;
	}
}