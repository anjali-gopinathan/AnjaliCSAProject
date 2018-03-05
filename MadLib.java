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
		try{
		
		
		
		
		
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
	
	
	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
	
	
	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
		int r = (int)Math.random()*13;
		String s = "";
		//for(int i=0; i<r; i++){
			//s=verbs.next();
		//}
		s= verbs.get(r);
		return s;
	}
	
	public String getRandomNoun()
	{
		
		return "";
	}
	
	public String getRandomAdjective()
	{
		
		return "";
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}