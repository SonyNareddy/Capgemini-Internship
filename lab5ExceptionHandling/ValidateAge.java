package lab5ExceptionHandling;

import java.util.*;

public class ValidateAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of the person :");
		int n = sc.nextInt();
		Validate v = new Validate();
		try {
			v.doValidate(n);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
