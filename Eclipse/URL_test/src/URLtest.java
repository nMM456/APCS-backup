import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class URLtest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    String s = "https://api.overwatchleague.com/live-match";
	    URL url = new URL(s);
	    Scanner scan = new Scanner(url.openStream());
	    String str = new String();
	    while (scan.hasNext())
	        str += scan.nextLine();
	    scan.close();
	    JSONObject data = new JSONObject(str);
	    JSONObject arr = data.getJSONObject("meta");
	    String sr = arr.getJSONObject("strings").getString("owl.live-match.now");
	    System.out.println(sr);
	}

}