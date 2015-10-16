package pl.ex25.constructorSequence;

public class Son extends Father {
	
	static {
		System.out.println("Son doesn't exist");
	}

	{
		System.out.println("Son is getting up ...");
	}
	
	public Son() {
		System.out.println("[Son]");
	}
	
}
