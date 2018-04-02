//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block(){
		xPos = 0;
		yPos = 0;
		width = 10;
		height = 10;
		color = Color.BLACK;
	}

	public Block(int x, int y){
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
		color = Color.BLACK;
	}
	public Block(int x, int y, int wid, int heit){
		xPos = x;
		yPos = y;
		width = wid;
		height = heit;
		color = Color.BLACK;
	}
	public Block(int x, int y, int wid, int heit, Color colores){
		xPos = x;
		yPos = y;
		width = wid;
		height = heit;
		color = colores;
	}


	//add other Block constructors - x , y , width, height, color
	 public void setX( int x ) {
		 xPos = x;
	 }
	 public void setY( int y ) {
		 yPos = y;
	 }
	 
   //add the other set methods
   public void setColor(Color col)
   {
	   color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }



   public void draw(Graphics window, Color col)
   {
	   window.setColor(color);
	   window.fillRect(getX(),  getY(),  getWidth(),  getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block block = (Block) obj;



		return xPos == block.getX() 
			&& yPos == block.getY()
			&& width == block.getWidth()
			&& height == block.getHeight()
			&& color == block.color;
	}

	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		setX(x);
		setY(y);
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return yPos;
	}   

   //add the other get methods
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	public Color getColor() {
		return color;
	}

   //add a toString() method  - x , y , width, height, color
	public String toString() {
		// x-y-wid-ht-color
		return xPos + " " + yPos + " " + width + " " + height + " " + color;
	}
}