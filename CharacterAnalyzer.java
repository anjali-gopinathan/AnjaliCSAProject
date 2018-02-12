//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if( getASCII() >=65 && getASCII() <=90){	//if theChar is uppercase
			return true;
		}
		else
			return false;
	}

	public boolean isLower( )
	{
		if(getASCII()>=97 && getASCII() <=122){	//if theChar is lowercase
			return true;
		}
		else
			return false;
	}
	
	public boolean isNumber( )
	{
		if(Character.isDigit(theChar))
			return true;
		else return false;

	}	
	
	public int getASCII( )
	{
		return (int) theChar;
	}
	public String toString()
	{
		String charType = "";
		if (isUpper()){charType = "an UPPERCASE letter";}
		else if (isLower()){charType = "a lowercase letter";}
		else if (isNumber()){charType = "a number";}
		else{ charType = "a symbol";}
		
		return ""+getChar() + " is "+ charType +". ASCII = " + getASCII() + "\n";	  
	}
}