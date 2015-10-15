package pl.rs;

public class TestClass2 {

	public static void main(String[] args) {
		int tab[] = {1,2,3,4};
		
		int sum = 0;
		
		for(Integer i : tab){
			sum += i;
		}
		
		System.out.println(sum);
		System.out.println("amazing");
	}

}
