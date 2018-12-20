
public class Printer extends Device {
	private int paper;
	public Printer(String name, int price, boolean internet, int paper) {
		super(name, price, internet);
		this.paper = paper;
	}
	public String printPage(int pages) {
		if (paper >= pages) {
			paper -= pages;
			return "You know have "+paper+" pages left";
		}
		else {
			return "Not enough paper.";
		}
	}
	public int getPaper() {
		return paper;
	}
	public String Fax(String num) {
		return "Sent a Fax to " + num;
	}
	public String helpPewDiePie() {
		return "Printed out Subscribe to PewDiePie flyer. You did your part!";
	}
	@Override
	public String toString() {
		return super.toString() + "\nPaper:" + paper;
	}

}
