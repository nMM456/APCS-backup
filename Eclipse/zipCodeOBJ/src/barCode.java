import java.io.File;

public class barCode {
	private String[] barCodes = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
	private String barCode;
	private String zipCode;
	
	/**
	 * Sets zipCode and barCode empty when there is no variable
	 */
	public barCode() {
		zipCode = "";
		barCode = "";
	}
	/**
	 * Constructor, takes in zipCode object
	 * @param zipCode
	 */
	public barCode(ZipCode zipCodes) {
		zipCode = zipCodes.getZip();
	}
	/**
	 * constructor, saves zipCode from zipCode object.
	 * @param barCode
	 */
	public barCode(String barCodes) {
		barCode = barCodes;
	}
	/**
	 * Saves barCode from an inputted bar code string.
	 * @param zipCode
	 */
	public void changeZip(String zipCode) {
		zipCode = zipCode;
	}
	/**
	 * mutator method to change the zip code.
	 * @return
	 */
	public String getZipCode() {
		System.out.print(zipCode);
		return zipCode;
	}
	/**
	 * returns the zip code
	 * @return
	 */
	public String toBarCode() {
		int total = 0;
		barCode = "";
		for (int i=0;i<zipCode.length();i++) {
			char aNum = zipCode.charAt(i);
			int num = Integer.parseInt(String.valueOf(aNum));
			total += num;
			barCode = barCode + barCodes[num];
		}
		if (total%10 == 0) {
			barCode += barCodes[0];
		}
		else {
			barCode = barCode + barCodes[10 - (total%10)];
		}
		barCode = "|" + barCode + "|";
		return barCode;
	}
	/**
	 * converts zip code to bar code
	 * @return
	 */
	public String getBarCode() {
		return barCode;
	}
	/**
	 * returns the bar code
	 * @return
	 */
	public boolean checkBarCode() {
//		converts decoded bar code back to zip code to compare
		String checkCode = barCode;
		toBarCode();
//		compares bar codes
		if (checkCode == barCode) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * checks the bar code, returns true if it is valid
	 * returns false if it is invalid
	 */
	public String toString() {
		return barCode;
	}
	
	

}
