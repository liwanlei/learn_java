/**
 * 
 */
package examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @author lileilei
 *Readtext.java
*2018年7月5日
 */
public class Readtext {
	public static String read() {
		String string = null;
		try {
			// 在给定从中读取数据的文件名的情况下创建一个新 FileReader
			FileReader fr = new FileReader(System.getProperty("user.dir")+File.separator+"user.txt");
			// 创建一个使用默认大小输入缓冲区的缓冲字符输入流
			BufferedReader br = new BufferedReader(fr);
			while (null != (string = br.readLine())) {
				return string;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return string;
	}
	public static void wirte( String usernmae) throws IOException {
		File writename = new File(System.getProperty("user.dir")+File.separator+"user.txt");
		writename.createNewFile(); 
		BufferedWriter out = new BufferedWriter(new FileWriter(writename));
		out.write(usernmae);
		out.flush(); 
		out.close(); 
	}
}
