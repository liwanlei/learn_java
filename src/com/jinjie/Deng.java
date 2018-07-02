/**
 * 
 */
package com.jinjie;
import com.sun.corba.se.impl.io.FVDCodeBaseImpl;

/**
 * @author lileilei
 *Deng.java
*2018年4月24日
 */
public class Deng {
	int dianliang=100;
	public void guanbi() {
		int shengyudianliang = this.dianliang -1;
		System.out.println("剩余电量"+shengyudianliang);
		System.out.println("关闭电灯");
	}
	public void dakai() {
		int shengyudianliang = this.dianliang;
		System.out.println("剩余电量"+shengyudianliang);
		System.out.println("打开电灯");
	}
	private int dianyuan() {
		int heer = this.dianliang;
		return heer;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deng def=new Deng();
		def.dakai();
		def.guanbi();
		int f =def.dianyuan();
		System.out.println(f);
	}

}
