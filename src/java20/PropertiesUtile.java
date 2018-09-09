/**
 * lileilei
 * 2018年9月9日
 * PropertiesUtile.java
 */
package java20;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author lileilei
 *PropertiesUtile.java
*2018年9月9日
 */
public class PropertiesUtile {
	public void getProperties() throws IOException {
		File file =new File("config.properties");
		Properties properties =new Properties();
		InputStream inputStream =null;
		inputStream=new FileInputStream(file);
		properties.load(inputStream);
		System.out.println(properties.getProperty("downloda.dir"));
	}
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertiesUtile propertiesUtile=new PropertiesUtile();
		propertiesUtile.getProperties();
	}

}
