package pl.ex21;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Checks how different types of variables (class/instance/local) can be initialized
 */
public class ClassInstanceLocalVariableInitializer {
	
	//Class variables - primitives
	static boolean static_boolean; 	//initialized automatically with 'false'
	static int 	   static_int;		//initialized automatically with 0
	static char	   static_char;		//initialized automatically with NULL
	
	//Class variables - arrays
	static boolean static_boolean_tab[] = new boolean[3];  //all 3 array's elements should be 'false'
	static int	   static_int_tab[] = new int[3];		   //all 3 array's elements should be '0'
	static char	   static_char_tab[] = new char[3];		   //all 3 array's elements should be NULL
	
	//Instance variables
	boolean instance_boolean;
	int		instance_int;
	char	instance_char;

	public static void main(String[] args) {
		System.out.println("Class variables:");
		System.out.println("1. boolean := " + static_boolean);
		System.out.println("2. int  := " + static_int);
		System.out.println("3. char := " + (int)static_char);
		System.out.print("4. boolean[3] := ");
		listArrayValues(ArrayUtils.toObject(static_boolean_tab));
		System.out.print("\n5. int[3] := ");
		listArrayValues(ArrayUtils.toObject(static_int_tab));
		System.out.print("\n6. char[3] := ");
		listArrayValues(ArrayUtils.toObject(static_char_tab));
		System.out.println("\n");
		
		System.out.println("Instance variables:");
		ClassInstanceLocalVariableInitializer d = new ClassInstanceLocalVariableInitializer();
		System.out.println("1. boolean := " + d.instance_boolean);
		System.out.println("2. int  := " + d.instance_int);
		System.out.println("3. char := " + (int)d.instance_char);
		System.out.println();
		
		System.out.println("Local Variables [needs to be initialized in the code]:");
		boolean local_boolean = true;
		int     local_int = 10;
		char    local_char = 10;
		System.out.println("1. boolean := " + local_boolean);
		System.out.println("2. int  := " + local_int);
		System.out.println("3. char := " + (int)local_char);
	}

	private static <T> void listArrayValues(T[] array){
		for(int i=0; i<array.length; i++){
			if(array[i] instanceof Character){
				System.out.print((int)(char)array[i]);
				if(i != array.length - 1)
					System.out.print(",");
			} else {
				System.out.print(array[i]);
				if(i != array.length - 1)
					System.out.print(",");
			}
		}
	}
}
