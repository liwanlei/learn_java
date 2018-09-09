/**
 * lileilei
 * 2018年9月8日
 * kuaisu.java
 */
package com.jinjie;

/**
 * @author lileilei
 *kuaisu.java
*2018年9月8日
 */
public class kuaisu {
	public int getSortinde(int[]a,int left,int right) {
		int temp=a[left];
		while (left<right) {
			while (left<right && a[right]<a[left]) {
			right--;	
			}
			a[left]=a[right];
			while (left<right&&a[left]<a[right]) {
				left++;
			}
			a[right]=a[left];
		}
		a[left]=temp;
		return left;
	}
	public void quit(int[]a,int left,int right) {
		if(left<right) {
			int index=this.getSortinde(a, left, right);
			this.quit(a,left,index-1);
			this.quit(a, index+1, right);
		}
	}
	public void sort(int[]a) {
		if(a!=null&&a.length>0) {
			this.quit(a, 0,a.length-1);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a= {49,38,65,55};
		kuaisu kuais=new kuaisu();
		kuais.sort(a);
	}

}
