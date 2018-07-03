/**
 * 
 */
package com.jinjie;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author lileilei
 *Emm.java
*2018年7月3日
 */
public class Emm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Enumeration<String> days;
		Vector<String> dayName=new Vector<String>();
		dayName.add("sundaty");
		days=dayName.elements();
		while (days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}

	}

}
