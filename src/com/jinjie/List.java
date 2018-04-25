package com.jinjie;

import java.util.*;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> beijing=new ArrayList<String>();
//		beijing.add("111");
//		beijing.add("shanghai");
//		System.out.println(beijing.size());
//		System.out.println(beijing.get(1));
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("beijing", 1);
		m1.put("shanghai", 5);
		System.out.println(m1.size());
		System.out.println(m1.get("beijing"));
		m1.clear();
		System.out.println(m1);
	}

}
