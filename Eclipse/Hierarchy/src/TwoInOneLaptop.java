
public class TwoInOneLaptop extends Laptop implements Touchscreen {

	private int pressure;
	private int pixels;
	
	public TwoInOneLaptop(String name, int price, boolean internet, String brand, int screen, int pixels, int pressure) {
		super(name, price, internet, brand, screen);
	}

	public int getPixels() {
		return pixels;
	}
	
	public int getPressure() {
		return pressure;
	}
	

}