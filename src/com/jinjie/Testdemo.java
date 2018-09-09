package com.jinjie;

public class Testdemo {
	public int d=10;
	private byte[] lock=new byte[0];
	public int getdemo() {
		synchronized (lock) {
			d=d-1;
			return d;
		}
	}
}
