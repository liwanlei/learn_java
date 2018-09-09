package java20;

import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class GET {
	public String name( String url) {
		CloseableHttpClient htpp=null;
		HttpGet httpGet=null;
		try {
			htpp=HttpClients.createDefault();
			RequestConfig requestConfig=RequestConfig.custom().setConnectTimeout(20000).setSocketTimeout(20000).build();
			httpGet=new HttpGet(url);
			httpGet.setConfig(requestConfig);
			CloseableHttpResponse response=htpp.execute(httpGet);//执行请求获取response对象
			HttpEntity httpEntity=response.getEntity();
			return EntityUtils.toString(httpEntity,"utf-8");
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				if(httpGet!=null) {
					httpGet.releaseConnection();
				}
				if(htpp!=null) {
					htpp.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return null;
	}
	public static void main(String[] args) {
		GET eGet=new GET();
		String bei = eGet.name("https://www.baidu.com");
		System.out.println(bei);
	}
}
