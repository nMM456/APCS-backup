import java.util.List;

public class CrazyTensBoard extends TensBoard {
	public CrazyTensBoard() {
		super();
	}
	/**
	 * Checks if the selected cards can be subtracted either way to equal -1.
	 * @param selectedCards List of indexes of selected cards on the board
	 * @return true if the subset has a possibility to subtract two numbers and equal -1, otherwise returns false.
	 */
	private boolean isLegalNegativeOne(List<Integer> selectedCards) {
		for (int i=0;i<selectedCards.size()-1;i++) {
			for (int k=i+1;k<selectedCards.size();k++) {
				if (cardAt(selectedCards.get(i)).pointValue() - cardAt(selectedCards.get(k)).pointValue() == -1) return true;
				if (cardAt(selectedCards.get(k)).pointValue() - cardAt(selectedCards.get(i)).pointValue() == -1) return true;
			}
		}
		return false;
	}
	/**
	 * It takes the isLegal from the TensBoard class and also checks for if any of the cards can equal -1.
	 * @param selectedCards List of indexes of selected cards on the board
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		return super.isLegal(selectedCards) || isLegalNegativeOne(selectedCards);
	}
	/**
	 * Checks if another play can be done in addition to the new rule.
	 * @return true if another play is possible, otherwise it returns false.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		if (isLegalNegativeOne(cardIndexes())) return true;
		else return super.anotherPlayIsPossible();
	}
}
