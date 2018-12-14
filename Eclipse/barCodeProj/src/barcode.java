import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class barcode {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File zipList = new File("ZipCodes.txt");
		Scanner findZip = new Scanner(zipList);
		while (findZip.hasNext() == true) {
			String zipCode = findZip.next();
			String barCode = translate(zipCode);
			String locations[] = location(zipCode);
			for (int i=0;i<locations.length;i++) {
				System.out.println("Zip Code: "+ zipCode +  " " + locations[i]);
			}
			System.out.println("Postal Code: " + barCode);
			System.out.println("Readable Code: " + barCode.charAt(0) + "   " + barCode.substring(1, 6) + "   " + barCode.substring(6, 11) + "   " + barCode.substring(11, 16)
			+ "   " + barCode.substring(16, 21) + "   " + barCode.substring(21, 26) + "   " + barCode.substring(26, 31) + "   " + barCode.charAt(31));
	}
}
	private static String translate(String zipCode) {
		String barCode = "";
		int total = 0;
		String barCodesList[] = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
		for (int i=0;i<zipCode.length();i++) {
			char aNum = zipCode.charAt(i);
			int num = Integer.parseInt(String.valueOf(aNum));
			total = Integer.parseInt(String.valueOf(aNum)) + total;
			barCode = barCode + barCodesList[num];
		}
		//check digit starts here
		if (total%10 == 0) {
			barCode = barCode + barCodesList[0];
		}
		else {
			barCode = barCode + barCodesList[10 - (total%10)];
		}
		barCode = "|"+barCode+"|";
		return barCode;
	}
	private static String[] location(String zipCode) throws FileNotFoundException {
		File CityList = new File("ZipCodesCity.txt");
		Scanner findCity = new Scanner(CityList);
		String locationsoriginal[] = new String[100];
		int count = 0;
		while (findCity.hasNext() == true) {
			String line = findCity.nextLine();
			if (zipCode.equals(line.substring(0, 5))) {
				locationsoriginal[count] = line.substring(6);
				count++;
			}
		}
		String locations[] = new String[count];
		System.arraycopy(locationsoriginal, 0, locations, 0, count);
		return locations;
	}

}
