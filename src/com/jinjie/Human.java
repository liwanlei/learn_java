/**
 * 
 */
package com.jinjie;
/**
 * @author lileilei
 *Human.java
*2018年4月24日
 */
public class Human {
	 Human(int h)
	    {
	        this.height = h;
	        System.out.println("I'm born");
	    }
	    Human(int h, String s,int age)
	    {
	        this.height = h;
	        System.out.println("Ne Zha: I'm born, " + s);
	        System.out.println("age is " + age);
	    }
	    int getHeight()
	    {
	        return this.height;
	    }

	    int height;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human neZha   = new Human(150,"beijing",20);
        System.out.println(neZha.getHeight());
	}

}
