package lab9streamAPI.str;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class EmployeeRepository {
	public static void main(String[] args) {
		EmployeeRepository obj = new EmployeeRepository();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		Department d = new Department(1, "ABC", 100);
		Department d1 = new Department(2, "XYZ", 200);
		Employee e = new Employee(101, "Sony", "Nareddy", "sony@gmail.com", "8309893545", LocalDate.parse("2021-04-10", format), "Developer", 30000, 100, d);
		Employee e1 = new Employee(102, "Sai", "Nareddy", "sai@gmail.com", "9666807631", LocalDate.parse("2021-01-15", format), "Manager", 50000, 100, d);
		Employee e2 = new Employee(103, "Priya", "Akula", "priya@gmail.com", "8666807631", LocalDate.parse("2021-03-15", format), "Developer", 40000, 100, d);
		Employee e3 = new Employee(102, "Indu", "Karmungi", "Indu@gmail.com", "9886807631", LocalDate.parse("2021-02-15", format), "Manager", 60000, 100, d1);
		List<Employee> empList = new ArrayList<>();
		empList.add(e);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		obj.findSumOfSalary(empList);
		obj.findMonthsAndDays(empList);
		obj.increaseSalary(empList);
	}
public void findSumOfSalary(List<Employee> e) {
		
		EmployeeService es = (List<Employee> empList)->{
			double sum = 0.0;
			for(Employee e1 : empList) {
				sum+=e1.getSalary();
			}
			System.out.println("Sum of all employee salary :"+sum);
		};
		es.findEmployee(e);
		
	}
	public void findMonthsAndDays(List<Employee> e) {
		EmployeeService es = (List<Employee> empList)->{
			System.out.println("Employee Name : Duaration of Service");
			for(Employee e1:empList) {
				Period diff = Period.between(e1.getHireDate(), LocalDate.now());
				System.out.println(e1.getFirstName()+" "+e1.getLastName()+" "+"Months: "+diff.getMonths()+" "+"Days: "+diff.getDays());
			}
		};
		es.findEmployee(e);
	}
	public void increaseSalary(List<Employee> e) {
		EmployeeService es = (List<Employee> empList)->{
			System.out.println("Increase Employee Salary by 15%");
			for(Employee e1:empList) {
				System.out.println(e1.getFirstName()+" "+e1.getLastName()+" "+e1.getSalary()+" "+(((e1.getSalary()*15)/100) + e1.getSalary()));
			}
		};
		es.findEmployee(e);
	}
	
}
