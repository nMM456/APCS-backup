
public abstract class Computer extends Device {
	private String brand;
	private boolean sub;
	/**
	 * 
	 * @param name  name of computer
	 * @param price  price of computer
	 * @param internet  does the computer have internet
	 * @param brand  brand of the computer
	 */
	public Computer(String name, int price, boolean internet, String brand) {
		super(name, price, internet);
		this.brand = brand;
	}
	/**
	 * 
	 * @return brand  returns the brand of the device
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * 
	 * @param num1  a number
	 * @param num2  another number
	 * @return  the two numbers added together
	 */
	public int compute(int num1, int num2) {
		return num1+num2;
	}
	/**
	 * 
	 * @return String  states you played a game.
	 */
	public String Game() {
		return "You played a game";
	}
	/**
	 * 
	 * @param sub  boolean if you have subscribed to PewDiePie
	 */
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
	/**
	 * 
	 * @return sub  returns boolean if you subscribed to pewdiepie
	 */
	public boolean getSub() {
		return sub;
	}
	/**
	 * 
	 * @param cpu  computer object
	 * @return boolean  if they are both subscribed or not it will return true, otherwise false.
	 */
	public boolean equals(Computer cpu) {
		if (sub = cpu.getSub()) return true;
		else return false;
	}
	@Override
	public String toString() {
		return super.toString() + "\nBrand: "+ brand + "\nSubscribed: "+ sub;
	}
	

}
