package com.jinjie;

public class xiancheng extends Thread {
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	} 
	public static void main(String[] args) {
		xiancheng t1=new xiancheng();
		xiancheng t2=new xiancheng();
		t1.setName("xiancheng1");
		t1.start();
		t2.setName("xiancheng2");
		t2.start();
	}
}
