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
		Card c1 = new Card("A", "C", 1);
		Card c2 = new Card("A", "C", 1);
		Card c3 = new Card("A", "B", 2);
		System.out.println(c1);
		System.out.println(c1.matches(c2));
		System.out.println(c2.matches(c3));
	}
}
