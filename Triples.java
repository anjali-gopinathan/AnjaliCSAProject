//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;

		for(int i=1; i<c; i++){
			if( (   (a%i == 0) && (b%i ==0)   ) && (c%i ==0) ){
				max=i;
			}
		}
		return max;
	}

	public String toString()
	{
		String output="";
			
		for(int a=1; a<number; a++){
			for(int b=1; b<number; b++){
				for(int c=0; c<number; c++){
					if(  (c*c) == ( (a*a)+ (b*b) )  ){
						//output +="\npythag equation true\n";
						if(  (  (a%2 == 1 && b%2 == 0)||(a%2==0 && b%2==1)  )&&(c%2==1)){//if a is odd
							//output+="2nd condition true with all those odd/even things\n";
							if(c>b && (b>a && c>a)){
								if(greatestCommonFactor(a,b,c) <=1){
									//output+="3rd condition true, gcf <=1\n";
									output+=a + "\t"+b +"\t"+ c + "\n";
								}
							}
						}
					}
				}
			}
		}


		return ""+output+"\n";
	}
}