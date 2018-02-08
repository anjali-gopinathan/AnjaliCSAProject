//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02g
{
	public static void main( String[] args )
	{
		Fahrenheit toCelsius = new Fahrenheit();
		toCelsius.setFahrenheit(98.6);
		toCelsius.getCelsius();
		toCelsius.print();
		
		toCelsius.setFahrenheit(52.3);
		toCelsius.getCelsius();
		toCelsius.print();
		
		toCelsius.setFahrenheit(82.45);
		toCelsius.getCelsius();
		toCelsius.print();

		toCelsius.setFahrenheit(75.00);
		toCelsius.getCelsius();
		toCelsius.print();

		toCelsius.setFahrenheit(100.00);
		toCelsius.getCelsius();
		toCelsius.print();
	}
}