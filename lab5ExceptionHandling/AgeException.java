package lab5ExceptionHandling;

public class AgeException extends Exception {
	private String Msg = "";

	public AgeException() {
		super();
	}

	public AgeException(String message) {
		super(message);
		this.Msg = message;
	}

	@Override
	public String toString() {
		return "AgeException :- "+Msg;
	}
}
