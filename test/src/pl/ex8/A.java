package pl.ex8;

import java.util.Arrays;

public class A {
	
	public static void main(String[] args) {
		
		char[] a = {'a','b','d','e','c'};
		
		char[] b = Arrays.copyOf(a, 8);
		
		char[] c = Arrays.copyOfRange(a, 1, 3);
		
		char[] d = new char[11];
		
		Arrays.fill(d,'o');
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
	}
	
}
