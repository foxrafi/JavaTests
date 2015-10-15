package pl.ex16;

import java.util.ArrayList;
import java.util.Arrays;

public class A {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<>();
		s.add("Rafi");
		s.add("Mati");
		s.add("Michas");
		s.add("Natalka");
		
		System.out.println(s);
		
		s.remove(0);
		
		System.out.println(s);
		
		s.add(1, "Gosia");
		
		System.out.println(s);
		
		s.add("Darek");
		
		System.out.println(s);
		
		String[] v = new String[s.size()];
		v = s.toArray(v);
		
		System.out.println(Arrays.toString(v));
		
		if(s.contains("Natalka")) System.out.println("I'm missing you"); 
		if(!s.isEmpty()) System.out.println("There are people at home");
		
		
		ArrayList<String> i = new ArrayList<>();
		i.add("Gosia");
		i.add("Mati");
		i.add("Rafal");
		
		if(s.containsAll(i)) System.out.println("Gosia and Mati are there");
		else System.out.println("Sorry you are so weak, you are not worth of anything");
		
		ArrayList<String> s2 = (ArrayList<String>) s.clone();
		System.out.println(s2);
	}

}
