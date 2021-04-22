package lab3Strings;

import java.util.*;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		int sencount=0,charcount=0, wordcount=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Text : ");
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			ch = s.charAt(i);
			if(ch == '\n' || ch == '.')
				sencount++;
			else if(ch == ' ')
				wordcount++;
			else
				charcount++;
		}
		System.out.println("The character count of the text is : "+charcount);
		System.out.println("The word count of the text is : "+(wordcount+1));
		System.out.println("The sentence count of the text is : "+sencount);
	}

}
