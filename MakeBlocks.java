import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class MakeBlocks {


	private int hEnd;
	private int vStart;
	private int vEnd;
	private int hStart;
	private int s;
	private ArrayList<Block> blocks = new ArrayList<Block>(0);
	
	public MakeBlocks(int separation)
	{
		s = separation;
		hStart = 20;
		hEnd = 740;
		vStart = 80;
		vEnd = 500;
	}
	public void buildblocks(int r, int spaceAmount, Block bl)
	{
		if(blocks.size() == 0)
		{
			hStart = 20;
			hEnd = 750;
			vStart = 80;
			vEnd = 500;
		}
		s =spaceAmount;
		for(int h=0;h<r;h++)
		{
		for(int i = hStart;i<hEnd;i=i+s)
		{
			bl = new Block(40, 40, Color.RED);
			bl.setWidth(40);
			bl.setHeight(30);
			bl.setPos(i, vStart-20);
			blocks.add(bl); 	
			i+=bl.getWidth();
		}
		for(int i = hStart;i<hEnd;i=i+s)
		{
			bl = new Block(40, 40, Color.RED);
			bl.setWidth(40);
			bl.setHeight(30);
			bl.setPos(i, vEnd+30);
			blocks.add(bl); 	
			i+=bl.getWidth();
		}
		for(int i=vStart;i<vEnd;i=i+s)
		{
			bl = new Block(40, 40, Color.RED);
			bl.setWidth(30);
			bl.setHeight(40);
			bl.setPos(hStart, i);
			blocks.add(bl); 	
			i+=bl.getHeight();
		}
		for(int i=vStart;i<vEnd;i=i+s)
		{
			bl = new Block(40, 40, Color.RED);
			bl.setWidth(30);
			bl.setHeight(40);
			bl.setPos(hEnd, i);
			blocks.add(bl); 	
			i+=bl.getHeight();
		}
		hStart +=30;
		hEnd -=40;
		vStart +=30;
		vEnd -=30;
	}
	}
	
	public int getSize()
	{
		return blocks.size();
	}
	public Block getsomething(int i)
	{
		return blocks.get(i);
	}
	public void removal(int i, Graphics graphToBack)
	{
	
		blocks.get(i).setColor(Color.WHITE);
		blocks.get(i).draw(graphToBack);
		
		graphToBack.setColor(Color.BLACK);
		blocks.remove(i);
	//	blocks.get(i).setColor(Color.WHITE);
	}
	public void draw(Graphics window)
	{
		for(int i=0;i<blocks.size();i++)
		{
			blocks.get(i).draw(window);
		}
	}
}