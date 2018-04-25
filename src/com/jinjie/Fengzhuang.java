/**
 * 
 */
package com.jinjie;
/**
 * @author lileilei
 *Fengzhuang.java
*2018年4月24日
 */
public class Fengzhuang {
	private int heigint;
	public void Human (int h) {
		this.heigint=h;
		System.out.println("hegint:"+heigint);
	}
	public int getheigint() {
		return this.heigint;
	}
	public void nianji() {
		System.out.println("ceshi");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fengzhuang human=new Fengzhuang();
		human.Human(10);
		human.getheigint();
		
	}

}
