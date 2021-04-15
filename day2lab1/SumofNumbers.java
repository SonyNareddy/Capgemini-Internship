package day2lab1;

import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		int n,sum;
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("The Sum of numbers that are divisible by 3 and 5 are :" + calculateSum(n));
	}
	public static int calculateSum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++)
		{	
			if(i % 3 == 0 && i % 5 == 0)
				sum = sum +  i;
		}
		return sum;
	}

}
