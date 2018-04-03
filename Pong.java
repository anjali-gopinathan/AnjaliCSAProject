//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.Character.toUpperCase;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Pong extends Canvas implements KeyListener, Runnable, Collidable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	
	private Wall wall;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;


	private static final int ballXi=380;
	private static final int ballYi=265;
	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(ballXi, ballYi, 10, 10);
		leftPaddle = new Paddle (10,  240, 10, 70, Color.YELLOW, 4);
		rightPaddle = new Paddle(400, 240, 10, 70, Color.YELLOW, 4);
		wall = new Wall(0,10000, 10, 550);

		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
  	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		//take a snap shop of the current screen and save it as an image
		//that is the exact same width and height as the current screen
		if(back == null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		

		//draw objects
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		
		//draw lower wall
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawLine(0, wall.getBottom(), 800, wall.getBottom());
		
		//draw scoring
		graphToBack.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		graphToBack.clearRect(1, 556, 798, 248);
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("Player 1 Score: "+ leftScore + 
				"                                       " + 
				"Player 2 Score: "+ rightScore, 120, 590);
			
		//if ball collides with left wall right gets a point
		if(((Collidable) ball).didCollideLeft(wall)) {
			rightScore++;
			
			//reset ball
			ball.setXVel(0);
			ball.setYVel(0);
			ball.draw(graphToBack, Color.WHITE);
			ball.setPos(ballXi, ballYi);
			ball.setColor(Color.WHITE);
			
			//reset paddle
			leftPaddle.draw(graphToBack, Color.WHITE);
			leftPaddle.setColor(Color.WHITE);
			rightPaddle.draw(graphToBack, Color.WHITE);
			rightPaddle.setColor(Color.WHITE);
			
			//instantiate new ball and paddles for next round
			ball = new Ball(ballXi, ballYi, 10, 10, Color.BLUE);
			leftPaddle = new Paddle(10, 244, 10, 70, Color.YELLOW, 4);
			rightPaddle = new Paddle(760, 244, 10, 70, Color.YELLOW, 4);
			
			if(rightScore == 5) {
				System.out.println("RIGHT WINS");
				System.exit(0);
			}
		}
			
		//if ball collides with right wall
		if(((Collidable) ball).didCollideRight(wall)) {
			leftScore++;
			
			//reset ball
			ball.setXVel(0);
			ball.setYVel(0);
			ball.draw(graphToBack, Color.WHITE);
			ball.setPos(ballXi, ballYi);
			ball.setColor(Color.WHITE);
			
			//reset paddle
			leftPaddle.draw(graphToBack, Color.WHITE);
			leftPaddle.setColor(Color.WHITE);
			rightPaddle.draw(graphToBack, Color.WHITE);
			rightPaddle.setColor(Color.WHITE);
			
			//instantiate new ball and paddles for next round
			ball = new Ball(ballXi, ballYi, 10, 10, Color.BLUE);
			leftPaddle = new Paddle(10, 244, 10, 70, Color.YELLOW, 4);
			rightPaddle = new Paddle(760, 244, 10, 70, Color.YELLOW, 4);
			
			if(leftScore == 5) {
				System.out.println("LEFT WINS");
				System.exit(0);
			}
		}
			
		//if ball collides with top or bottom change velocity
		if(((Collidable) ball).didCollideTop(wall) || ((Collidable)ball).didCollideBottom(wall))
			ball.setYVel(-ball.getYVel());
	

		//if ball collides with left paddle
		if(ball.getX() <= leftPaddle.getX()+leftPaddle.getWidth()
			&& ball.getY() >= leftPaddle.getY()
			&& (ball.getY() <= leftPaddle.getY()+leftPaddle.getHeight()
			|| ball.getY()+ball.getHeight() >= leftPaddle.getY()
			&& ball.getY()+ball.getHeight() < leftPaddle.getY()+leftPaddle.getHeight()))
		{
			//ball.setYVel(-ball.getYVel());
			if(ball.getX() <= leftPaddle.getX()+leftPaddle.getWidth()-Math.abs(ball.getXVel()))
				ball.setYVel(-ball.getYVel());
			//make ball bounce
			else
				ball.setXVel(-ball.getXVel());
		}
			
		//if ball collides with right paddle
		if(ball.getX() >= rightPaddle.getX()-rightPaddle.getWidth()
				&& ball.getY() >= rightPaddle.getY()
				&& (ball.getY() <= rightPaddle.getY()+rightPaddle.getHeight()
				|| ball.getY()+ball.getHeight() >= rightPaddle.getY()
				&& ball.getY()+ball.getHeight() < rightPaddle.getY()+rightPaddle.getHeight()))
		{
			if(ball.getX() >= rightPaddle.getX()-rightPaddle.getWidth()+Math.abs(ball.getXVel()))
				ball.setYVel(-ball.getYVel());
			//make ball bounce
			else
				ball.setXVel(-ball.getXVel());
		}
			
	//MOVEMENT FOR PADDLES
		//left player
		if(keys[0] == true) {
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true) {
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		
		//right player
		if(keys[2] == true) {
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true) {
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
  	}
 	
	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}
   
	public void keyReleased(KeyEvent e)	{
		switch(toUpperCase(e.getKeyChar())) {
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
	   try {
		   while(true) {
			Thread.currentThread();
			Thread.sleep(8);
			repaint();
		   }
	   }
	   catch(Exception e) {
		   System.out.println("Error running Pong.java");
	   }
   }

	@Override
	public boolean didCollideLeft(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean didCollideRight(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean didCollideTop(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean didCollideBottom(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}	
}