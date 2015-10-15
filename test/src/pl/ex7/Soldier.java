package pl.ex7;

public class Soldier implements Killable, Merciless {
	
	private String name;
	private String lastname;
	private int		age;
	private String armyunit;

	public Soldier(String name, String lastname, int age, String armyunit) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.armyunit = armyunit;
	}

	@Override
	public void kill() {
		System.out.println("Soldier is killing");
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

	public String getArmyunit() {
		return armyunit;
	}

	public void setArmyunit(String armyunit) {
		this.armyunit = armyunit;
	}

	@Override
	public String toString() {
		return getName() + " " + getLastname() + " is " + getAge() + " years old and is part of " + getArmyunit();
	}
}
