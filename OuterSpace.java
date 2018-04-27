//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private Ammo ammo;
	private AlienHorde horde;
	private Bullets shots;

	private int tick;

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{

		setBackground(Color.black);

		keys = new boolean[5];

		horde = new AlienHorde(0);
		shots = new Bullets();
		ship = new Ship(100,100,50,50,6);
		alienOne = new Alien(80,80,6);
		alienTwo = new Alien(120,100,6);
		ammo = new Ammo();
		this.addKeyListener(this);
		new Thread(this).start();

		
		for (int x = 8; x < StarFighter.WIDTH - 100; x += (StarFighter.WIDTH) / 8){
			for (int y = 22; y < StarFighter.HEIGHT / 1.5; y += (StarFighter.HEIGHT / 1.5) / 4){
				horde.add(new Alien(x + 20, y, 25, 25, 1));
			}
		}
		
		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		tick++;
		
		if(ship.getX()>0){
			if(keys[0] == true)
			{
				ship.move("LEFT");
			}
		}
		if(ship.getX()<740){
			if(keys[1] == true)
			{
				ship.move("RIGHT");
			}
		}
		if(ship.getY()>0){
			if(keys[2] == true)
			{
				ship.move("UP");
			}
		}
		if(ship.getY()<500){
			if(keys[3] == true)
			{
				ship.move("DOWN");
			}
		}
		if(keys[4] == true){
			Ammo am = new Ammo(ship.getX() + ship.getWidth() / 2 - 2, ship.getY(), 5);
//			ammo.move("UP");
			
			shots.add(am);

			keys[4] = false;

		}
		
//		for (int i = 0; i < shots.getAmmo().size(); i++)
//			for (int j = 0; j < horde.getAliens().size(); j++)
//				if (shots.getAmmo().get(i).isColliding(horde.getAliens().get(j))) {
//					shots.getAmmo().remove(i--);
//					horde.getAliens().remove(j--);
//				}
		
		

		
		//add code to move Ship, Alien, etc.
		ship.draw(graphToBack);
		ammo.draw(graphToBack);

		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		shots.drawEmAll(graphToBack);
		shots.moveEmAll();

		shots.cleanEmUp();
		
		horde.removeDeadOnes(shots.getList());
		horde.moveEmAll();
		horde.drawEmAll(graphToBack);
		
		ship.draw(graphToBack);
		
		

		
		
		while(alienOne.getX()>20){			
			alienOne.move("LEFT");
		}
		while(alienOne.getX()<650){
			alienOne.move("RIGHT");
		}
		while(alienTwo.getX()>20){			
			alienTwo.move("LEFT");
		}
		while(alienTwo.getX()<650){
			alienTwo.move("RIGHT");
		}	

		twoDGraph.drawImage(back, null, 0, 0);

		back = null;
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e){}

   public void run()
   {
	   try
	   {
		   while(true)
		   {
			   Thread.currentThread().sleep(5);
			   repaint();
		   }
	   }
	   catch(Exception e){ }
  	}
}

