import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner1And2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
//		creates zip code object
		ZipCode zipCode = new ZipCode();
		File zipList = new File("ZipCodes.txt");
		Scanner zipScan = new Scanner(zipList);
		for (int i=0;zipScan.hasNext();i++) {
			String line = zipScan.nextLine();
			zipCode.newZip(line);
			String zip = zipCode.getZip();
			String[] location = zipCode.getLocations(zip);
			barCode barCode = new barCode(zipCode);
//			Loop uses location class to print out the city and state
			for (int k=0;k<location.length;k+=2) {
				Location local = new Location(location[k+1], location[k], zip);
				System.out.println("Zip Code: " + zip);
				System.out.println("City: " + local.getZipState());
				System.out.println("State: " + local.getZipCity());
				if (!(k == location.length-2)) {
//					Dividing line break for multiple locations with the same zip code
					System.out.println();
				}
			}
			System.out.println("Bar Code: " + barCode.toBarCode());
//			Dividing line
			if (zipScan.hasNext()) {
				System.out.println("-----------------------------------------------------");
			}
		}
		
	}
}
