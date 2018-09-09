import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
public class GET {
public String get(String url) {
	HttpURLConnection httpclient=null;
	BufferedReader bufferedReader=null;
	StringBuilder sBuilder=new StringBuilder();
	String line=null;
	String reponse=null;
	try {
		httpclient=(HttpURLConnection) new URL(url).openConnection();
		httpclient.setRequestMethod("GET");
		httpclient.setDoOutput(true);
		httpclient.setReadTimeout(20000);
		httpclient.setConnectTimeout(20000);
		httpclient.setUseCaches(false);
		httpclient.connect();
		bufferedReader=new BufferedReader(new InputStreamReader(httpclient.getInputStream(), "utf-8"));
		while ((line =bufferedReader.readLine())!=null) {
			sBuilder.append(line);
		}
	reponse=sBuilder.toString();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(bufferedReader!=null) {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	return reponse;
}
}
