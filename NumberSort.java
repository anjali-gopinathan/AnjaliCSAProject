//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown
//	private int num;
//	public NumberSort(int n){
//		num = n;
//		//result = new int[0];
//	}
	static int getNumDigits(int number)
	{
		int count = 0;
		while(number!=0){
			number/=10;
			count++;
		}
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		//System.out.println(getNumDigits(number));
		int[] sorted = new int[getNumDigits(number)];
		int counter=0;
		while(number!=0){
			sorted[counter] = number%10;
			number/=10;
			counter++;
		}
		
		//bubblesort
		for(int i=0; i<sorted.length-1; i++){
			for(int j=0; j<sorted.length-i-1; j++){
				if(sorted[j]>sorted[j+1]){
					//swap sorted[j] and sorted[j+1]
					int temp = sorted[j+1];
					sorted[j+1] = sorted[j];
					sorted[j] = temp;
				}
			}
		}


		return sorted;
	}
}