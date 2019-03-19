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
		String[] ranks = {"A", "B","D","A"};
		String[] suits = {"Red", "Black", "Red", "Black"};
		int[] values  = {10, 8, 5, 10};
		Deck d1 = new Deck(ranks, suits, values);
		String[] ranks2 = {"V", "D","K","A"};
		String[] suits2 = {"Red", "Black", "Red", "Black"};
		int[] values2  = {10, 8, 5, 10};
		Deck d2 = new Deck(ranks2, suits2, values2);
		String[] ranks3 = {"N", "M","K","B"};
		String[] suits3 = {"Red", "Black", "Red", "Black"};
		int[] values3  = {13, 8, 7, 10};
		Deck d3s = new Deck(ranks3, suits3, values3);
	}
}
