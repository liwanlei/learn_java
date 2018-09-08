/**
 * 
 */
package studay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lileilei
 *monkey.java
*2018年9月8日
 */
public class Monkey {
	//启动时间
		public static List<String> systemcmd(String cmd ,String baek) {
			try {
				Process p = Runtime.getRuntime().exec(cmd);//执行命令
				InputStream is = p.getInputStream();//获取输出
				BufferedReader reader = new BufferedReader(new InputStreamReader(is));
				//读
				//结果放到list里面
				List<String> reslut=new ArrayList<>();
				try {
					p.waitFor();
					String s = null;
					//当能读取的时候，一直读取结果，
					while ((s = reader.readLine()) != null) {
						if (s.startsWith("This")){
							reslut.add(s.toString().split(":")[1]);
						}
					}
					Process p2 = Runtime.getRuntime().exec(baek);//关闭当前运行的包
					return reslut;
				} catch (InterruptedException e) {
					return null;
				}
			} catch (IOException e) {
				return null;
			}
			
		}
		//猴子命令
		public List<String> excectmonkey(String packname,String zhongzhi,int times,String touch, String guiji, String system, String activty, String pathname, String shijian, String huodong, String doahang) {
			String cmd_monkey="adb shell monkey -p "+packname+" -s "+zhongzhi+
					" --throttle "+times+" --pct-touch "+touch+" --pct-nav "+doahang+" --pct-motion "+huodong+"  "
					+ " --pct-trackball  "+guiji+" --pct-syskeys  "+system+"  --pct-appswitch  "+activty+" --ignore-crashes --ignore-timeouts --monitor-native-crashes -v -v -v "+shijian+" >"+pathname+"";
			try {
				System.out.println(cmd_monkey);
				String testcs="adb shell mount -o remount / /";
				Runtime.getRuntime().exec(testcs);
				Process p = Runtime.getRuntime().exec(cmd_monkey);//执行命令
				InputStream is = p.getInputStream();//获取输出
				BufferedReader reader = new BufferedReader(new InputStreamReader(is));
				//读
				//结果放到list里面
				List<String> reslut=new ArrayList<>();
				try {
					p.waitFor();
					String s = null;
					//当能读取的时候，一直读取结果，
					while ((s = reader.readLine()) != null) {
						reslut.add(s);
					}
					String ming="adb shell am force-stop "+packname;
					Process p2 = Runtime.getRuntime().exec(ming);
					return reslut;
				} catch (InterruptedException e) {
					return null;
				}
			} catch (IOException e) {
				return null;
			}	
		}	
}
