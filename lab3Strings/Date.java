package lab3Strings;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Date {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter year: ");
		  int year=sc.nextInt();
		  System.out.println("Enter month: ");
		  int month=sc.nextInt();
		  System.out.println("Enter day:");
		  int day=sc.nextInt();
		       LocalDate previousDate = LocalDate.of(year, month, day);
		       LocalDate now = LocalDate.now();
		 
		       Period diff = Period.between(previousDate, now);
		       System.out.printf("Difference is %d years, %d months and %d days\n\n", diff.getYears(), diff.getMonths(), diff.getDays());
		  }
}
