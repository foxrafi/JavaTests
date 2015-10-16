package pl.ex27;

public class Qb4ab {

	public void bar() throws MyException {
		throw new MyException();
	}
	
	public void baz() {
		throw new RuntimeException(); 
	}
	
	public void foo() throws MyException {
		try {
			bar();
		} catch (MyException my){
			throw new MyException(my);
		} finally {
			System.out.println("finally");
		}
	}
	
	public static void main(String[] args) throws MyException {
		Qb4ab a = new Qb4ab();
		a.foo();
	}
}

class MyException extends Exception {
	
	public MyException() {
	}
	
	public MyException(MyException e){
		super(e);
	}
}