/**
 * lileilei
 * 2018年9月9日
 * TestEnum.java
 */
package java20;

/**
 * @author lileilei
 *TestEnum.java
*2018年9月9日
 */
public enum TestEnum {
	SUCCESS(200,"success"),
	FAIL(400,"fail");
	private int retCode;
	private String resMsg;
	private TestEnum (int retCode,String resMsg) {
		this.retCode=retCode;
		this.resMsg=resMsg;
	}
	public int getRetCode() {
		return retCode;
	}
	public String getRetMsg() {
		return resMsg;
	}
	public static void main(String[] args) {
		System.out.println(TestEnum.SUCCESS.getRetCode());
	}
}
