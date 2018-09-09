/**
 * lileilei
 * 2018年9月9日
 * TestData.java
 */
package java20;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.org.apache.xml.internal.utils.ObjectPool;

/**
 * @author lileilei
 *TestData.java
*2018年9月9日
 */
public class TestData {
	@DataProvider(name="dataprovider")
	public Object[][] dataproe(){
		return new Object[][] {{1,2},{3,4}};
	}
	@Test(dataProvider="dataprovider")
	public void testdemoe(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
