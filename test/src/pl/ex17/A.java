package pl.ex17;

public class A {
	
	enum Day {
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
	}
	
	public static void main(String[] args) {
		Day day = Day.Monday;
		
		System.out.println(day);
		System.out.println(day.ordinal());
		System.out.println(Day.Sunday.ordinal());
		
		switch(day){
			case Friday : System.out.println("Switch Monday"); break;
			default : System.out.println("default");
		}
	}

}
