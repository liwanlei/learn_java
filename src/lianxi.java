public class lianxi {
public static void main(String args[]) {
	for (int i=100;i<201;i++){
		boolean b=false;
		for (int j=2;j<i-1;j++){
			int k =i%j;
			if (k==0){
				b=true;
			}
		}if (!b){
			System.out.println(i);
		}
	}
}
}
//Ñ°ÕÒËØÊý100-200
