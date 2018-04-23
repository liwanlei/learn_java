public class suanshu {
	 public static void main(String args[]) {
		for (int i=0;i<10;i++){
			for (int j=1;j<i+1;j++){
				System.out.print(String.format("%d*%d=%d",i, j,i*j));
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
