package com.fengzhuang;
//单例模式
public class SingleObject {
	private static SingleObject instance=new SingleObject();
	private SingleObject() {}
	public static SingleObject getInstance() {
		return instance;
	}
	public void showMessage() {
		System.out.println("hello world");
	}
	public static void main(String[] args) {
		SingleObject object=SingleObject.getInstance();
		object.showMessage();
	}

}
