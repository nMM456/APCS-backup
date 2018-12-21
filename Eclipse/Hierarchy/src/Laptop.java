
public class Laptop extends Computer {
	private int screen; // Screen size
	/**
	 * 
	 * @param name  name of laptop
	 * @param price  price of laptop
	 * @param internet  does the laptop have internet
	 * @param brand  brand of the laptop
	 * @param screen  screen size
	 */
	public Laptop(String name, int price, boolean internet, String brand, int screen) {
		super(name, price, internet, brand);
		this.screen = screen;
	}
	/**
	 * 
	 * @return screen  the length of the screen
	 */
	public int getScreen() {
		return screen;
	}
	@Override
	public String Game() {
		return "You tried to play a game, but your laptop overheated.";
	}
	@Override
	public String toString() {
		return super.toString() + "\nScreen Size: " + screen;
	}
	
}
