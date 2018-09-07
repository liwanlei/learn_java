package com.jinjie;

public class Dipxoamhcjemh  extends Thread{
	private static int threadID = 0;
	public Dipxoamhcjemh() {
        super("ID:" + (++threadID));
    }
	public String toString() {
        return super.getName();
    }
    /**
     * what does the thread do?
     */
    public void run() {
        System.out.println(this);
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Dipxoamhcjemh dipxoamhcjemh=new Dipxoamhcjemh();
		Dipxoamhcjemh dipxoamhcjemh2=new Dipxoamhcjemh();
	
		dipxoamhcjemh.start();
		dipxoamhcjemh2.start();
		
	}

}
