//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -lab 14d

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades{
	//instance variables
	private int numGrades;
	private double[] grades;

	//constructor
	public Grades(){
	}
	public Grades(int sz, double[] scores){
		setGrades(sz, scores);
	}


	//set method
	public void setGrades(int sz, double[] scores){
		numGrades = sz;
		grades = scores;
	}


	private double getSum(){
		double sum=0.0;
		for(int i=0; i<grades.length; i++){
			sum+= grades[i];
		}
		return sum;
	}

	public double getAverage(){
		double average=0.0;
		
		average = getSum()/numGrades;
		
		return average;
	}

	//toString method
	public String toString(){
		String output = "";
		
		for(int i=0; i<grades.length; i++){
			output+="grade " + i + ":\t" + grades[i] + "\n";
		}
		output+="\naverage = " + getAverage() + "\n\n";
		return output;
	}
	

}