//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class MergeSort
{
	private static int passCount;

	public static void mergeSort(Comparable[] list)
	{
		passCount=0;
		mergeSort(list, 0, list.length);
	}

	private static void mergeSort( Comparable[] list, int front, int back)  //O( Log N )
	{
		int mid = (front+back)/2;
		if(mid == front) return;
//		if(list.length ==1) return;
		mergeSort(list, front, mid);
		mergeSort(list, mid, back);
		merge(list, front, back);
		//mergeSort()

	}

	private static void merge(Comparable[] list, int front, int back)  //O(N)
	{
		
		Comparable[] arr = new Comparable[back - front];
		int i=front, j=(front+back)/2, k=0, mid = j;
		
		while(i<mid && j<back) {
			
			if(list[i].compareTo(list[j])<0) {
				arr[k] = list[i];
				i++;
			}
			else {
				arr[k] = list[j];
				j++;
			}
//			System.out.println("pass "+k+ Arrays.toString(list));
			k++;

		}
		while(i<mid) {
			arr[k] = list[i];
			k++;
			i++;
		}
		while(j<back) {
			arr[k] = list[j];
			k++;
			j++;
		}
		for(int indx = 0; indx<(back-front); ++indx) {
			list[front+indx] = arr[indx];
		}
		System.out.println("pass "+ passCount + " "+Arrays.toString(list));
		passCount++;

	}
}