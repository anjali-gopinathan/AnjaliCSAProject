import java.util.Scanner;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab0b
{
	public static void main ( String[] args )
	{
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String

		//integer variables
		byte byteOne = 127;
		short shortOne = -32123;
		int intOne = 90877;
		long longOne = 999999999;
		float floatOne = 38;
		double doubleOne = 923.234;
		char charOne = 'B';
		boolean boolOne = false;
		String stringOne = "what's up?";
		Scanner reader = new Scanner(System.in);

		//decimal variables
		System.out.println("Enter a byte:");
		byteOne = reader.nextByte();
		//other integer types


		//other types


		//output your information here
		System.out.println("/////////////////////////////////");
		System.out.println("*Anjali Gopinathan       2/1/18*");
		System.out.println("*                               *");
		System.out.println("*        integer types          *");
		System.out.println("*                               *");
		System.out.println("*                               *");

		System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
		System.out.println("*16 bit - shortOne = "+shortOne+"\t\t*");
		System.out.println("*32 bit - intOne = "+intOne+"\t\t*");
		System.out.println("*64 bit - longOne = "+longOne+"\t\t*");
		
		System.out.println("*                               *");
		System.out.println("*        real types             *");
		System.out.println("*                               *");
		System.out.println("*                               *");

		System.out.println("*32 bit - floatOne = "+floatOne+"\t\t*");
		System.out.println("*64 bit - doubleOne = "+doubleOne+"\t\t*");

		System.out.println("*                               *");
		System.out.println("*        other int types        *");
		System.out.println("*                               *");
		System.out.println("*                               *");	

		System.out.println("*16 bit - charOne = "+charOne+"\t\t*");

		System.out.println("*                               *");
		System.out.println("*        other types  		    *");
		System.out.println("*                               *");
		System.out.println("*                               *");	

		System.out.println("*boolOne = "+boolOne+"\t\t*");
		System.out.println("*stringOne = "+stringOne+"\t\t*");





	}
}