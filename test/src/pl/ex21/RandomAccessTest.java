package pl.ex21;

import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Vector;

public class RandomAccessTest {

	public static void main(String[] args) {
		if(new ArrayList<Integer>() instanceof RandomAccess)
			System.out.println("true");
		else
			System.out.println("false");
		
		if(new Vector<Integer>() instanceof RandomAccess){
			System.out.println("true");
		}
	}

}
