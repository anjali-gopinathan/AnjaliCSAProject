/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk. What do you want to talk about?";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >=0 
				|| statement.indexOf("cat") >=0){
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("mauro")>=0){
			response = "I've heard Mr. Mauro is a great teacher.";
		}
		else if (statement.indexOf("school") >=0
				||statement.indexOf("class") >=0
				||statement.indexOf("test") >=0
				||statement.indexOf("quiz") >=0
				||statement.indexOf("notes") >=0) {
			response = "Gosh, do you even talk about anything else? The only thing you talk about is school!";
		}
		else if(statement.indexOf("weather") >=0)
			response = "The weather is nice.";
		else if(statement.indexOf("joke") >=0)
			response = "If I told you a joke in my language, I'd have to explain it.";
		else if(statement.indexOf("food") >=0
				||statement.indexOf("hungry") >=0
				||statement.indexOf("snack") >=0)
			response = "If you're hungry, go get some food!";
		
		
		else if (statement.indexOf("") ==0)
			response = "Say something!";
		else{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}
}