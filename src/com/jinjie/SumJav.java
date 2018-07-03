/**
 * 
 */
package com.jinjie;

import java.util.concurrent.Callable;

/**
 * @author lileilei
 *SumJav.java
*2018年7月3日
 */
public class SumJav implements Callable<Integer>{
	int x=3;
	int y=6;
	public SumJav(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return this.x+this.y;
	}

	
}
