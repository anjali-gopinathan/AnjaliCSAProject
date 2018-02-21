//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - Grades

public class Lab14d
{
	public static void main( String args[] )
	{
		//add test cases
		Grades howGood = new Grades();
		
		double[] data1 = {100.0, 90.0, 85.0, 72.5, 95.6};
		double[] data2 = {50,100,80};
		double[] data3 = {93.4, -90, 90};
		double[] data4 = {1,2,3,4,5,6,7,8,9};
		
		howGood.setGrades(data1.length, data1);
		System.out.println(howGood);
		
		howGood.setGrades(data2.length, data2);
		System.out.print(howGood);

		howGood.setGrades(data3.length, data3);
		System.out.print(howGood);
		
		howGood.setGrades(data4.length, data4);
		System.out.print(howGood);
		
	}
}