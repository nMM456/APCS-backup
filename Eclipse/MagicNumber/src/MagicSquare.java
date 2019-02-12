
public class MagicSquare {
	private int sideLength;
	private int[][] Square;
	public MagicSquare(int side) {
		int currentBlock = 1;
		if(side<3) side=3;
		if(side%2 == 0) side++;
		sideLength = side;
		Square = new int [sideLength][sideLength];
		int x=0;
		int y = (side+1)/2-1;
		Square[x][y]=currentBlock;
			while (currentBlock<sideLength*sideLength) {
				x--;
				y++;
				if (x<0) x = sideLength-1;
				if (y>sideLength-1) y = y-sideLength;
				if (Square[x][y] != 0) {
					x=x+2;
					y--;
					if (y>sideLength) y = 0;
				}
				currentBlock++;
				Square[x][y] = currentBlock;
			}
	}
	public MagicSquare() {
		this(3);
		
//		MAKE THE CONSTRUCTOR MAKE THE SQUARE LULW
	}
	public int getSum() {
		int sum = 0;
		for(int i:Square[0]) {
			sum = sum + i;
		}
		return sum;
	}
	
	public int getSize() {
		return sideLength;
	}

}
