import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientClassOption3 {


//Option 3: create an array of ZipCode objects using data from ZipBarCodes.txt. 
//Use a for each loop to access and print the objects

public static void main(String[] args) throws FileNotFoundException	{
	
	File Zips= new File ("ZipBarCodes.txt");
	Scanner in = new Scanner(Zips);
	String[] barCode = new String[11];
	for (int i=0;in.hasNext();i++) {
		barCode[i] = in.nextLine();
	}
	String[] zipCode = new String[11];
	
	ZipCode Zip = new ZipCode(zipCode[0]);
	for (int k=0;k<barCode.length;k++) {
		zipCode[k] = Zip.decodeBarcode(barCode[k]);
	}
	for (String zip: zipCode) {
		for (int k=0;k<barCode.length;k++) {
			barCode barCodes = new barCode(barCode[k]);
			barCodes.changeZip(zip);
			System.out.println(zip);
		}
	}

}

}
