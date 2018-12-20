
public class Microcenter {

	public static void main(String[] args) {
		System.out.println("Nicholas Markou AP CS Inheritance Project");
		//Alias
		Device[] aCoolArray = new Device[5];
		Device[] Devices = aCoolArray;
		//PRINTER OBJECT
		Devices[0] = new Printer("HP LaserJet", 99, true, 200);
		Devices[0].helpPewDiePie();
		((Printer)Devices[0]).Fax("508-836-7723");
		((Printer)Devices[0]).printPage(13);
		
		//DESKTOP OBJECT
		Devices[1] = new Desktop("Omen", 999, false, "HP", 450);
		Devices[1].helpPewDiePie();
		((Desktop)Devices[1]).Game();
		
		//LAPTOP OBJECT
		Devices[2] = new Laptop(Inspirion, 650, true, "Dell", 14);
		Devices[2].helpPewDiePie();
		((Laptop)Devices[2]).Game();
		
		//TWO IN ONE LAPTOP
		Devices[3] = new TwoInOneLaptop("Inspirion", 750, true, "Dell", 14, 2160, 256);
		Devices[3].helpPewDiePie();
		((TwoInOneLaptop)Devices[3]).useTouchscreen();
		((TwoInOneLaptop)Devices[3]).Game();
		
		//TABLET
		Devices[4] = new Tablet("iPad", 1899, true, "Apple", 2160, 512);
		Devices[4].helpPewDiePie();
		((Tablet)
		
	}

}
