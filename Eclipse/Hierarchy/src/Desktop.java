
public class Desktop extends Computer {
	private int power;
	/**
	 * 
	 * @param name  name of the desktop
	 * @param price  price of the desktop
	 * @param internet  does the desktop have internet
	 * @param brand  brand of the device
	 * @param power  how m,uch power does the device use
	 */
	public Desktop(String name, int price, boolean internet, String brand, int power) {
		super(name, price, internet, brand);
		this.power = power;
	}
	/**
	 * 
	 * @return power/10  how efficient a device is based on power inputted before
	 */
	private int Efficiency() {
//		Scale of 1-10, 1 being unefficient, 10 being efficient based on power usage.
		return power/10;
	}
	/**
	 * 
	 * @return returns efficiency value
	 */
	public int getEfficiency() {
		return Efficiency();
	}
	@Override
	public String Game() {
		if ((int)(Math.random())*5 == 1) return "You played Minecraft for 2 hours straight";
		if ((int)(Math.random())*5 == 3) return "You're computer overheated!";
		else return "You played Minesweeper and won!";
	}
	public String toString() {
		return super.toString() + "\nEfficiency: "+Efficiency();
	}
	

}
