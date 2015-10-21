package pl.ex3;

import java.util.Arrays;

public class Main {
 
	public static void main(String[] args) {
		int[] arr = {100, 20, 1, 60, 200, 13, 45, 288, -10, 0, -200};
		
		Arrays.sort(arr);
		
		ArrayDisplayer.displayArrayWithIndexes(arr);
		
		int searchVal = -200;
		
		int ret = Arrays.binarySearch(arr, searchVal);
		
		System.out.println("The " + searchVal + " value is located in the position nr : " + (ret+1));
	}

}
