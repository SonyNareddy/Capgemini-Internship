package day2lab1;

import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Powerof2 obj = new Powerof2();
		obj.checkNumber(n);
	}
	public boolean checkNumber(int n)
	{
		while(n % 2 == 0)
		{
			n = n/2;
		}
		if(n == 1)
		{
			System.out.println("The number is power of 2 ");
			return true;
		}
		else
		{
			System.out.println("The number is not the power of 2 ");
			return false;
		}
	}
}
