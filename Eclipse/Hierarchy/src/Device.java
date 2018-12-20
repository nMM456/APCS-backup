
public abstract class Device {
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
	@Override
	public String toString() {
		return name+", $" + price +", Has Internet:" + internet;
	}
	
}
