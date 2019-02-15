public class MagicSquare {
	private int[][] square;
	public MagicSquare(int side) {
		int currentBlock = 1;
		if(side<3) side=3;
		if(side%2 == 0) side++;
		square = new int [side][side];
		int x=0;
		int y = (side+1)/2-1;
		while (currentBlock<=side*side) {
			square[x][y] = currentBlock;
			x--;
			y++;
			if (x<0) x = x+side;
			if (y>side-1) y = y-side;
			if (square[x][y] != 0) {
				x=x+2;
				y--;
				if (y<0) y = y+side;
				if (x>side-1) x = x - side;
			}
			currentBlock++;
			
		}
	}
	public MagicSquare() {
		this(3);
	}
	public boolean validSquare() {
		int sum=getSum();
		int currentTotal=0;
//		Horizontal
		for (int i=0;i<square.length;i++) {
			for (int k=0;k<square[i].length;k++) {
				currentTotal = currentTotal+square[i][k];
			}
			if (currentTotal != sum) return false;
			else currentTotal = 0;
		}
//		Vertical row
		for (int i=0;i<square.length;i++) {
			for (int k=0;k<square[i].length;k++) {
				currentTotal = currentTotal+square[k][i];
			}
			if (currentTotal != sum) return false;
			else currentTotal = 0;
		}
//		Diagonal, top left
		for (int i=0;i<square.length;i++) {
			currentTotal = square[i][i];
		}
		if (currentTotal != sum) return false;
		else currentTotal = 0;
		for (int i=sum-1;i>0;i--) {
			currentTotal = currentTotal+square[i][i];
		}
		if (currentTotal != sum) return false;
		else return true;
	}
	public int getSum() {
		int sum = 0;
		for(int i:square[0]) {
			sum = sum + i;
		}
		return sum;
	}
	
	public int getSize() {
		return square.length;
	}
	@Override
	public String toString() {
		String message = "";
		int count=1;
			for (int[] i:square) {
				for (int k:i) {
					if (count==getSize()) {
						message += k + "|\n";
						count=0;
					}
					else message += k + "|";
					count++;
				}
			}
		return message;
	}

}
