package pl.ex5.vehiclesClasses;

public abstract class Vehicle {
	
	private String name;
	
	public Vehicle(String name) {
		this.setName(name);
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	public abstract double getFuelNeeds();
	
	public abstract double getDistance();
	
	public double calcFuelEfficiency(){
		double c = getFuelNeeds() * getDistance();
		System.out.println(this.getClass().getName() + " calcFuelEfficiency=" + c);
		return c;
	}
	
	public void go(){
		System.out.println(this.getClass().getName() + " is going...");
	}
	
	public void stop(){
		System.out.println(this.getClass().getName() + " is stopping...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
