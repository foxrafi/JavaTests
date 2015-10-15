package pl.ex20;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class A {

	public static void main(String[] args) {
		//HashSet<Integer> lhs = new HashSet<>();
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(20);
		lhs.add(45);
		lhs.add(1);
		lhs.add(10);
		for(int v : lhs)
			System.out.print(v + ",");
		
		
	}
}
