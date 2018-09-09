package com.jinjie;

import java.util.HashMap;
import java.util.Map;

public class Studymap {

	public static void main(String[] args) {
		Map <String,String> map=new HashMap<String,String>();
		map.put("a", "this is a");
		int len=map.size();
		System.out.println(len);
	}

}
