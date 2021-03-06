
public abstract class Device implements Comparable<Device> {
	private int price;
	private String name;
	private boolean internet;
	private static int devicesCreated = 0; 
//	static variable used to count amount of device objects made, later used in deviceCount() method
	/**
	 * Constructor
	 * @param name  name of the device
	 * @param price  cost of the device
	 * @param internet  does it have internet?
	 */
	public Device(String name, int price, boolean internet) {
		this.name = name;
		this.price = price;
		this.internet = internet;
		devicesCreated++;
	}
	/**
	 * Returns how many devices were created
	 * @return  returns how many device objects have been made. 
	 */
	public static int deviceCount() {
		return devicesCreated;
	}
	/**
	 * Returns a string saying you helped PewDiePie
	 * @return
	 */
	public abstract String helpPewDiePie();
	/**
	 * Returns price variable
	 * @return price  method that returns price of device
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * Returns name variable
	 * @return name  method that returns name of device
	 */
	public String getName() {
		return name;
	}
	/**
	 * Returns if the device has internet or not
	 * @return internet  returns boolean if the device has internet or not
	 */
	public boolean hasInternet() {
		return internet;
	}
	public int compareTo(Device device) {
//		Compares price of two device objects.
		if (price < device.getPrice()) return -1;
		else if (price == device.getPrice()) return 0;
		else return 1;
	}
	@Override
	public String toString() {
		return name+"\n$" + price +"\nHas Internet: " + internet;
	}
	
}
