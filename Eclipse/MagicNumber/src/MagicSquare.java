
public class MagicSquare {
	private int[][] Square;
	public MagicSquare(int side) {
		int currentBlock = 1;
		if(side<3) side=3;
		if(side%2 == 0) side++;
		Square = new int [side][side];
		int x=0;
		int y = (side+1)/2-1;
		while (currentBlock<=side*side) {
			Square[x][y] = currentBlock;
			x--;
			y++;
			if (x<0) x = x+side;
			if (y>side-1) y = y-side;
			if (Square[x][y] != 0) {
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
//	public boolean validSquare() {
//	}
	public int getSum() {
		int sum = 0;
		for(int i:Square[0]) {
			sum = sum + i;
		}
		return sum;
	}
	
	public int getSize() {
		return Square.length;
	}
	@Override
	public String toString() {
		String message = "";
		int count=1;
		for (int i=0;i<Square.length;i++) {
			for (int k=0;k<Square[i].length;k++) {
				if (count==getSize()) {
					message += Square[i][k] + "|\n";
					count=0;
				}
				else message += Square[i][k] + "|";
				count++;
			}
		}
		return message;
	}

}