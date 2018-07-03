/**
 * 
 */
package com.jinjie;

import static org.hamcrest.CoreMatchers.containsString;

import java.io.File;

/**
 * @author lileilei
 *panduan.java
*2018年7月3日
 */
public class panduan {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String dirnam="C:\\Users\\Administrator\\Desktop\\learn_java";
		File file=new File(dirnam);
		if(file.isDirectory()) {
			String[] s=file.list();
			for (int i=0;i<s.length;i++) {
				File file2=new File(s[i]);
				if(file2.isDirectory()) {
					System.out.println("文件夹");
					System.out.println(file2.getAbsolutePath());
					
				}
				else {
					System.out.println("文件");
					System.out.println(file2.getAbsolutePath());
				}
				
			}
		}else {
			System.out.println("这是一个文件。");
			System.out.println("文件个数是：1");
		}
	}

}
