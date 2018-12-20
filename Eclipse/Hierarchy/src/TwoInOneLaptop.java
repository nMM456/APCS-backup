
public class TwoInOneLaptop extends Laptop implements Touchscreen {

	private int pressure;
	private int pixels;
	
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
