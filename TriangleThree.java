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
	/*public String getLetter()
	{
		return letter;
	}*/
	public String toString()
	{
		String output="";
		int midpoint;
		for(int i=0; i<size; i++) {				//row #
			midpoint = size-i-1;				//subtract 1 from size-i to account for offset of for loop

			for(int j=0; j<midpoint; j++) {		//Add size-i spaces
				output+=" ";
			}

			for(int j=midpoint; j<size; j++) {	//Add i letters
				output+=letter;
			}
			output+="\n";

		}
		return output+"\n";
	}
}