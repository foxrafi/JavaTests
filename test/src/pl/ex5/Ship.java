package pl.ex5;

public class Ship extends Vehicle implements Sailing  {

	public Ship(String name) {
		super(name);
	}

	@Override
	public void dock() {
		System.out.println("The ship " + getName() + " is docking...");
	}

	@Override
	public double getFuelNeeds() {
		return 100;
	}

	@Override
	public double getDistance() {
		return 1000;
	}
	
	public void stop(){
		dock();
	}

}
