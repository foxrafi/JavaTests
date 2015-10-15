package pl.rs;

import java.util.ArrayList;
import java.util.List;

public class App 
{
	static final int f = 1;
	
	public static void main( String[] args )
    {
		List<? super String> l = new ArrayList<String>();
		
		l.add(null);
		l.add("ok");
		
		
    }
}
