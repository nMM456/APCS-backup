
public class Printer extends Device {
	private int paper;
	public Printer(String name, int price, boolean internet, int paper) {
		super(name, price, internet);
		this.paper = paper;
	}
	/**
	 * 
	 * @param pages
	 * @return String based on if it was able to print or not.
	 */
	public String printPage(int pages) {
		if (paper >= pages) {
			paper -= pages;
			return "You printed out " + pages + " pages of paper. You now have "+paper+" pages left";
		}
		else {
			return "Not enough paper.";
		}
	}
	/**
	 * 
	 * @return paper  returns how many pages are left
	 */
	public int getPaper() {
		return paper;
	}
	/**
	 * 
	 * @param num  A phone number that you would fax to.
	 * @return String  Returns a string that says you fax
	 */
	public String Fax(String num) {
		return "You sent a Fax to " + num;
	}
	/**
	 * @return String  returns a string that says you printed out a flyer.
	 */
	public String helpPewDiePie() {
		return "You Printed out a subscribe to PewDiePie flyer. You did your part!";
	}
	@Override
	public String toString() {
		return super.toString() + "\nPaper:" + paper;
	}

}
