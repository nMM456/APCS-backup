import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class runner3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ZipCode zipCode = new ZipCode();
		File zipList = new File("ZipBarCodes.txt");
		Scanner zipScan = new Scanner(zipList);
		for (int i=0;zipScan.hasNext();i++) {
			String bar = zipScan.nextLine();
			barCode code = new barCode(bar);
			System.out.println(bar);
			System.out.println(code.checkBarCode());
			System.out.println();
			
			
			
			
		}
	}

}
