package pl.ex25.constructorSequence;

public class Father extends GrandFather {
	
	static {
		System.out.println("Father doesn't exist");
	}
	
	{
		System.out.println("Father is getting up ...");
	}
	
	public Father() {
		System.out.println("[Father]");
	}
}
