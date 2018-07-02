/**
 * 
 */
package com.jinjie;
import java.util.Scanner;
/**
 * @author lileilei
 *Caishuzi.java
*
 */
public class Caishuzi {

	/**
	 * @param args
	 * @param m 
	 */
	public static void main(String[] args) {
		int count=0;
		while (true) {
			if (count>=10) {
				System.out.println("次数已经用完");
				break;
			}else {
			System.out.println("请你输入你的竞猜的数字");
			Scanner scapn = new Scanner(System.in);
			 String str = scapn.next().toUpperCase(); 
			 if (str.equals("EXIT")) { 
	             System.out.println("退出");
	             count=0;
	             break;
	         }else  if (str.equals("A")) {
				System.out.println("duil ");
				count=0;
				break;
			}else {
				count +=1;
				System.out.println("还有"+(10-count)+"次机会");
				continue;
			}
		}
		}
		
	}
}
