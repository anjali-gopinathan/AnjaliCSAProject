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
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	private final int NUMVERBS = 13;
	private final int numNouns = 19;
	private final int numAdjectives = 16;
	
	String str = "";
	
	public MadLib()
	{
		//verbs = new ArrayList<String>();
		//nouns = new ArrayList<String>();
		//adjectives = new ArrayList<String>();
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
				//out.println("t");
				str+= file.next() + " ";
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
		//int i=0;
		try{
			Scanner checkN = new Scanner(new File("H:\\APCSA\\Unit10-2016\\Unit10-Assignments\\Lab16d\\nouns.dat"));
			//while(i < nouns.size()){
			while(checkN.hasNext()){
				nouns.add(checkN.nextLine());
				//i++;
			}
			checkN.close();
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		verbs = new ArrayList<String>();
		try{
			Scanner checkV = new Scanner(new File("H:\\APCSA\\Unit10-2016\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			while(checkV.hasNext()){
				verbs.add(checkV.nextLine());
			}
			checkV.close();
		}
		catch(Exception e)
		{
		}	
	}

	public void loadAdjectives()
	{
		adjectives = new ArrayList<String>();
		try{
			Scanner checkA = new Scanner(new File("H:\\APCSA\\Unit10-2016\\Unit10-Assignments\\Lab16d\\adjectives.dat"));
			while(checkA.hasNext()){
				adjectives.add(checkA.nextLine());
			}
			checkA.close();
		}
		catch(Exception e)
		{
		}	
	}

	public String getRandomVerb()
	{
		Random ra = new Random();
		int r = ra.nextInt(verbs.size());
		String s = verbs.get(r);
		return s;
	}
	
	public String getRandomNoun()
	{
		Random ra = new Random();
		int r = ra.nextInt(nouns.size());
		String s = nouns.get(r);
		return s;
	}
	
	public String getRandomAdjective()
	{
		Random ra = new Random();
		int r = ra.nextInt(adjectives.size());
		String s = adjectives.get(r);
		return s;
	}		

	public String toString()
	{
		for(int i=0; i<str.length(); i++){
			//String symbol = file.next();
			if(str.charAt(i)=='#'){	//noun
				//out.println(getRandomNoun());
				str = str.substring(0, i) + getRandomNoun() + str.substring(i+1);
			}
			else if(str.charAt(i) == '@'){	//verb
				//out.println(getRandomVerb());
				str = str.substring(0, i)  + getRandomVerb()  +str.substring(i+1);				
			}
			else if(str.charAt(i)=='&'){	//adjective
				//out.println(getRandomAdjective());
				str = str.substring(0, i)  +  getRandomAdjective() + str.substring(i+1);
			}
			//else str+=" ";
		}
		return str+"\n\n\n";

	}
}