package lab3Strings;

import java.util.Scanner;

public class NumDifference {

	public static void main(String[] args) {
		NumDifference m = new NumDifference();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number1 = sc.nextInt();
		System.out.println("The number after modification is : "+m.modifyNumber(number1));
	}
	public int modifyNumber(int number1)
	{
	    String n = String.valueOf(number1);
		StringBuffer s = new StringBuffer();
		for(int i=0;i<n.length()-1;i++)
		{
			int c = (int)n.charAt(i);
			int c1 = (int)n.charAt(i+1);
			if(c-c1>0)
				s.append(c-c1);
			else
				s.append(c1-c);
		}
		s.append(n.charAt(n.length()-1));
		String str = s.toString();
		int n1 = Integer.valueOf(str);
		return n1;
	}
}
