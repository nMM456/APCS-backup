
public interface Touchscreen {
	/**
	 * 
	 * @return pixels  amount of pixels on the screen
	 */
	public int getPixels();
	/**
	 * 
	 * @return pressure  amount  of pressure recognized on the screen
	 */
	public int getPressure();
	/**
	 * 
	 * @return String  what happens when you touch the screen
	 */
	String useTouchscreen();
	
}
