package lab5ExceptionHandling;

public class EmployeeException    {
	public void validateSalary(double salary) throws Salary{
		if(salary > 3000) {
			System.out.println("Valid salary");
		}else {
			throw new Salary("Salary Exception Occured");
		}
	}
}
