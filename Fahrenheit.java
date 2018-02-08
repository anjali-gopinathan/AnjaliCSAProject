//© A+ Computer Science  -  www.apluscompsci.com
//Name - Anjali Gopinathan
//Date - 2/6/18
//Class - APCSA Mauro p2
//Lab  - unit 2g

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren){
		fahrenheit = fahren;
	}
	public double getCelsius(){
		double celsius = (fahrenheit - 32)*5/9;
		return celsius;
	}
	public void print(){
		System.out.println( fahrenheit + "\t degrees Fahrenheit = "+ getCelsius() + "\t degrees Celsius");
	}
}