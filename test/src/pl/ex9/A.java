package pl.ex9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		
		Set<String> familySet = new HashSet();
		familySet.add("Gosia");
		familySet.add("Mati");
		familySet.add("Natalka");
		familySet.add("Michaœ");
		familySet.add("Rafal");
		
		List<String> familyList = new ArrayList(familySet);
		Collections.sort(familyList);
		
		familyList.forEach(System.out::println);

	}

}
