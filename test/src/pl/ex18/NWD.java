package pl.ex18;

public class NWD {
	
	public static int calcNWD1(int n1, int n2){
		
		while(n1 != n2) {
			if(n1 > n2)
				n1 -= n2;
			else 
				n2 -= n1;
		}
		
		return n1;
	}

	public static int calcNWD2(int n1, int n2){
		
		while(n2 != 0) {
			int r = n1 % n2;
			n1 = n2;
			n2 = r;
		}
		
		return n1;
	}
	
	public static void main(String[] args) {
		int n1 = 3493;
		int n2 = 392;
		System.out.printf("NWD(%d,%d)=%d\n",n1,n2,calcNWD1(n1,n2));
		System.out.printf("NWD(%d,%d)=%d\n",n1,n2,calcNWD2(n1,n2));
	}
	
}
