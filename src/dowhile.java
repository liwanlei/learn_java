
public class dowhile {
	public static void main(String args[]) {
		int [] naser=new int[5];
		naser[0]=34;
		naser[1]=36;
		naser[2]=37;
		naser[3]=22;
		naser[4]=26;
		System.out.println(naser[0]);
	    int[] newnase=new int[5];
		for (int index=0;index<naser.length;index++){
			for (int inde=0;inde<naser.length;inde++){
				if(naser[index]<naser[inde]){
					newnase[0]=naser[inde];
				}else {
					newnase[0]=naser[index];
				}
			}
		}System.out.println(newnase[0]);
		
	}
}
