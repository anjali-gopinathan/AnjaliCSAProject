//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;
	public Name()
	{
	}

	public Name(String s)
	{
		setName(s);
	}

   public void setName(String s)
   {
	   name = s;
   }

	public String getFirst()
	{
		String s="";   
		for(int i = 0; i<name.length(); i++){
			   if(name.charAt(i) == ' ')
				   return s;
			   else
				   s+=name.charAt(i);
		}
		return "put a space between your first and last name getFirst";
	}

	public String getLast()
	{
		for(int i= name.length()-1; i>=0; i--){
			if(name.charAt(i) == ' ')
				return name.substring(i+1, name.length());
		}
		return "put a space between your first and last name getLast";
	}

 	public String toString()
 	{
 		return name;
	}
}