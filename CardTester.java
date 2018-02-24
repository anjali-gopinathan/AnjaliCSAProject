/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c1 = new Card("10", "hearts", 10);
		//c("A", "spades", 11);
		Card c2 = new Card("Ace",  "spades", 11);		//??is an ace 11 points???
		Card c3 = new Card("4",  "clubs",  4);
		
		System.out.println(c1.rank());
		System.out.println(c1.suit());
		System.out.println(c1.pointValue());
		
		System.out.println(c2.matches(c3));
		System.out.println(c1.matches(c2));
		
		System.out.println(c1);
	
	}
}
