import java.io.File;

public class Location {

ZipCode ZipCode;
private String zipcity;
private String zipstate;
private String zip;

public Location()
{
	zip="";
	zipcity="";
	zipstate="";
	
}

public Location(String zipcitys, String zipstates, String zips)
{
	
	zip=zips;
	zipcity=zipcitys;
	zipstate=zipstates;
	
}	

public void setLocation(String zipcity, String zipstate)
{

	zipcity=zipcity;
	zipstate=zipstate;

}

public String getZipCity()
{

	return zipcity;
	
}

public String getZipState()
{

	return zipstate;
	
}

public String getZipCode()
{
	
	return zip;
	
}

public void newzip(String newZip)
{
	
	zip= newZip;
	
}

public String toString()
{
	
	return zip;
	
}

	
	
	
}
