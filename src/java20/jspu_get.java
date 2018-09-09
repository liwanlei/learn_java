package java20;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class jspu_get {
	public void testjop() {
		try {
			Document document=Jsoup.connect("http://www.cnblogs.com/zhangfei/p/4283930.html").get();
			System.out.println(document);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		jspu_get jspu=new jspu_get();
		jspu.testjop();

	}

}
