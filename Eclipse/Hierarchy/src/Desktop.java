
public class Desktop extends Computer {
	private final int POWER;
//OK RETARD, FIX THE FINAL THING. IT DOESNT WORK YOU CHANGE IT IN THE CONSTRUCTOR YOU FUCKING MORON
	public Desktop(String name, int price, boolean internet, String brand, int POWER) {
		super(name, price, internet, brand);
		this.POWER = POWER;
	}
	public int Efficiency() {
//		Scale of 1-10, 1 being unefficient, 10 being efficient based on power usage.
		return POWER/10;
	}
	

}