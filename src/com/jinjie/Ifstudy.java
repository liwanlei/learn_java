package com.jinjie;
public class Ifstudy {
	public static String ifpanduan(int n) {
		String reslut=" ";
		if(n>5){
			reslut="beijing";
		}else if (n>0&&n<=5) {
			reslut="shanghai";
		}else if (n<=0) {
			reslut="shenzhen";
		}else {
			reslut="error";
		}
		return reslut;
	}
	 public static void main(String[] args) {
		String reslut=ifpanduan(100);
		System.out.println(reslut);
	}
}
