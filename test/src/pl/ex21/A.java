package pl.ex21;

public class A {
	
	public static float parseFloat( String s ){
		   float f = 0.0f;
		   try{
		      f = Float.valueOf( s ).floatValue();
		      return f ;
		   }
		   catch(NumberFormatException nfe){
		      f = Float.NaN ;
		      return f;
		   }
		   finally{
		      f = 10.0f;
		      return f;
		   }
		}

	public static void main(String[] args) {	
		Float f = parseFloat("0.0");
		System.out.println(f);
		
		boolean b = true;
		
		if(b) System.out.println("true");
		else System.out.println("false");
	}

}
