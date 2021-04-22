package lab5ExceptionHandling;

public class Salary extends Exception{
	public Salary() {
		super();
	}

	public Salary(String string) {
		super();
		System.out.println(string);
	}
}
