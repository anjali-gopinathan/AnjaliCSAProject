//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		for(int i=0; i<stuCount; i++){
			
		}
	
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;

	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		Student stud = new Student();
		double classAverage=0.0, classSum=0.0;
		for(int i=0; i<studentList.length; i++){
			classSum+= stud.getAverage();
		}
		classAverage = classSum/studentList.length;

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		int index=0;
		for(int i=0; i<studentList.length; i++){
			if(studentList[i].equals(stuName)){
				index=i;
			}
		}
		return getStudentAverage(index);
	}
	
	public String getStudentName(int stuNum)
	{
		String out ="";
		for(int i=0; i<studentList.length; i++){
			if(i == stuNum){
				out= studentList[i].getName();
			}
		}
		return out;
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		for(int i=0; i<studentList.length; i++){
			if(studentList[i].getAverage() > high){
				high = studentList[i].getAverage();
				hName = studentList[i].getName();
			}
		}
		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String lName ="";		
		for(int i=0; i<studentList.length; i++){
			if(studentList[i].getAverage() < low){
				low = studentList[i].getAverage();
				lName = studentList[i].getName();
			}
		}
		return lName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";





		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";




		return output;
	}  	
}