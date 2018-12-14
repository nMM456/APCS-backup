
public abstract class Device {
	private int price;
	private String name;
	private boolean internet;
	
	public Device(String name, int price, boolean internet) {
		this.name = name;
		this.price = price;
		this.internet = internet;
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
	@Override
	public String toString() {
		return name+", $" + price +", Has Internet:" + internet;
	}
	
	
	
	
}
