package pl.ex1.overrideToStringMethod;

public class Main {

	public static void main(String[] args){
		Person candidate1 = new Person("John", "Scott", 120);
		Person candidate2 = new Person("Ann", "Scott", 120);
		
		System.out.println(candidate1);
		System.out.println(candidate2);
	}

}
