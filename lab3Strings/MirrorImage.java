package lab3Strings;

import java.lang.StringBuffer;
import java.util.*;

public class MirrorImage {
	public static void main(String args[])
	{
		MirrorImage m = new MirrorImage();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		System.out.println(m.getImage(s));
	}
	public String getImage(String s)
	{
		StringBuffer sb = new StringBuffer(s);
		sb.append("|");
		StringBuffer sbr = new StringBuffer(s);
		sbr.reverse();
		sb.append(sbr);
		return sb.toString();
	}
}
