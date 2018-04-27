//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien a : aliens) {
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for(Alien a : aliens){
			while(a.getX()>40){
				a.move("LEFT");
			}
			while(a.getX()<600){
				a.move("RIGHT");
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
	
	}

	public String toString()
	{
		return "";
	}

	public List<Alien> getAliens() {
		// TODO Auto-generated method stub
		return aliens;
	}
}
