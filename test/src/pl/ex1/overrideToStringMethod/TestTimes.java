package pl.ex1.overrideToStringMethod;

public class TestTimes {
	 
	public static void main(String[] args) {
		Times1 t1 = null;
		Times2 t2 = null;
		Times3 t3 = null;
		System.out.println("Result:" + t1.exec(20));
		System.out.println("Result:" + t2.exec(20));
		System.out.println("Result:" + t3.exec(20));
	}
	
}

class Times1 {
	static {
	 	System.out.println("Times1:");
	}
	
    public static int exec(int i) { return i; }
}

class Times2 extends Times1 {
	static {
	 	System.out.println("Times2:");
	}
	 
    public static int exec(int i) { return 2*i; }
}

class Times3 extends Times2 {
    public static int exec(int i) { return 3*i; }
    
    static {
    	System.out.println("Times3:");
    }
}
