//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	/*public RomanNumeral(String str)
	{
	}*/

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public Integer getNumber()
	{
		int n=0;
		//String s="";
		for(int i=0; i<LETTERS.length; i++) {					//roman to int
				while(roman.indexOf(LETTERS[i]) ==0) {
					n+=NUMBERS[i];
					roman=roman.substring(LETTERS[i].length());
				}
		}
		return n;
	}

	public String toString()
	{
		String str="";
		for(int i=0; i<NUMBERS.length; i++) {					//int to roman
			while(NUMBERS[i]<=number) {
				str+=LETTERS[i];
				number-=NUMBERS[i];
			}
		}
		return str;
		//return roman + "\n";
	}
}