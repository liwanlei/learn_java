/**
 * 
 */
package com.jinjie;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import sun.security.provider.Sun;

/**
 * @author lileilei
 *Duoxianc.java
*2018年7月3日
 */
public class Duoxianc {

	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService thread=Executors.newFixedThreadPool(2);
		SumJav cJav =new SumJav(100,200);
		SumJav dJav=new SumJav(10, 200);
		Future<Integer> result=thread.submit(cJav);
		Integer sum;
		try {
			sum = result.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result=thread.submit(dJav);
		sum=result.get();
		System.out.println(sum);
		thread.shutdown();
	}

}
