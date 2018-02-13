//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover(sentence, lookFor);			//call set
	}

	//add in second constructor
	public LetterRemover(String s){
		s = "";
	}
		
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int loc = cleaned.indexOf(lookFor);
		while(loc >=0 ){
			cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1);
			loc = cleaned.indexOf(lookFor);
		}
	
		return "\n\n" + cleaned + "\n\n";

	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}