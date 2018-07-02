/**
 * 
 */
package com.jinjie;

import java.util.Scanner;

/**
 * @author lileilei
 *Caishuzi.java
*2018年7月2日
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
				System.out.println("游戏只有十次机会！欢迎下次再来！");
				break;
			}else {
			System.out.println("请输入你要猜测的字母：");
			Scanner scapn = new Scanner(System.in);
			 String str = scapn.next().toUpperCase(); 
			 if (str.equals("EXIT")) { // 判断字符串内容相等
	             System.out.println("下次再来吧!");
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
