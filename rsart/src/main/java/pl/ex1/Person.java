package pl.ex1;

public class Person {

	private String name;
	
	private String lastname;
	
	private int age;

	public Person(String name, String lastname, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return getName() + " " + getLastname() + " " + getAge();
	}
	
	public static void main(String[] args){
		Person candidate = new Person("John", "Scott", 120);
		System.out.println(candidate);
	}
	
}
