//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class SpeedUpBall extends Ball implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public SpeedUpBall()
	{
	    super();
	}

	public SpeedUpBall(int x, int y)
	{
		super(x, y);
	}

	public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   	{
		super(x, y);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
   	}

	public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
	{
		super(x, y, wid, ht);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}

	public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   	{
		super(x, y, wid, ht, col, xSpd, ySpd);
   	}
	

	public void setXSpeed(int xSpd) {
		xSpeed = xSpd;
	}
	
	public void setYSpeed(int ySpd) {
		ySpeed = ySpd;
	}
	

	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
	

	public void incSpeed()
	{
		if(getXSpeed() < 0) {
			setXSpeed(getXSpeed() - 1);
		} else {
			setXSpeed(getXSpeed() + 1);
		}
		
		if(getYSpeed() < 0) {
			setYSpeed(getYSpeed() - 1);
		} else {
			setYSpeed(getYSpeed() + 1);
		}
	}

	   public boolean didCollideLeft(Object obj) {
		   return ((Block) obj).getX()<=20;
	   }
	   public boolean didCollideRight(Object obj) {
		   return ((Block)obj).getX()>=780;
	   }
	   public boolean didCollideTop(Object obj) {
		   return ((Block) obj).getY()<=20;
	   }
	   public boolean didCollideBottom(Object obj) {
		   return ((Block) obj).getY()>=550;
	   }


}