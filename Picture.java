import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{

  public Picture ()
  {
	  super();  

  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    super(fileName);
    System.out.println("Anjali Gopinathan\nAPCSA period 2\n4/24/18\nComputer 23");
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    super(width, height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
   /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
   }
  //LAB ASSESSMENT 4/24/2018
  public void blur(int x, int y, int w, int h){
	  Pixel[][] pixels = this.getPixels2D();
	  for(int r=y; r<y+h; r++){
		  for(int c=x; c<x+w; c++){	//for every pixel in rectangle
			  Pixel pixelObj = pixels[r][c];
			  int avgRed = ((
			  		  pixels[r-1][c-1].getRed() 
			  		+ pixels[r-1][c  ].getRed()
			  		+ pixels[r-1][c+1].getRed()
			  		+ pixels[r  ][c-1].getRed() 
			  		+ pixels[r  ][c+1].getRed()
			  		+ pixels[r+1][c-1].getRed()
			  		+ pixels[r+1][c  ].getRed() 
			  		+ pixels[r+1][c+1].getRed()
			  		)/8);
			  int avgGreen = ((
			  		  pixels[r-1][c-1].getGreen() 
			  		+ pixels[r-1][c  ].getGreen()
			  		+ pixels[r-1][c+1].getGreen()
			  		+ pixels[r  ][c-1].getGreen() 
			  		+ pixels[r  ][c+1].getGreen()
			  		+ pixels[r+1][c-1].getGreen()
			  		+ pixels[r+1][c  ].getGreen() 
			  		+ pixels[r+1][c+1].getGreen()
			  		)/8);
			  int avgBlue = ((
			  		  pixels[r-1][c-1].getBlue() 
			  		+ pixels[r-1][c  ].getBlue()
			  		+ pixels[r-1][c+1].getBlue()
			  		+ pixels[r  ][c-1].getBlue() 
			  		+ pixels[r  ][c+1].getBlue()
			  		+ pixels[r+1][c-1].getBlue()
			  		+ pixels[r+1][c  ].getBlue() 
			  		+ pixels[r+1][c+1].getBlue()
			  		)/8);
			  pixelObj.setRed(avgRed);
			  pixelObj.setGreen(avgGreen);
			  pixelObj.setBlue(avgBlue);
		  }
	  }
  }
  
  
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
	
  public void keepOnlyRed() {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setBlue(0);
	        pixelObj.setGreen(0);
	      }
	    }
  }
	
  public void keepOnlyBlue() {
	  // TODO Auto-generated method stub
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(0);
	        pixelObj.setGreen(0);
	      }
	    }
  }
	
	public void keepOnlyGreen() {
		// TODO Auto-generated method stub
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(0);
	        pixelObj.setBlue(0);
	      }
	    }
	}

	public void negate() {
		// TODO Auto-generated method stub
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(255 - pixelObj.getRed());
	        pixelObj.setBlue(255 - pixelObj.getBlue());
	        pixelObj.setGreen(255 - pixelObj.getGreen());

	      }
	    }
	}
	public void grayscale(){
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed((pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3);
	        pixelObj.setBlue((pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3);
	        pixelObj.setGreen((pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3);

	      }
	    }
	}

	public void fixUnderwater() {
		Pixel[][] pixels = this.getPixels2D();
		for(Pixel[] rowArray : pixels){
			for(Pixel pixelObj : rowArray){
				if(pixelObj.getBlue()>pixelObj.getGreen() && pixelObj.getBlue()>pixelObj.getRed()){
					pixelObj.setBlue(2*pixelObj.getBlue());
					//pixelObj.setRed(2*pixelObj.getBlue());
					//pixelObj.setGreen(2*pixelObj.getGreen());
				}
//				else{
//					pixelObj.setGreen(2*pixelObj.getGreen());
//					pixelObj.setBlue(2*pixelObj.getBlue());
//					pixelObj.setRed(2*pixelObj.getRed());
//				}
			}
		}
		
	}

	public void mirrorArms() {
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    
	    int rightBound = 196, leftBound = 170, bottomBound = 293, topBound = 119;
	    int mirrorPoint = rightBound;
	    
	    int count = 0;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the columns
	    for (int col = 106; col < bottomBound; col++)
	    {
	      // loop from topBound down to just before the mirror point
	      for (int row = topBound; row < mirrorPoint; row++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[mirrorPoint - row + mirrorPoint][col];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    }

	}

	public void mirrorGull() {
	    int mirrorPoint = 354;
	    Pixel leftPixel;
	    Pixel rightPixel;
	    int count = 0;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 231; row < 322; row++)
	    {
	      // loop from left bound to just before the mirror point
	      for (int col = 237; col < mirrorPoint; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    }

	}

	public void mirrorDiagonal() {
		//line where row index = column index
		//there are 484 rows, 484 cols
	    Pixel topRightPix = null;
	    Pixel bottomLeftPix = null;
	    Pixel[][] pixels = this.getPixels2D();
	    int maxLen=0;
	    if(pixels.length < pixels[0].length)
	    	maxLen = pixels.length;
	    else
	    	maxLen = pixels[0].length;
	   
	    // loop through the rows
	    for (int row = 0; row < maxLen; row++)
	    {
	    	// loop from left bound to just before the mirror point
	    	for (int col = row; col < maxLen; col++)
	    	{
		        
		        topRightPix = pixels[row][col];      
		        bottomLeftPix = pixels[col][row];
		        bottomLeftPix.setColor(topRightPix.getColor());
	        }
	    }
	}

	public Picture decode() {
		// TODO Auto-generated method stub
		Pixel[][] pixels = this.getPixels2D();

		Picture messagePicture = new Picture(pixels.length, pixels[0].length);
		Pixel[][] messagePixels = messagePicture.getPixels2D();
		messagePixels = pixels;
		int count=0;
		for(int r=0; r<pixels.length; r++) {
			for(int c=0; c<pixels[0].length; c++) {
				Pixel pixelObj = pixels[r][c];
				Pixel messagePixel = messagePixels[r][c];
				if(pixelObj.getGreen() == pixelObj.getRed() - 2 && pixelObj.getRed() == pixelObj.getBlue() - 2){
			        messagePixel.setColor(Color.BLACK);
			        count++;
				}
			}
		}
		
		
		return  messagePicture;
	}

	public void encode(Picture messagePict) {
		// TODO Auto-generated method stub
		Pixel[][] messagePixels = messagePict.getPixels2D();
		Pixel[][] pixels = this.getPixels2D();
		Pixel currPixel = null;
		Pixel messagePixel = null;
		int count = 0;
		
		for(int r=0; r<pixels.length; r++){
			for(int c=0; c<pixels[0].length; c++) {
				Pixel pixelObj = pixels[r][c];
				if(messagePixels[r][c].getColor().equals(Color.BLACK)){
					if(pixelObj.getGreen() == pixelObj.getBlue() && pixelObj.getGreen() == pixelObj.getRed()){
						pixelObj.setGreen(pixelObj.getGreen()-2);
						pixelObj.setRed(pixelObj.getRed());
						pixelObj.setBlue (pixelObj.getBlue() +2);
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}

  
} // this brace is the end of class Picture, put all new methods before this
