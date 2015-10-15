package pl.ex21;

public class B {
	
	//----------------------------------------------------------------
    public static void method1(int key)  {
    	System.out.println("In method1...");
        for(int i=0; i<10; i++){
            if(i == key)
				try {
					throw new Exception("Index of 'key' is " + i);
				} catch (Exception e) {
					e.printStackTrace();
				} 
        }
    }
    
    //---------------------------------------------------------------
    public static void method2(boolean condition)  { 
    	System.out.println("In method2...");
        if(condition == true) 
            method1(15); 
        else 
        	return;
    }
    
    //---------------------------------------------------------------
    public static void main(String[] args)  { 
    	boolean c = args.length>0;
        method2(c); 
    } 
}
