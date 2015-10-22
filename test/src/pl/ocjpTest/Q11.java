package pl.ocjpTest;

public class Q11 {

	public static void main(String[] args) {
		bogo(new Extension());
	}

	static void bogo(Base b) {
		b.add(8);
		b.print();
	}
}

class Base {
	int i;
	
	Base() { 
		add(1); 
	}
	
	void add(int v) { 
		i += v; 
	}
	
	void print() { 
		System.out.println(i); 
	}
}

class Extension extends Base {
	
	Extension() { 
		add(2); 
	}
	
	void add(int v) { 
		i += v*2; 
	}
}
