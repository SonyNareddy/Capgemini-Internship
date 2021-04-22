package lab3Strings;

import java.util.*;

public class PositiveString {

	public static void main(String args[])
    {
    System.out.println("enter string : ");
    Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        if (isPositiveString(s))
           System.out.println("Positive String");
        else
            System.out.println("Not a positive String");
           
    }
	static boolean isPositiveString(String s){
        int n = s.length();
        char c[] = new char [n];
        for (int i = 0; i < n; i++) {
            c[i] = s.charAt(i);
        }
        Arrays.sort(c);
        for (int i = 0; i < n; i++)
            if (c[i] != s.charAt(i))
                return false;
               
        return true;    
    }

}
