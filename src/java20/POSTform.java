package java20;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class POSTform {
    public String  post(String url,Map<String, String>params) throws ClientProtocolException, IOException {
    	CloseableHttpClient httpClient=null;
    	HttpPost httpPost=null;
    	httpClient=HttpClients.createDefault();
    	RequestConfig requestConfig=RequestConfig.custom().setConnectTimeout(20000).setSocketTimeout(20000).build();
    	httpPost=new HttpPost(url);
    	httpPost.setConfig(requestConfig);
    	List<NameValuePair> ps = new ArrayList<NameValuePair>();
    	for (String pKey : params.keySet()) {
    	ps.add(new BasicNameValuePair(pKey, params.get(pKey)));
    	}
    	httpPost.setEntity(new UrlEncodedFormEntity(ps));
    	CloseableHttpResponse response =httpClient.execute(httpPost);
    	HttpEntity httpEntity=response.getEntity();
		return EntityUtils.toString(httpEntity,"utf-8");
		
	}
}
