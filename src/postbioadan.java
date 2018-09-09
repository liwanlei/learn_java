import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;

import com.sun.javafx.collections.MappingChange.Map;

public class postbioadan {
	public String post(String url,Map<String,String>form) {
		HttpURLConnection conn = null;
		PrintWriter pw = null ;
		BufferedReader rd = null ;
		StringBuilder out = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		String line = null ;
		String response = null;
		for(String key:form.keySet()) {
			if(out.length()!=0) {
				out.append("&");
			}
			out.append(key).append("=").append(form.get(key));
		}
		return null;
		
	}
}
