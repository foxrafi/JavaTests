package pl.ex12.parallelPrefix;

import java.util.function.IntBinaryOperator;

public class A {

	public static void main(String[] args) {
		IntBinaryOperator ibo = (x,y) -> x + y;
		IntBinaryOperator fun1 = (x,y) -> x*x + 2*x + 1;
		
		int res = ibo.applyAsInt(10, 7);
		System.out.println(res);
		
		int fun1v = fun1.applyAsInt(3, 0);
		System.out.println(fun1v);
	}

}
