import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball (int x, int y){
		super(x,y);
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h){
		super(x,y,w,h);
		setColor(Color.BLACK);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball (int x, int y, int w, int h, Color c){
		super(x,y,w,h,c);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball (int x, int y, int w, int h, Color c, int z, int r){
		super(x,y,w,h,c);
		setXSpeed(z);
		setYSpeed(r);
	}
   public void setXSpeed(int z){
	   xSpeed = z;
   }
   public void setYSpeed(int r){
	   ySpeed = r;
   }
   public void setSpeed(int x, int y){
	   setXSpeed(x);
	   setYSpeed(y);
   }

   public void moveAndDraw(Graphics window)
   {
	  draw(window, Color.WHITE);
      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		if (getX() == ((Block) obj).getX() || getY() == ((Block)obj).getY() || getWidth() == ((Block)obj).getWidth() || getHeight() == ((Block)obj).getHeight() || getColor() == ((Block)obj).getColor()){
			if (getXSpeed() == ((Ball) obj).getXSpeed() || getYSpeed() == ((Ball) obj).getYSpeed()){
				return true;
			}
		}
		return false;
	}   

	public int getXSpeed(){
		return xSpeed;
	}
	public int getYSpeed(){
		return ySpeed;
	}
	public String toString(){
		String output = "";
		output += getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getXSpeed() + " " + getYSpeed();
		return output;
	}
	
	
	public boolean didCollideLeft(Object obj){
		Block xd = (Block)obj;
		if (getX() > xd.getX() && getX() <= xd.getX()+xd.getWidth() && (getY() >= xd.getY() && getY()+getHeight() <= xd.getY()+xd.getHeight())){
			return true;
		}
		return false;
	}
	public boolean didCollideRight(Object obj){
		Block xd = (Block)obj;
		if (getX()<xd.getX() && getX()+getWidth()>=xd.getX() && (getY() >= xd.getY() && getY()+getHeight() <= xd.getY()+xd.getHeight())){
			return true;
		}
		return false;
	}
	public boolean didCollideTop(Object obj){
		Block xd = (Block)obj;
		if (getY()+getHeight() >= xd.getY() && getY() < xd.getY()+xd.getHeight() && (getX()>=xd.getX() && getX()+getWidth()<=xd.getX()+xd.getWidth())){
			return true;
		}
		return false;
	}
	public boolean didCollideBottom(Object obj){
		Block xd = (Block)obj;
		if (getY() <= xd.getY()+xd.getHeight() && getY()+getHeight() > xd.getY() && (getX()>=xd.getX() && getX()+getWidth()<=xd.getX()+xd.getWidth())){
			return true;
		}
		return false;
	}
}