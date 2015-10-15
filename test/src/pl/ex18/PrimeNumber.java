package pl.ex18;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int n = 100;
		
		int c = (int)Math.floor(Math.sqrt(n)) + 1;
		
		int[] primeNrs = new int[n + 1];
		primeNrs[0] = -1;
		primeNrs[2] = -1;
		
		for(int i=1; i<=n; i++){
			primeNrs[i] = i;
		}
		
		for(int i=2; i<=c; i++){
			int d = 2;
			int h;
			while((h=i*d) <= 100){
				primeNrs[h] = -1;
				d++;
			}
			
		}
		
		for(int i=0; i<n+1; i++){
			if(primeNrs[i] != -1)
				System.out.print(i + ",");
		}
		System.out.println();
		 
	}

}
