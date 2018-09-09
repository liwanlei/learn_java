package com.jinjie;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class JiekouCallable<V> implements Callable<V> {

	@Override
	public V call() throws Exception {
		String nname=Thread.currentThread().getName();
		for(int i=0;i<3;i++) {
			System.out.println(nname);
		}
		return  (V) (nname+"restun resly");
	}
	private int thredacout=10;
	private int threadpool=3;
	public void thredadp() {
		ExecutorService service=Executors.newFixedThreadPool(threadpool);
		List<>
		
	}
	public static void main(String[] args) {
//		JiekouCallable<String> tt=new JiekouCallable<String>();
//		FutureTask<String> task=new FutureTask<String>(tt);
//		Thread thread=new Thread(task);
//		thread.setName("this one");
//		thread.start();
//		String retunr=null;
//		try {
//			retunr=task.get();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		System.out.println(retunr);
	}
}
