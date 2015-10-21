package pl.ex5.vehiclesClasses;

public class Main {

	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[]{
				new Ship("USS Farragut (DDG-99)"),
				new Ship("USS Virginia (SSN-774)"),
				new Car("Punto II"),	
				new Car("Ford"),
				new Truck("DaimlerTruck"),
				new Truck("ToyotaTruck"),
				new RaceCar("RaceCar1"),
				new RaceCar("RaceCar2"),
				new Plane("RussianJet"),
				new Plane("AmericanJet")		
		};
		
		for(Vehicle v : vehicles){
			System.out.println("-----------------------------------");
			v.go();
			v.stop();
			v.calcFuelEfficiency();
			if(v instanceof Flying)
				((Flying) v).callAirControl();
			System.out.println("-----------------------------------");
		}
		

	}

}
