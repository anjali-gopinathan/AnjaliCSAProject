//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
				
	}

	public Prime(int num)
	{
		setPrime(num);

	}

	public void setPrime(int num)
	{
		number = num;

	}

	public boolean isPrime()
	{
		for(int i=2; i< (int) Math.ceil(Math.pow(number, 0.5)); i++){
			if(number % i==0)
				return false;
		}

		return true;
	}

	public String toString()
	{
		String output="";
		if(isPrime())
			output = " is prime";
		else
			output = " is not prime";





		return "\n"+number + output+"\n";
	}
}