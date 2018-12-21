
public interface Touchscreen {
	/**
	 * Return number of pixels on the screen
	 * @return pixels  amount of pixels on the screen
	 */
	public int getPixels();
	/**
	 * Return how much pressure a screen can recognize
	 * @return pressure  amount  of pressure recognized on the screen
	 */
	public int getPressure();
	/**
	 * Use the touchscreen on the device.
	 * @return String  what happens when you touch the screen
	 */
	String useTouchscreen();
	
}
