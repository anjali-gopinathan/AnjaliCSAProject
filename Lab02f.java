//© A+ Computer Science  -  www.apluscompsci.com
//Name - Anjali Gopinathan
//Date - 2/6/18
//Class - APCSA Mauro p2
//Lab  - unit 2f

public class Lab02f
{
	public static void main( String[] args )
   {
		//add test cases
		Line findSlope = new Line();
		
		findSlope.setCoordinates(1, 1, 5, 6);
		findSlope.calculateSlope();
		findSlope.print();
		
		findSlope.setCoordinates(1, 7, 18, 3);
		findSlope.calculateSlope();
		findSlope.print();
		
		findSlope.setCoordinates(-5, 7, 0,0);
		findSlope.calculateSlope();
		findSlope.print();
		
		findSlope.setCoordinates(4,4,5,3);
		findSlope.calculateSlope();
		findSlope.print();
		
		findSlope.setCoordinates(1, 1, 2,9);
		findSlope.calculateSlope();
		findSlope.print();
		
		
	}
}