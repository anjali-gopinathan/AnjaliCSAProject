//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
	private int speed;

	public Paddle() {
		super(10,10);
		setSpeed(5);
	}
	public Paddle(int xPos, int yPos) {
		super(xPos, yPos);
		setSpeed(5);
	}
	public Paddle(int xPos, int yPos, int spd) {
		// TODO Auto-generated constructor stub
		super(xPos, yPos);
		setSpeed(spd);
	}
	public Paddle(int xPos, int yPos, int wid, int heit, int spd) {
		super(xPos, yPos, wid, heit);
		setSpeed(spd);
	}	
	public Paddle(int xPos, int yPos, int wid, int heit, Color c, int spd) {
		super(xPos, yPos, wid, heit, c);
		setSpeed(spd);
	}	
	public void setSpeed(int spd) {
		speed = spd;
	}

	public void moveUpAndDraw(Graphics window)
   {


   }

   public void moveDownAndDraw(Graphics window)
   {


   }

   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   //add a toString() method
   public String toString() {
	   return getX()+" "+getY()+" "+ getWidth()+" "+getHeight()+" "+getColor()+"\t"+getSpeed();
   }
}