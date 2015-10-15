package pl.ex15.spliterators;

import java.util.Arrays;
import java.util.stream.IntStream;

public class B {

	public static void main(String[] args) {
		int[] i = {20,10,30,20};
		
		IntStream str = Arrays.stream(i);
		
		int sum = str.sum();
		
		System.out.println(sum);
	}

}
