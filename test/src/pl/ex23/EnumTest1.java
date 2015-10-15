package pl.ex23;

import java.util.Arrays;

public class EnumTest1 {

	public static void main(String[] args) {
		JavaLibs i = JavaLibs.valueOf("LOG4J");
		System.out.println(i.name());
		System.out.println(i.ordinal());
		System.out.println(i.hashCode());
		System.out.println(Arrays.toString(i.values()));
	}
	
	//ablaas ingles
	//80 oci oczko

}
