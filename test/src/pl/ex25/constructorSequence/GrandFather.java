package pl.ex25.constructorSequence;

public class GrandFather {
	
	static {
		System.out.println("Grandfather doesn't exist");
	}
	
	{
		System.out.println("Grandfather is getting up...");
	}
	
	public GrandFather() {
		System.out.println("[GrandFather]");
	}
	
}
