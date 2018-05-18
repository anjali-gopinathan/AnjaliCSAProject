import static java.lang.Character.toUpperCase;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Pong extends Canvas implements KeyListener, Runnable
{
	
	private static final long serialVersionUID = 1L;
	private Ball ball;
//	private Paddle leftPaddle;
//	private Paddle rightPaddle;
	private Paddle thePaddle;
	private MakeBlocks blocks;
	private Block block;
	
//	private Wall wall;
	private boolean[] keys;
	private BufferedImage back;
//	private int leftScore;
//	private int rightScore;
	private boolean level1 = true;

	private static final int ballXi=380;
	private static final int ballYi=265;
	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(ballXi, ballYi, 10, 10);
		thePaddle = new Paddle(230, 320, 40, 40, Color.YELLOW, 4);
//		wall = new Wall(0,10000, 10, 550);
		blocks = new MakeBlocks(10);
		block = new Block();
		keys = new boolean[4];

//		leftScore = 0;
//		rightScore = 0;
    
		blocks.buildblocks(2, 10, block);
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
//		graphToBack.setColor(Color.WHITE);
//		graphToBack.drawString("Right points: "+(rightScore-1), 275, 50);	
//
//		graphToBack.setColor(Color.BLACK);
//		graphToBack.drawString("Right points: "+rightScore, 275, 50);	
//
//		graphToBack.setColor(Color.WHITE);
//		graphToBack.drawString("Left points: "+(leftScore-1), 275, 70);	
//
//		graphToBack.setColor(Color.BLACK);
//		graphToBack.drawString("Left points: "+leftScore, 275, 70);	

		//draw objects
		ball.moveAndDraw(graphToBack);
		thePaddle.draw(graphToBack);
		blocks.draw(graphToBack);
		//draw lower wall
		graphToBack.setColor(Color.BLACK);
//		graphToBack.drawLine(0, wall.getBottom(), 780, wall.getBottom());
		
		//draw scoring
//		graphToBack.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
//		graphToBack.clearRect(1, 556, 798, 248);
//		graphToBack.setColor(Color.BLACK);
//		graphToBack.drawString("Player 1 Score: "+ leftScore + 
//				"                                       " + 
//				"Player 2 Score: "+ rightScore, 120, 590);
		if ((ball.getX() <= 10)) {
			
			ball.setXSpeed(-ball.getXSpeed());

		}
		if (ball.getX() >= 780) {
			ball.setXSpeed(-ball.getXSpeed());
		}	
		//if ball collides with left wall right gets a point
		if(didCollideLeft()) {
		
			//reset ball
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.draw(graphToBack, Color.WHITE);
			ball.setPos(ballXi, ballYi);
			ball.setColor(Color.WHITE);
			
			//reset paddle
//			graphToBack.setColor(Color.WHITE);
//			graphToBack.drawString("Right points: "+rightScore, 275, 50);
//			rightScore++;
//			graphToBack.setColor(Color.BLACK);
//			graphToBack.drawString("Right points: "+rightScore, 275, 50);			
			ball.setColor(Color.WHITE);
			//instantiate new ball and paddles for next round
			
			ball = new Ball(400, 300, 10, 10, Color.BLUE);
			ball.draw(graphToBack, Color.YELLOW);
			ball.setXSpeed(3);
			ball.setYSpeed(1);
//			leftPaddle = new Paddle(10, 244, 10, 70, Color.YELLOW, 4);
//			rightPaddle = new Paddle(780, 244, 10, 70, Color.YELLOW, 4);
			
//			if(rightScore == 10) {
//				System.out.println("RIGHT WINS");
//				System.exit(0);
//			}
		}
			
		//if ball collides with right wall
		if(didCollideRight()) {
			//reset ball
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.draw(graphToBack, Color.WHITE);
			ball.setPos(ballXi, ballYi);
			ball.setColor(Color.WHITE);
			
			//reset paddle
//			graphToBack.setColor(Color.WHITE);
//			graphToBack.drawString("Left score: "+leftScore, 275, 70);
//			graphToBack.setColor(Color.BLACK);
//			graphToBack.drawString("Left score: "+leftScore, 275, 70);			
//			ball.setColor(Color.WHITE);

			//instantiate new ball and paddles for next round
			
			ball = new Ball(400, 250, 10, 10, Color.BLUE);
			ball.draw(graphToBack, Color.YELLOW);
			ball.setXSpeed(3);
			ball.setYSpeed(1);
//			leftPaddle = new Paddle(10, 244, 10, 70, Color.YELLOW, 4);
//			rightPaddle = new Paddle(780, 244, 10, 70, Color.YELLOW, 4);
			

		}
		//if ball collides with top or bottom or left or right then change velocity
//		if(didCollideTop() || didCollideBottom())
//			ball.setYSpeed(-ball.getYSpeed());
//		if(didCollideLeft() || didCollideRight())
//			ball.setXSpeed(-ball.getXSpeed());
//
//		//if ball collides with left paddle
//		if(ball.getX() - ball.getWidth() <= thePaddle.getX()+Math.abs(ball.getXSpeed())
//			&& ball.getY() >= thePaddle.getY()
//			&& (ball.getY() <= thePaddle.getY()+thePaddle.getHeight()
//			|| ball.getY()+ball.getHeight() >= thePaddle.getY()
//			&& ball.getY()+ball.getHeight() < thePaddle.getY()+thePaddle.getHeight())) {
//			ball.setXSpeed(-ball.getXSpeed());
//		}
//			
//		//if ball collides with right paddle
//		if(ball.getX() >= thePaddle.getX()-thePaddle.getWidth()
//				&& ball.getY() >= thePaddle.getY()
//				&& (ball.getY() <= thePaddle.getY()+thePaddle.getHeight()
//				|| ball.getY()+ball.getHeight() >= thePaddle.getY()
//				&& ball.getY()+ball.getHeight() < thePaddle.getY()+thePaddle.getHeight())) {
//			ball.setXSpeed(-ball.getXSpeed());
//		}
			
	//MOVEMENT FOR PADDLES
		//left player
		if(keys[0] == true) {
			thePaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true) {
			thePaddle.moveLeftAndDraw(graphToBack);
		}
		
		//right player
		if(keys[2] == true) {
			thePaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[3] == true) {
			thePaddle.moveRightAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
		if (ball.getBounds().intersects(thePaddle.getBounds())) {
			for (int i = 0; i < thePaddle.getFullBounds().size(); i++) {
				if (ball.getBounds().intersects(thePaddle.getFullBounds().get(i))) {
					if (i == thePaddle.TOP_LEFT || i == thePaddle.TOP_RIGHT || i == thePaddle.BOTTOM_LEFT || i == thePaddle.BOTTOM_RIGHT) {
						ball.setSpeed(-ball.getXSpeed(), -ball.getYSpeed());
					} else if (i == thePaddle.LEFT_MIDDLE || i == thePaddle.RIGHT_MIDDLE) {
						ball.setXSpeed(-ball.getXSpeed());
					} else if (i == thePaddle.BOTTOM_MIDDLE || i == thePaddle.TOP_MIDDLE) {
						ball.setYSpeed(-ball.getYSpeed());
					}
				}
			}
		}
		if (level1) {
			for (int i = 0; i < blocks.getSize(); i++) {
				if (ball.didCollideLeft(blocks.getsomething(i))
						|| ball.didCollideRight(blocks.getsomething(i))) {
					ball.setXSpeed(-ball.getXSpeed());
					blocks.removal(i);
				}
				if (ball.didCollideTop(blocks.getsomething(i))
						|| ball.didCollideBottom(blocks.getsomething(i))) {
					ball.setYSpeed(-ball.getYSpeed());
					blocks.removal(i);
				}
			}
		} else if (!level1) {
			for (int i = 0; i < blocks.getSize(); i++) {
				if (ball.didCollideLeft(blocks.getsomething(i))
						|| ball.didCollideRight(blocks.getsomething(i))) {
					ball.setXSpeed(-ball.getXSpeed());
					blocks.getsomething(i).decreaseHp();
					if (blocks.getsomething(i).getHp() == 0) {
						blocks.removal(i);
					}
				}
				if (ball.didCollideTop(blocks.getsomething(i))
						|| ball.didCollideBottom(blocks.getsomething(i))) {
					ball.setYSpeed(-ball.getYSpeed());
					blocks.getsomething(i).decreaseHp();
					if (blocks.getsomething(i).getHp() == 0) {
						blocks.removal(i);
					}
				}
			}

		}
  	}
 	
	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;	//up
			case 'A' : keys[1]=true; break;	//left
			case 'S' : keys[2]=true; break; //down
			case 'D' : keys[3]=true; break; //right
		}
	}
   
	public void keyReleased(KeyEvent e)	{
		switch(toUpperCase(e.getKeyChar())) {
			case 'W' : keys[0]=false; break;
			case 'A' : keys[1]=false; break;
			case 'S' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
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
   public boolean didCollideLeft() {
	   return ball.getX()<=20;
   }
   public boolean didCollideRight() {
	   return ball.getX()>=780;
   }
   public boolean didCollideTop() {
	   return ball.getY()<=20;
   }
   public boolean didCollideBottom() {
	   return ball.getY()>=550;
   }


}