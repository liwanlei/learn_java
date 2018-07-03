/**
 * 
 */
package com.jinjie;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import sun.util.calendar.Gregorian;
/**
 * @author lileilei
 *Datestuduy.java
*2018年7月3日
 */
public class Datestuduy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Date date =new Date();
//		System.out.println(date.toString());
//		System.out.println(date.getTime());
//		System.out.println(date.getDate());
//		 Date dNow = new Date( );
//	      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss ");
//	      System.out.println(ft.format(dNow));
//		try {
//			Thread.sleep(1000*3);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		long start=System.currentTimeMillis();
//		try {
//			Thread.sleep(5*60*10);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        System.out.println(new Date( ) + "\n");
//        long end = System.currentTimeMillis( );
//        System.out.println(end-start);
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));
        int year=0;
        year=c.get(Calendar.YEAR);
        GregorianCalendar gregorianCalendar=new GregorianCalendar();
        System.out.println(gregorianCalendar.isLeapYear(year));
	}

}
