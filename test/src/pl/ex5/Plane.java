package pl.ex5;

public class Plane extends Vehicle implements Flying {

	public Plane(String name) {
		super(name);
	}

	@Override
	public void takeOff() {
		System.out.println("Your plane is taking off..");
	}

	@Override
	public void land() {
		System.out.println("Your plane is landing...");
	}

	@Override
	public void callAirControl() {
		System.out.println("Houston we have a problem. Mayday mayday mayday");
	}

	@Override
	public double getFuelNeeds() {
		return 45;
	}

	@Override
	public double getDistance() {
		return 100;
	}

	public void go(){
		super.go();
		takeOff();
	}

	public void stop(){
		super.stop();
		land();
	}
}
