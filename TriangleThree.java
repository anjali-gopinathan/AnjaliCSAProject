//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

   public TriangleThree()
   {  
   }

	public TriangleThree(int count, String let)
	{
		setTriangle(count, let);
	}

	public void setTriangle(int sz, String let)
	{
		size = sz;
		letter = let;
	}
	public String getLetter()
	{
		return letter;
	}
	public String toString()
	{
		String output="";
		for(int i=0; i<size; i++) {				//row #
			for(int j=0; j<size-i-1; j++) {		//Add size-i spaces
				output= output + " ";
			}

			for(int j=size-i-1; j<size; j++) {	//Add i letters
				output+=letter;
			}
			output+="\n";

		}
		return output+"\n";
	}
}