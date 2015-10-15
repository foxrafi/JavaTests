package pl.ex7;

import java.util.Arrays;
import java.util.List;

public class A {
	
	public static <T> void print(List<T> t){
		for (T i : t)
			System.out.println(i);
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,-10);
		
		List<String>  names = Arrays.asList("Ford", "Punto", "Ferrari", "Mercedes");
		
		List<Soldier> team = Arrays.asList(
				new Soldier("John","Scott",34,"Navy Seals"),
				new Soldier("Johnny","Bean",24,"Green berets"),
				new Soldier("Ann","Green",18,"Recruit"));

		print(numbers);
		print(names);
		print(team);
	}

}
