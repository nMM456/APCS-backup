
public abstract class Device {
	private int price;
	private String name;
	private boolean internet;
	private static int devicesOn;
	private boolean isOn;
	
	public Device(String name, int price, boolean internet) {
		this.name = name;
		this.price = price;
		this.internet = internet;
		isOn = false;
		
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public boolean hasInternet() {
		return internet;
	}
	public void turnOn() {
		if (isOn == false) {
			isOn = true;
			devicesOn++;
		}
	}
	@Override
	public String toString() {
		return name+", $" + price +", Has Internet:" + internet;
	}
	
	
	
	
}
