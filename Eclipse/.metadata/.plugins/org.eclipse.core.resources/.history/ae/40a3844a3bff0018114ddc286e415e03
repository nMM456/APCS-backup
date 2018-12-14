
public class Printer extends Device {
	private int paper;
	public Printer(String name, int price, boolean internet, int paper) {
		super(name, price, internet);
		this.paper = paper;
	}
	public void printPage(int pages) {
		if (paper >= pages) {
			paper =- pages;
		}
		else {
			System.out.println("Not enough paper.");
		}
	}
	public int getPaper() {
		return paper;
	}
	public void Fax(String num) {
		System.out.println("Sent a fax to " + num);
	}
	public void SubToPewDiePie() {
		System.out.println("Printed out Subscribe to PewDiePie flyer.");
	}
	@Override
	public String toString() {
		return "Name: " + super.getName() + "\n" + "Price" + super.getPrice()
		+ "\n" + "Has internet: " + super.hasInternet() + "\n" + "Paper: " + paper;
	}

}
