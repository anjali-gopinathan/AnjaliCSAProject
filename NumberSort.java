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
	//private int[] result;
	private int num;
	public NumberSort(int n){
		num = n;
		//result = new int[0];
	}
	public static int getNumDigits(int number)
	{
		int count = 0;
		while(number>0){
			number/=10;
			count++;
		}
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = null;
		sorted = new int[getNumDigits(number)];
		int counter=0;
		for(int i=0; i<sorted.length; i++){
			sorted[i] = number%10;
			number/=10;
		}
		
		for(int i=0; i<sorted.length; i++){
			for(int j=0; j<sorted.length-i-1; j++){
				if(sorted[j]>sorted[j+1]){
					//swap them
					int temp = sorted[j];
					sorted[j] = sorted[i];
					sorted[i] = temp;
				}
			}
		}


		return sorted;
	}
	public String toString(){
		String output="";
		for(int i=0; i<getSortedDigitArray(num).length; i++){
			output+= getSortedDigitArray(num)[i]+" ";
		}
		return output+getNumDigits(num);
	}
}