
public class Desktop extends Computer {
	private int power;
	public Desktop(String name, int price, boolean internet, String brand, int power) {
		super(name, price, internet, brand);
		this.power = power;
	}
	private int Efficiency() {
//		Scale of 1-10, 1 being unefficient, 10 being efficient based on power usage.
		return power/10;
	}
	public int getEfficiency() {
		return Efficiency();
	}
	@Override
	public String Game() {
		if ((int)(Math.random())*5 == 1) return "You played Minecraft for 2 hours straight";
		if ((int)(Math.random())*5 == 3) return "You're computer overheated!";
		else return "You played Minesweeper and won!";
	}
	public String toString() {
		return super.toString() + "\nEfficiency: "+Efficiency();
	}
	

}
