package pl.rs;

public class TestTimes {
	 public static void main(String[] args) {
		 Times3 t3 = null;
		 t3.exec(20);
	 }
}

class Times1 {
	static {
	 	System.out.println("Times1");
	}
	
    public static int exec(int i) { return i; }
}

class Times2 extends Times1 {
	static {
	 	System.out.println("Times2");
	}
	 
    public static int exec(int i) { return 2*i; }
}

class Times3 extends Times2 {
    public static int exec(int i) { return 3*i; }
    
    static {
    	System.out.println("Times3");
    }
}
