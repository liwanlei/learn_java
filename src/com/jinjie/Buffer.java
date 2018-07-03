/**
 * 
 */
package com.jinjie;

/**
 * @author lileilei
 *Buffer.java
*2018年7月3日
 */
public class Buffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer stringBuffer=new StringBuffer("北京ctv");
		stringBuffer.append("www.beijing.com");
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.reverse());
		System.out.println(stringBuffer.delete(1,2));
		System.out.println(stringBuffer.insert(5,"abc"));
	}

}
