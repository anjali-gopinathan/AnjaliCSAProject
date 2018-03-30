//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - Lab22f

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list) {
		passCount=0;
		quickSort(list,0,list.length-1);
	}

	private static void quickSort(Comparable[] list, int low, int high)
	{
		if(low<high) {
			int split = partition(list, low, high);
			passCount++;

			System.out.println("pass " + passCount + " " + Arrays.toString(list)+"\tsplit = "+split);
			quickSort(list, low, split);
			quickSort(list, split+1, high);
		}
	}

	private static int partition(Comparable[] list, int low, int high)
	{
		Comparable pivot = list[low];
		Comparable temp;
		int bot = low-1;
		int top = high+1;
		
		while(bot<top) {
			while(list[++bot].compareTo(pivot) < 0);
			while(list[--top].compareTo(pivot) > 0);
			if(bot>=top) {
				return top;
			}
			//swap bot and top spots
			temp = list[top];
			list[top] = list[bot];
			list[bot] = temp;
		}













		return 0;
	}
}