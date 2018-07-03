/**
 * 
 */
package com.jinjie;

/**
 * @author lileilei
 *Shixian.java
*2018年7月3日
 */
public class Shixian implements Admain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shixian xShixian=new Shixian();
		xShixian.eat();
		xShixian.travel();

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("travel");
		
	}

}
