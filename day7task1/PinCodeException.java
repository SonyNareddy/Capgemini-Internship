package day7task1;

public class PinCodeException extends Exception{

	public PinCodeException()
	{
		super();
		System.out.println("Exception araised");
	}
	
	public PinCodeException(String string)
	{
		System.out.println("City code"+string+"not found");
	}
	@Override
	public String toString() {
		return "Exception Occured";
	}
	
}
