import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ZipCode {

	private barCode barCode;
	private String[] RawLocation = new String[100];
	private int Counter=0;
	String decodedzip;
	private String zipcode;
	File Zips= new File ("ZipCodesCity.txt") ;


	
    public ZipCode() throws FileNotFoundException
    {
    
    Scanner in= new Scanner(Zips);
    String currentline;
   
    currentline=in.next().trim();
	zipcode=currentline.substring(0, currentline.indexOf(","));
	
    }
    
	public ZipCode(String zip)
	{
		
	zipcode = zip;
	
	}
	
	public String getBarcode()
	{
	
	return barCode.getBarCode();
	
	}
	
	public String getZip()
	{
		
	return zipcode;
	
	}
	public void newZip(String zipCode) {
		zipcode = zipCode;
	}
	
	public String[] getLocations(String zipcode) throws FileNotFoundException
	{
		
		int counter = 0;
		Scanner in= new Scanner(Zips);
		String[] currentline = new String[3];
		while (in.hasNext()) {
		    String line = in.nextLine();
		    currentline = line.split(",");
			if (currentline[0].equals(zipcode))
			{
				//currentline[1] is city, 2 is state
				RawLocation[counter] = currentline[1];
				RawLocation[counter+1] = currentline[2];
				counter += 2;
			}
			
		}
		String[] theLocations = new String[counter];
		System.arraycopy(RawLocation, 0, theLocations, 0, counter);
		
		return theLocations;
		
	}
	
	public String decodeBarcode(String Barcode)
	{
	
	String currentsection;
	String binarysection;
	int digit;
	decodedzip="";
	
	//Removes beginning bar, ending bar, and check sum.
	Barcode= Barcode.substring(1,Barcode.length()-6);
	
	for(int i=0;i<5;i++)
	{
    //This takes one encoded digit in the line. Each iteration of the for loop moves it by 5 digits, which is the length of each encoded digit. 
	currentsection=Barcode.substring(0+5*i,5+(5*i));
	
	binarysection="";
	
	// This algorithm reads the current encoded digit and creates binarysection, which is a string of 1s for |s and 0s for :s 
    for(int k=0;k<5;k++)
    {
    	if(currentsection.substring(k,k+1).equals(":"))
    	{
    	binarysection+="0";
    	}
    	if(currentsection.substring(k,k+1).equals("|"))
    	{
    	binarysection+="1";
    	}
    }
    
   // This algorithm uses binarysection and finds the decoded digit. 
   digit= (Integer.parseInt(binarysection.substring(0,1))*7)  +   (Integer.parseInt(binarysection.substring(1,2))*4)  +  (Integer.parseInt(binarysection.substring(2,3))*2)  +  Integer.parseInt(binarysection.substring(3,4));
   
   // If the digit is over 11 or under 0, there is an error. 
   if (digit>11||digit<0)
   {
	   System.out.print("error");
   }
   // If the digit is 11, it is changed to 0 
   if (digit==11)
   {
	   digit=0;
   }
  
   // After each digit is decoded, it is added to the string decodedzip
   else
   {
   decodedzip+= digit;
   }
   
}

	return decodedzip;
	
		
}
	public String toString(int inty)
	{
		
	return Integer.toString(inty);
	
	}
	
	
}

