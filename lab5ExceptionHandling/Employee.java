package lab5ExceptionHandling;

import java.util.*;

public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary");
		double n = sc.nextDouble();
		EmployeeException ne = new EmployeeException();
		try {
			ne.validateSalary(n);
		} catch (Salary e) {
			System.out.println(e);
		}
	}

}
