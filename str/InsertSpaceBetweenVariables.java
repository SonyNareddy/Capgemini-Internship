package lab9streamAPI.str;


interface AddSpaces {
	public String doAddSpaces(String str);
}
public class InsertSpaceBetweenVariables {

	public static void main(String[] args) {
		InsertSpaceBetweenVariables obj = new InsertSpaceBetweenVariables();
		obj.createSpaces();

	}
	public void createSpaces() {
		AddSpaces a = (s)->{
			char c[]= s.toCharArray();
			StringBuilder s1 = new StringBuilder();
			for(char i:c) {
				s1.append(i);
				s1.append(' ');
			}
			String s2 = s1.toString();
			return s2;
		};
		String res = a.doAddSpaces("Java");
		System.out.println("Result after inserting space between Variables :"+res);
	}

}