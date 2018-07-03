/**
 * 
 */
package com.jinjie;

import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * @author lileilei
 *ListStudy.java
*2018年7月3日
 */
public class ListStudy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size=10;
		double[] mylist=new double[size];
		mylist[0]=5.6;
		double a=0;
		for (double element:mylist) {
			a+=mylist[(int) element];
		}
		System.out.println(a);
	}

}
