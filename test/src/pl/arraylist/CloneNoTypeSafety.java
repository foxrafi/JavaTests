package pl.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CloneNoTypeSafety {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Mosina");
		cities.add("Poznan");
		cities.add("Chrzanow");
		cities.add("Krakow");
		
		ArrayList<String> cities2 = (ArrayList<String>)cities.clone();		
		cities2.add("Warsaw");
		
		System.out.println(cities.size());
		System.out.println(cities2.size());
		
		
		//Below main part
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.addAll(Arrays.asList(4,5,6,7,8,9));
		
		ArrayList<String> cities3 = (ArrayList<String>)nums.clone();
		System.out.println(cities3.size());
		System.out.println(cities3.toString());
	}

}
