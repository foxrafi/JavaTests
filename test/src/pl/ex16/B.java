package pl.ex16;

import java.util.ArrayList;
import java.util.Random;

public class B {
	
	private static final int NR = 1_0;

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>(NR);
		
		System.out.println(l.size());
		
		for(int i=0; i<NR - 5; i++){
			l.add(new Random().nextInt(100));
		}
		
		l.trimToSize();
		
		System.out.println(l.size());
		
	}

}
