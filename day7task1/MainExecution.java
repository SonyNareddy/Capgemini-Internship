package day7task1;

public class MainExecution {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		
		try {	
			
			String codes[] = service.getEmployeeCodes();
			String city[] = service.getEmployeeCity();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
