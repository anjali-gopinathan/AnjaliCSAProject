import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Block implements Locatable
{
	public final int	TOP_LEFT		= 0;
	public final int	TOP_MIDDLE		= 1;
	public final int	TOP_RIGHT		= 2;
	public final int	LEFT_MIDDLE		= 3;
	public final int	RIGHT_MIDDLE	= 4;
	public final int	BOTTOM_LEFT		= 5;
	public final int	BOTTOM_MIDDLE	= 6;
	public final int	BOTTOM_RIGHT	= 7;
	
	
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int power = 2;

	private Color color;

	public Block (){
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.BLACK;
	}
	public Block(int x, int y){
		xPos = x;
		yPos = y;
	}
	public Block(int x, int y, int w, int h)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = Color.BLACK;
	}
	public Block (int w, int h, Color c){
		width = w;
		height = h;
		color = c;
	}
	public Block (int x, int y, int w, int h, Color c)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = c;
	}
	public void setPos(int x, int y) {
		setX(x);
		setY(y);
	}
	public void setX(int x) {
		xPos = x;
	}
	public void setY(int y) {
		yPos = y;
	}
	public void setWidth(int w){
		width = w;
	}
	public void setHeight(int h){
		height = h;
	}
	public void setColor(Color col){
		color = col;
	}

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		if (((Block) obj).getX() == getX() && ((Block)obj).getY() == getY() && ((Block)obj).getWidth() == getWidth() && ((Block)obj).getHeight() == getHeight() && ((Block)obj).getColor() == getColor()){
			return true;
		}
		return false;
	}   
	public void decreaseHp(){
		power--;
//		temp = color;
//		color  = color2;
//		color2  = temp;
		
	}
//   public void setColor2(Color col)
//   {
//	   color2 = col;
//   }
	public int getHp()
	{
		return power;
		
	}

	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public Color getColor(){
		return color;
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int) xPos, (int) yPos, (int) width, (int) height);
	}
	
	public ArrayList<Rectangle> getFullBounds() {
		ArrayList<Rectangle> fullBounds = new ArrayList<Rectangle>(8);
		fullBounds.add(new Rectangle((int) getX(), (int) getY(), (int) (getWidth() / 5), (int) (getHeight() / 5)));
		fullBounds.add(new Rectangle((int) (getX() + getWidth() / 5), (int) getY(), (int) (getWidth() * 3 / 5),
				(int) (getHeight() / 5)));
		fullBounds.add(new Rectangle((int) (getX() + getWidth() * 4 / 5), (int) getY(), (int) (getWidth() / 5),
				(int) (getHeight() / 5)));
		fullBounds.add(new Rectangle((int) getX(), (int) (getY() + getHeight() / 5), (int) (getWidth() / 5),
				(int) getHeight() * 3 / 5));
		fullBounds.add(new Rectangle((int) (getX() + getWidth() * 4 / 5), (int) (getY() + getHeight() / 5),
				(int) (getWidth() / 5), (int) getHeight() * 3 / 5));
		fullBounds.add(new Rectangle((int) getX(), (int) (getY() + getHeight() * 4 / 5), (int) (getWidth() / 5),
				(int) (getHeight() / 5)));
		fullBounds.add(new Rectangle((int) (getX() + getWidth() / 5), (int) (getY() + getHeight() * 4 / 5),
				(int) (getWidth() * 3 / 5), (int) (getHeight() / 5)));
		fullBounds.add(new Rectangle((int) (getX() + getWidth() * 4 / 5), (int) (getY() + getHeight() * 4 / 5),
				(int) (getWidth() / 5), (int) (getHeight() / 5)));
		return fullBounds;
	}
	
	
	

	public String toString(){
		String output = "";
		output += getX() + " " + getY() + " " + width + " " + height + " " + color;
		return output;
	}
}