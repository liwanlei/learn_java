/**
 * 
 */
package com.jinjie;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author lileilei
 *Test.java
*2018年4月24日
 */
public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String conetn="welcome beijing";
			File file=new File("beijing.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fWriter=new FileWriter(file.getAbsoluteFile());
			BufferedWriter bWriter =new BufferedWriter(fWriter);
			bWriter.write(conetn);
			bWriter.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("IO prome");
		}
	}

}
