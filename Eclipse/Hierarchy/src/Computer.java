
public abstract class Computer extends Device {
	private String brand;
	private boolean sub;

	public Computer(String name, int price, boolean internet, String brand) {
		super(name, price, internet);
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public int compute(int num1, int num2) {
		return num1+num2;
	}
	public String Game() {
		return "You played a game";
	}
	public void setSub(boolean sub) {
		this.sub = sub;
	}
	public String helpPewDiePie() {
		if (hasInternet()) {
			sub = true;
			return "You subscribed to PewDiePie!";
		}
		else return "You didn't have internet access so you created a text document telling people to subcribe to PewDiePie.";
	}
	public boolean getSub() {
		return sub;
	}
	
	public boolean equals(Computer cpu) {
		if (sub = cpu.getSub()) return true;
		else return false;
	}
	

}
