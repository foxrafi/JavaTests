package pl.ex13.parallelSetAll;

import java.util.Arrays;

public class A {

	public static void main(String[] args) {
		int[] array = {1,3,5,9};
		
		System.out.println("Before : " + Arrays.toString(array));
		
		Arrays.parallelSetAll(array, i -> new Integer(i + 4));
		
		System.out.println("After : " + Arrays.toString(array));
	}

}
