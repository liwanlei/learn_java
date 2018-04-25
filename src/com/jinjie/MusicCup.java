package com.jinjie;

public class MusicCup implements Cup {

	@Override
	public void addWater(int w) {
		// TODO Auto-generated method stub
		this.water=this.water+w;
	}

	@Override
	public void drinkWater(int w) {
		// TODO Auto-generated method stub
		 this.water = this.water - w;
	}
	private int water=0;
	public static void main(String[] args) {
		MusicCup ws=new MusicCup();
		ws.drinkWater(10);
	}
}
