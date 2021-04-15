package day2lab1;

import java.util.Scanner;

public class IncreasingNum {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(checkNumber(num))
		{
			System.out.println(num +" is an increasing number");
		}
		else
		{
			System.out.println(num +" number is an increasing number");
		}
	}
	public static boolean checkNumber(int n)
	{
		int flag = 0;
		int lastdig = n % 10;
		n = n/10;
		while(n>0)
		{
			if(lastdig <= n % 10)
			{
				return false;
			}
			lastdig = n % 10;
			n = n/10;
		}
		return true;
	}
}
