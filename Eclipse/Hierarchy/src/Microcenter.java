
public class Microcenter {

	public static void main(String[] args) {
		System.out.println("Nicholas Markou AP CS Inheritance Project");
		//Alias
		Device[] aCoolArray = new Device[5];
		Device[] Devices = aCoolArray;
		//PRINTER OBJECT
		Devices[0] = new Printer("HP LaserJet", 99, true, 200);
		System.out.println(Devices[0].getName());
		System.out.println(Devices[0].helpPewDiePie());
		System.out.println(((Printer)Devices[0]).Fax("508-836-7723"));
		System.out.println(((Printer)Devices[0]).printPage(13));
		System.out.println();
		
		//DESKTOP OBJECT
		Devices[1] = new Desktop("Omen", 999, false, "HP", 450);
		System.out.println(Devices[1].getName());
		System.out.println(Devices[1].helpPewDiePie());
		System.out.println(((Desktop)Devices[1]).Game());
		System.out.println();
		
		//LAPTOP OBJECT
		Devices[2] = new Laptop("Inspirion", 650, true, "Dell", 14);
		System.out.println(Devices[2].getName());
		System.out.println(Devices[2].helpPewDiePie());
		System.out.println(((Laptop)Devices[2]).Game());
		System.out.println();
		
		//TWO IN ONE LAPTOP OBJECT
		Devices[3] = new TwoInOneLaptop("Inspirion 2-in-1", 750, true, "Dell", 14, 2160, 256);
		System.out.println(Devices[3].getName());
		System.out.println(Devices[3].helpPewDiePie());
		System.out.println(((TwoInOneLaptop)Devices[3]).useTouchscreen());
		System.out.println(((TwoInOneLaptop)Devices[3]).Game());
		System.out.println();
		
		//TABLET OBJECT
		Devices[4] = new Tablet("iPad", 1899, true, "Apple", 2160, 512);
		System.out.println(Devices[4].getName());
		System.out.println(Devices[4].helpPewDiePie());
		System.out.println(((Tablet)Devices[4]).socialMedia());
		System.out.println(((Tablet)Devices[4]).useTouchscreen());
		System.out.println(((Tablet)Devices[4]).Game());
		System.out.println();
		
		//Comparing
		System.out.println("Which costs more, "+Devices[2].getName()+" or "+Devices[3].getName()+"?");
		int compareValue = Devices[2].compareTo(Devices[3]);
		if (compareValue == -1) System.out.println("The "+Devices[3].getName() + " costs more.");
		else if (compareValue == 0) System.out.println("They cost the same.");
		else System.out.println("The "+Devices[2].getName() +" Costs more.");
		System.out.println();
		
		//Equals
		System.out.println("Are both devices "+Devices[2].getName()+" and " + Devices[3].getName()+" subcribed?");
		System.out.println(((Computer)Devices[2]).equals(((Computer)Devices[3])));
		
		//Information about each Device
		System.out.println("Devices created: " + Device.deviceCount()+"\n");
		for (Device theDevice:Devices) {
			System.out.println(theDevice);
			System.out.println();
		}
		
	}

}
