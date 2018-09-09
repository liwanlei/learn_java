/**
 * lileilei
 * 2018年9月8日
 * xieru.java
 */
package com.jinjie;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

import sun.print.resources.serviceui;

/**
 * @author lileilei
 *xieru.java
*2018年9月8日
 */
public class xieru {
	public void writebyte(String Filnema) {
		try {
			File file=new File(Filnema);
			OutputStream outputStream=new FileOutputStream(Filnema);
			String mString="3333";
			byte[] by=mString.getBytes();
			outputStream.write(by,0,by.length);
			outputStream.flush();
			outputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void wirtebuff(String filename) throws IOException {
		File file=new File(filename);
		BufferedWriter output=new BufferedWriter(new FileWriter(file));
		output.write("hellowword");
		output.close();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
