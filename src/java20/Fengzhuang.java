/**
 * lileilei
 * 2018年9月9日
 * Fengzhuang.java
 */
package java20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * @author lileilei
 *Fengzhuang.java
*2018年9月9日
 */
public class Fengzhuang {
	private static Properties p=null;
	private static String path="";
	private static void loadProperties() {
		if(p!=null) {
			p=new Properties();
			File file=new File(path);
			InputStream inputStream =null;
			try {
				inputStream=new FileInputStream(file);
				try {
					p.load(inputStream);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(inputStream!=null) {
					try {
						inputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	public static String getParoerties(String key) {
		Fengzhuang.loadProperties();
		return p.getProperty(key);
	}
	public static String getPropertis(String key,String defaultValue) {
		Fengzhuang.loadProperties();
		return p.getProperty(key,defaultValue);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
