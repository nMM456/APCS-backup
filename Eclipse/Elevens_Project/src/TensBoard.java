import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class TensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 13;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public TensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Tens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 10, and (2) a group of four cards consisting of
	 * a jack, a queen, a king and a ten in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		if (selectedCards.size()==2 && containsPairSum10(selectedCards)) return true;
		if (selectedCards.size()==4 && containsQuartet(selectedCards)) return true;
		else return false;
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Tens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 10, or (2) a group
	 * of four cards consisting of a jack, a queen, a king and a ten in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		if (containsPairSum10(cardIndexes())) return true;
		if (containsQuartet(cardIndexes())) return true;
		else return false;
	}

	/**
	 * Check for an 10-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 10-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 10-pair; false otherwise.
	 */
	protected boolean containsPairSum10(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		for (int i=0;i<selectedCards.size()-1;i++) {
			for (int k=i+1;k<selectedCards.size();k++) {
				if (cardAt(selectedCards.get(i)).pointValue() + cardAt(selectedCards.get(k)).pointValue() == 10) return true;
			}
		}
		return false;
	}

	/**
	 * Check for a quartet in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a quartet group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, a king and a ten; false otherwise.
	 */
	protected boolean containsQuartet(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		boolean jack=false;
		boolean queen=false;
		boolean king=false;
		boolean ten=false;
		for (int i=0;i<selectedCards.size();i++) {
			if (cardAt(selectedCards.get(i)).rank().equals("jack")) jack=true;
			if (cardAt(selectedCards.get(i)).rank().equals("queen")) queen=true;
			if (cardAt(selectedCards.get(i)).rank().equals("king")) king=true;
			if(cardAt(selectedCards.get(i)).rank().equals("10")) ten=true;
		}
		if (jack && queen && king && ten) return true;
		else return false;
	}
}
