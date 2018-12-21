
public class TwoInOneLaptop extends Laptop implements Touchscreen {

	private int pressure;
	private int pixels;
	/**
	 * Constructor
	 * @param name  name of the laptop
	 * @param price  price of the laptop
	 * @param internet  does the laptop have internet
	 * @param brand  brand of the laptop
	 * @param screen  screen size
	 * @param pixels  amount of pixels
	 * @param pressure  amount of recognized pressure on the screen
	 */
	public TwoInOneLaptop(String name, int price, boolean internet, String brand, int screen, int pixels, int pressure) {
		super(name, price, internet, brand, screen);
		this.pressure = pressure;
		this.pixels = pixels;
	}
	public int getPixels() {
		return pixels;
	}
	public int getPressure() {
		return pressure;
	}
	public String useTouchscreen() {
		return "You used the touchscreen and opened up Minecraft.";
	}
	public String toString() {
		return super.toString() + "\nScreen Pressure: " + pressure + "\nPixels: "  + pixels;
	}
	

}
