import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class Forecast {
	public static void main(String[] args) throws IOException {
	    URL url = new URL("https://api.weather.gov/points/42.2695,-71.6161/forecast");
	    Scanner scan = new Scanner(url.openStream());
	    String str = "";
	    while (scan.hasNext())
	        str += scan.nextLine();
	    scan.close();
//	    Takes data from website and puts it into a string
//	    Use the string and create a JSONObject to parse the data given.
	    JSONArray forecast = new JSONObject(str).getJSONObject("properties").getJSONArray("periods");
	    for (int i=0;i<forecast.length();i++) {
	    	System.out.println(forecast.getJSONObject(i).getString("name"));
	    	System.out.println(forecast.getJSONObject(i).getInt("temperature")+" F");
	    	System.out.println(forecast.getJSONObject(i).getString("detailedForecast"));
	    	System.out.println("\n");
	    }
	}
}