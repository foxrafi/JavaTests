package pl.ex15.spliterators;

import java.util.ArrayList;
import java.util.Spliterator;

public class A {

	public static void main(String[] args) {
		ArrayList<Double> v = new ArrayList<>();
		
		v.add(1.0);
		v.add(2.0);
		v.add(3.0);
		v.add(4.0);
		v.add(5.0);
		
		Spliterator<Double> spltitr = v.spliterator();
		while(spltitr.tryAdvance((n)->System.out.println(n)));
		
		spltitr = v.spliterator();
		ArrayList<Double> sqrs = new ArrayList<>();
		while(spltitr.tryAdvance((n)->sqrs.add(Math.sqrt(n))));
		
		spltitr = sqrs.spliterator();
		spltitr.forEachRemaining((n)->System.out.println(n));
		
	}

}
