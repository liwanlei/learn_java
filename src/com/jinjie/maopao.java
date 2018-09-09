/**
 * lileilei
 * 2018年9月8日
 * maopao.java
 */
package com.jinjie;

/**
 * @author lileilei
 *maopao.java
*2018年9月8日
 */
public class maopao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]a = {49,38,53,65,97,12,16};
		for(int i =0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
		}
		for(int i:a) {
			System.out.print(i+",");
		}
	}

}
