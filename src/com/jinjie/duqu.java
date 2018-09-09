package com.jinjie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class duqu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch;
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		while ((ch = (char) in.read()) != -1) {
			System.out.println(ch);
		}
	}

}
