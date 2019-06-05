import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class Forecast {
<<<<<<< HEAD
	public static void main(String[] args) {
		
=======
	public static void main(String[] args) throws IOException {
	    ArrayList<String> alerts = forecast();
	    for (String i: alerts) {
	    	System.out.println(i);
	    }
	}
	/**
	 * Gets every alert on the weather API then returns an arraylist
	 * with string with the description of each alert
	 * Runs very slowly.
	 * @return ArrayList<String> description of alerts
	 * @throws IOException
	 */
	public static ArrayList<String> forecast() throws IOException {
		ArrayList<String> alerts = new ArrayList<String>();
	    String s = "https://api.weather.gov/alerts/active";
	    URL url = new URL(s);
	    Scanner scan = new Scanner(url.openStream());
	    String str = new String();
	    while (scan.hasNext())
	        str += scan.nextLine();
	    scan.close();
	    JSONArray JSONAlert = new JSONObject(str).getJSONArray("features");
	    for (int i=0;i<JSONAlert.length();i++) {
	    	alerts.add(JSONAlert.getJSONObject(i).getJSONObject("properties").getString("description"));
	    }
	    return alerts;
>>>>>>> branch 'master' of https://github.com/nMM456/APCS-backup.git
	}
}