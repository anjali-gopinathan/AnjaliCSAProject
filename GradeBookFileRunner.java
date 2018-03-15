//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("C:\\Users\\anjgo\\Documents\\APCSA\\Unit11-2016\\Unit11-Assignments\\Lab19b\\gradebook.dat"));
		System.out.println(file.nextLine());//name of classroom
		
		

		Class test = new Class(file.nextLine(), file.nextInt());
		file.nextLine();
		int i=0;
		while(file.hasNextLine()){
			test.addStudent(i, new Student(file.nextLine(), file.nextLine()));
			i++;
		}
		file.close();
		test.sort();
		System.out.println(test);

		System.out.println("Failure List = " + test.getFailureList(70));
		System.out.println("Highest Average = " + test.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + test.getStudentWithLowestAverage());		
		System.out.println("Class Average = " + test.getClassAverage());

//		Class test2 = new Class(file.nextLine(), file.nextInt());
//		file.nextLine();
//		int j=0;
//		while(file.hasNextLine()){
//			test2.addStudent(j, new Student(file.nextLine(), file.nextLine()));
//			j++;
//		}
//
//		test2.sort();
//		System.out.println(test2);
//		
//		System.out.println("Failure List = " + test2.getFailureList(70));
//		System.out.println("Highest Average = " + test2.getStudentWithHighestAverage());
//		System.out.println("Lowest Average = " + test2.getStudentWithLowestAverage());		
//		System.out.println("Class Average = " + test2.getClassAverage());

   
   }		
}