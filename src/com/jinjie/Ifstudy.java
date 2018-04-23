package com.jinjie;
//判断如果大于5，输出beijing，如果小于5大于0，输出shanghai，或者输出shenzhen
public class Ifstudy {
	public static String ifpanduan(int n) {
		String reslut=" ";
		if(n>5){
			reslut="beijing";
		}else if (n>0&&n<5) {
			reslut="shanghai";
		}else if (n<0) {
			reslut="shenzhen";
		}else {
			reslut="不存在";
		}
		return reslut;
	}
	 public static void main(String[] args) {
		String reslut=ifpanduan(100);
		System.out.println(reslut);
	}
}
