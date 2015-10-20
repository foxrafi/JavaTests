package pl.ex28;

public class A {

	public static void main(String[] args) {
	    //Object o = choose(991, "800");                                 	// (1)
	    //Number n1 = choose(991, 3.14);                                 	// (2)
	    Number n2 = A.<Double>choose((double)991, 3.14);         			// (3)
	    //int k = (int) choose(1.3, 3.14);                               	// (4)
	    int l = (int) (double) choose(1.3, 3.14);                      		// (5)
	}

	public static <T extends Comparable<T>> T choose(T t1, T t2) {
	  return t1.compareTo(t2) >= 0 ? t1 : t2;
	}
}
