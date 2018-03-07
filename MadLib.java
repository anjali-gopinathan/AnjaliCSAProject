//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private final int numVerbs = 13;
	private final int numNouns = 19;
	private final int numAdjectives = 16;
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		//load stuff
		this();
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext()){
				String symbol = file.next();
				if(symbol.equals("#")){	//noun
					out.println(getRandomNoun());
				}
				else if(symbol.equals("@")){	//verb
					out.println(getRandomVerb());
				}
				else if(symbol.equals("&")){	//adjective
					out.println(getRandomAdjective());
				}
			}
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		nouns = new ArrayList<String>();
		int i=0;
		try{
			Scanner check = new Scanner(new File("H:\\APCSA\\Unit10-2016\\Unit10-Assignments\\Lab16d\\nouns.dat"));
			while(i < nouns.size()){
				nouns.add(nouns.get(i));
			}
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		verbs = new ArrayList<String>();
		int i=0;
		try{
			Scanner check = new Scanner(new File("H:\\APCSA\\Unit10-2016\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			while(i < verbs.size()){
				verbs.add(verbs.get(i));
			}
		}
		catch(Exception e)
		{
		}	
	}

	public void loadAdjectives()
	{
		adjectives = new ArrayList<String>();
		int i=0;
		try{
			Scanner check = new Scanner(new File("H:\\APCSA\\Unit10-2016\\Unit10-Assignments\\Lab16d\\adjectives.dat"));
			while(i < adjectives.size()){
				adjectives.add(adjectives.get(i));
			}
		}
		catch(Exception e)
		{
		}	
	}

	public String getRandomVerb()
	{
		int r = (int)Math.random()*numVerbs;
		String s = "";
		
		s= verbs.get(r);
		return s;
	}
	
	public String getRandomNoun()
	{
		int r = (int)Math.random()*numNouns;
		String s = ""+nouns.get(r);
		return s;
	}
	
	public String getRandomAdjective()
	{
		int r = (int)Math.random()*numAdjectives;
		String s = ""+adjectives.get(r);
		return s;
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}