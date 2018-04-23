import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hebing {
	public static void main(String[] args) {
		String a[]={"y","z","i"};
		String b[]={"h","i","l"};
		List list=new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] cObjects=list.toArray();
		System.out.println(Arrays.toString(cObjects));	
	}
}
