import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
public class URLtest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL OWL = new URL("http://api.overwatchleague.com/live-match");
		System.out.println(OWL.getContent());
	}

}
