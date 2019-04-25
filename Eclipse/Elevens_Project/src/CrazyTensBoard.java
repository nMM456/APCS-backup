import java.util.List;

public class CrazyTensBoard extends TensBoard {
	public CrazyTensBoard() {
		super();
	}
//	If the two selected cards is equal 0, remove them.
//	Need another rules/ideas to complete
	@Override
	public boolean isLegalZero(List<Integer> selectedCards) {
		for (int i=0;i<selectedCards.size();)
	}
	
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		return super.isLegal(selectedCards) || (selectedCards.size()==2 && cardAt
	}
}
