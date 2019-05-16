import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLtest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL OWL = new URL("https://api.overwatchleague.com/live-match");
		String data="";
		BufferedReader read = new BufferedReader(new InputStreamReader(OWL.openStream()));
		while (read.ready()) data = read.readLine();
		System.out.println(data);
	}

}