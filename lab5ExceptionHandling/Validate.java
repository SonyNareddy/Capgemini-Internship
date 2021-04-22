package lab5ExceptionHandling;

public class Validate {
	public void doValidate(int age)throws AgeException
	{
		if(age>15)
		{
			System.out.println("Allowed");
		}
		else
		{
			throw new AgeException("Age should be greater than 15 and your age is "+age);
		}
		
	}
}
