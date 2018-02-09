//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab04e
{
	public static void main ( String[] args )
	{
		String chicken = "chicken", alligator = "alligator", cs = "COMPUTER SCIENCE IS THE BEST";
		StringChecker demo = new StringChecker(chicken);
		out.println("looking for c in " + chicken +" ... " +demo.findLetter('c'));
		out.println("looking for ch in " + chicken +" ... " +demo.findSubString("ch"));
		out.println("looking for x in " + chicken +" ... "+demo.findSubString("x"));
		out.println(demo);

		demo.setString(alligator);
		out.println("looking for g in " + alligator +" ... "+demo.findLetter('g'));
		out.println("looking for all in " + alligator +" ... "+demo.findSubString("all"));
		out.println("looking for gater in " + alligator +" ... "+demo.findSubString("gater"));
		out.println(demo);

		demo.setString(cs);
		out.println("looking for U in " + cs +" ... "+demo.findLetter('U'));
		out.println("looking for COMP SCI in " + cs +" ... "+demo.findSubString("COMP SCI"));
		out.println("looking for SCIENCE in " + cs +" ... "+demo.findSubString("SCIENCE"));
		out.println(demo);
	}
}