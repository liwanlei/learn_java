/**
 * lileilei
 * 2018年9月9日
 * Pachong.java
 */
package java20;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author lileilei
 *Pachong.java
*2018年9月9日
 */
public class Pachong {
	public String baseurl="http://www.cnblogs.com/zhangfei/p/";
	public String pager="?page=%s";
	public int getAllPageCount() throws IOException {
		int count=0;
		Document doc =Jsoup.connect(baseurl).get();
		String counTest=doc.select("#myposts>div.pager:nth-of-type(1)>.Pager").text();
		counTest=counTest.replaceFirst("\\D+(\\d+).*", "$1");
		return count=Integer.parseInt(counTest);
	}
	public void crawler() throws IOException {
		int count=this.getAllPageCount();
		for(int i=1;i<=count;i++) {
			String url=baseurl+String.format(pager, i);
			this.testsoup(url);
		}
	}
	private void testsoup(String url) throws IOException {
		Document document=Jsoup.connect(url).get();
		Elements elements=document.select("div.PostList a");
		for(Element e:elements) {
			String text=e.text();
			String herf=e.attr("href");
			System.out.println(text+":"+herf);
		}
	}
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Pachong nPachong=new Pachong();
		nPachong.crawler();
	}

}
