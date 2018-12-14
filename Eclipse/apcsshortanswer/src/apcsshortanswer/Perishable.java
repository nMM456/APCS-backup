package apcsshortanswer;

public class Perishable extends InventoryItem {
	private Date entry;
	private Date exp;
	private int price;
	public Perishable() {
		entry = new entry();
		exp = new exp();
	}
	public int checkDate() {
		if (entry <= exp) {
			return price;
		}
		else {
			return (int) (price*.90);
		}
	}

}
