package day7task1;

public class EmployeeService {
	private String employees[] =
		{"101001011","102001022","103002011","104003080","105002020","106002080","107002070"};
		/*
		* Note : employee codes are designed in following way:
		* a) first 3 digits are employee code
		* b) next 3 digits are related to their department id.
		* c) and last 3 digits are the city code of their work location
		* for example
		* 011 : Delhi
		* 022 : Mumbai
		* 080 : Banglore
		* 020 : Pune
		* */
	String codes[] = new String[employees.length];
	String city[] = new String[employees.length];
	
	public String[] getEmployeeCodes() throws PinCodeException	{
		int count = -1;
		for (String empid : employees) {
			if(empid.length() == 9) {
				codes[++count] = empid.substring(0, 3);
			}else {
				throw new PinCodeException();
			}
		}
		
		return codes;
	}
	
	public String[] getEmployeeCity() throws PinCodeException	{
		int count = -1;
		for (String empid : employees) {
			if(empid.length() == 9) {
				city[++count] = empid.substring(empid.length()-3,empid.length());
				if(city[count].equals("011")) {
					System.out.println(codes[count]+" Delhi");
				}
				else if(city[count].equals("022")) {
					System.out.println(codes[count]+" Mumbai");
				}
				else if(city[count].equals("080")) {
					System.out.println(codes[count]+" Banglore");
				}
				else if(city[count].equals("020")) {
					System.out.println(codes[count]+" Pune");
				}
				else {
					throw new PinCodeException(city[count]);
				}
			}else {
				throw new PinCodeException();
			}
		}
		
		return city;
	}
} 
