//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\n\nWhat is the name of this class?");
		String className = keyboard.nextLine();
		System.out.println("\n\nHow many students are in this class?");
		int numStudents = keyboard.nextInt();
		keyboard.nextLine();
		
		Class theClass = new Class(className, numStudents);
		
		for(int i=0; i<numStudents; i++){
			System.out.println("\n\nEnter the name of student "+ (i+1) + ": ");
			String stuName = keyboard.nextLine();
			System.out.println("Enter the grades for "+stuName);
			System.out.println("Use the format x - grades where x is number of grades (2 - 100 98)");
			String gradeList = keyboard.nextLine();
			theClass.addStudent(i, new Student(stuName, gradeList));
		}
//		System.out.println("\n\n"+theClass);
//		theClass.sort();
//		System.out.println("\n\n"+theClass);
		
		System.out.println("Failure List = " + theClass.getFailureList(70));
		System.out.println("Highest Average = " + theClass.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + theClass.getStudentWithLowestAverage());		
		System.out.println("Class Average = " + theClass.getClassAverage());












	}		
}