package com.jinjie;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Fileread {
	public static void main(String[] args) {
		byte bwrirte[]= {11,21,35};
		try {
			OutputStream oStream =new FileOutputStream("b.txt");
			for(int x=0;x<bwrirte.length;x++) {
				try {
					oStream.write(bwrirte[x]);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}try {
				oStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
