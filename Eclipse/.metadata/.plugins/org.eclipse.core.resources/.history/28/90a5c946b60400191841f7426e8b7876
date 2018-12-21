
public abstract class Device implements Comparable<Device> {
	private int price;
	private String name;
	private boolean internet;
	private static int devicesCreated = 0;
	
	public Device(String name, int price, boolean internet) {
		this.name = name;
		this.price = price;
		this.internet = internet;
		devicesCreated++;
	}
	public static int deviceCount() {
		return devicesCreated;
	}
	public abstract String helpPewDiePie();
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public boolean hasInternet() {
		return internet;
	}
	public int compareTo(Device device) {
		if (price < device.getPrice()) return -1;
		else if (price == device.getPrice()) return 0;
		else return 1;
	}
	@Override
	public String toString() {
		return name+"\n$" + price +"\nHas Internet:" + internet;
	}
	
}
