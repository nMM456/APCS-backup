
public class MagicSquare {
	private int sideLength;
	private int[][] Square;
	public MagicSquare(int side) {
		if(side<3) side=3;
		if(side%2 == 0) side++;
		sideLength = side;
		Square = new int [sideLength][sideLength];
//		ACTUALLY MAKE THE CONSTRUCTOR MAKE THE SQUARE LULW
	}
	public MagicSquare() {
		sideLength = 3;
		Square = new int[sideLength][sideLength];
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
