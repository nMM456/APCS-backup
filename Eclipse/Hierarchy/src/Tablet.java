
public class Tablet extends Computer implements Touchscreen{
	private final int pixels;
	private final int pressure;
	/**
	 * Constructor
	 * @param name  name of tablet
	 * @param price  price of the tablet
	 * @param internet  does the tablet have internet
	 * @param brand  brand of the tablet
	 * @param pixels  how many pixels does the tablet have
	 * @param pressure  how much pressure the screen recognizes
	 */
	public Tablet(String name, int price, boolean internet, String brand, int pixels, int pressure) {
		super(name, price, internet, brand);
		this.pixels = pixels;
		this.pressure = pressure;
	}
	public int getPixels() {
		return pixels;
	}

	public int getPressure() {
		return pressure;
	}
	/**
	 * Use social media
	 * @return String using social media and what you do.
	 */
	public String socialMedia() {
		if ((int)(Math.random()*10) + 1 == 4) {
			return "Posted a photo to FaceBook";
		}
		else {
			return "You looked at a friends photo on FaceBook.";
		}
	}
	@Override
	public String helpPewDiePie() {
		if (hasInternet()) {
			setSub(true);
			return "You opened up the YouTube App and subscribed to PewDiePie.";
		}
		else return "You didn't have internet access so you couldn't help him.";
	}
	public String useTouchscreen() {
		return "You touched the screen and opened up a web browser.";
	}
	public String toString() {
		return super.toString() + "\nScreen Pressure: " + pressure + "\nPixels: "  + pixels;
	}
	

}
