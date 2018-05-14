/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want to run
//	  testBlur(160, 190, 80, 80, 10);		//labAssessment 4/24/18
	  //    testZeroBlue();		//done
//    testKeepOnlyBlue();	//done
//    testKeepOnlyRed();	//done
//    testKeepOnlyGreen();	//done
//    testNegate();			//done
//    testGrayscale();		//error!!!!
//    testFixUnderwater();	//done
//    testMirrorVertical();	//welp it was already done
//    testMirrorTemple();	//uh it was already done
//    testMirrorArms();		//done
//    testMirrorGull();		//done
//    testMirrorDiagonal();	//done
//    testCollage();		//already done
//    testCopy();				//done
//    testEdgeDetection();	//dunzo
	  testEncode();
	  testDecode();
/*  don't do these:
  	//testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);*/
  }
  private static void testDecode() {
	// TODO Auto-generated method stub
	Picture image = new Picture("beach.jpg");
//	redMoto.explore();
	image.decode();
	image.explore();
	
	
  }

  private static void testEncode() {
	// TODO Auto-generated method stub
	Picture image = new Picture("beach.jpg");
	Picture messagePic = new Picture("msg.jpg");
//	pictureMessage.explore();
	image.explore();
	image.encode(messagePic);
	image.explore();
	
  }

  private static void testBlur(int x, int y, int w, int h, int n) {
	  Picture redMoto = new Picture("redMotorcycle.jpg");
	  redMoto.explore();
	  for(int i=0; i<n; i++){
		  redMoto.blur(x,y,w,h);
	  }
	  redMoto.explore();
	  
	  
  }

private static void testCopy() {
	// TODO Auto-generated method stub
	Picture snowman = new Picture("snowman.jpg");
	snowman.explore();
	snowman.copy(snowman, 119, 170);
	snowman.explore();
  }

  private static void testMirrorDiagonal() {
	Picture koala = new Picture("koala.jpg");
	koala.explore();
	koala.mirrorDiagonal();
	koala.explore();
  }
  
  private static void testMirrorGull() {
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.explore();
	  seagull.mirrorGull();
	  seagull.explore();
  }

  private static void testMirrorArms() {
	  Picture snowman = new Picture ("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();  
  }

  private static void testNegate() {
	  Picture koala = new Picture("koala.jpg");
	  koala.explore();
	  koala.negate();
	  koala.explore();
  }
	
  public static void testKeepOnlyBlue() {
	  Picture koala = new Picture("koala.jpg");
	  koala.explore();
	  koala.keepOnlyBlue();
	  koala.explore();	
  }
	
  public static void testKeepOnlyRed()  {
	  Picture koala = new Picture("koala.jpg");
	  koala.explore();
	  koala.keepOnlyRed();
	  koala.explore();
  }
  public static void testKeepOnlyGreen()  {
	  Picture koala = new Picture("koala.jpg");
	  koala.explore();
	  koala.keepOnlyGreen();
	  koala.explore();
  }
  public static void testGrayscale(){
	  Picture kitten2 = new Picture("kitten2.jpg");
	  kitten2.explore();
	  kitten2.grayscale();
	  kitten2.explore();
  }
  public static void testFixUnderwater(){
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }

}