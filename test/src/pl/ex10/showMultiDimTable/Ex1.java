package pl.ex10.showMultiDimTable;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		char[][] t = new char[][] {
			{'G','N'},
			{'M','M'},
			{'R'}
		};
		
		System.out.println(Arrays.toString(t));
		System.out.println(Arrays.deepToString(t));
	}

}
