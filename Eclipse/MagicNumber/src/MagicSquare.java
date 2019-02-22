public class MagicSquare {
	private int[][] square;
	/**
	 * Constructor that creates a magic square based off of the number of sides inputted. 
	 * @param side Length of one side of the square
	 */
	public MagicSquare(int side) {
		int currentBlock = 1;
		if(side<3) side=3;
		if(side%2 == 0) side++;
		square = new int [side][side];
		int i = 0;
		int k = (side+1)/2-1;
//		Loop to go through each available block in the square and set the correct value
		while (currentBlock<=side*side) {
			square[i][k] = currentBlock;
			i--;
			k++;
			if (i<0) i = i+side;
			if (k>side-1) k = k-side;
			if (square[i][k] != 0) {
				i=i+2;
				k--;
				if (k<0) k = k+side;
				if (i>side-1) i = i - side;
			}
			currentBlock++;
			
		}
	}
	/**
	 * No arg constructor. Uses the above constructor with the parameter set as 3.
	 */
	public MagicSquare() {
		this(3);
	}
	/**
	 * Checks if the created square is valid by adding up each line and comparing the sums.
	 * @return true if all the sums are equal to its correct value or false if its incorrect
	 */
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
//		Diagonal
		for (int i=0;i<square.length;i++) {
			currentTotal = currentTotal+ square[i][i];
		}
		if (currentTotal != sum) return false;
		else currentTotal = 0;
//		Other diagonal
		for (int i=0;i<square.length;i++) {
			currentTotal = currentTotal+square[i][square.length-i-1];
		}
		if (currentTotal != sum) return false;
		return true;
	}
	/**
	 * gets the sum of the square from one row.
	 * @return the sum of one row
	 */
	public int getSum() {
		int sum = 0;
		for(int i:square[0]) {
			sum = sum + i;
		}
		return sum;
	}
	/**
	 * Gets the length of the square
	 * @return the length of one side of the square
	 */
	public int getSize() {
		return square.length;
	}
	/**
	 * Returns the a string with a square of values from the array
	 */
	@Override
	public String toString() {
		String message = "";
		int count=1;
//		count variable used to add a new line for the correct length of the square.
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
