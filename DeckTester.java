/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] myRanks1 = {"jack", "queen", "king"};
		String[] mySuits1 = {"clubs", "hearts", "clubs"};
		int[] myValues1 = {11,12,13};
	
		Deck d1 = new Deck(myRanks1, mySuits1, myValues1);

		System.out.println(d1.isEmpty());
		System.out.println(d1.size());
		System.out.println(d1.deal());
		System.out.println(d1.size());
	}
}
