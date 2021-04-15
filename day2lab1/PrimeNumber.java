package day2lab1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		n = sc.nextInt();
	}
	public static void printPrime(int n)
	{
		int i,j,flag;
		System.out.println("The prime numbers between 1 and "+n+"are:");
		for(i=1;i<=n;i++)
		{
			if(i==1 || i==0)
				continue;
			flag = 1;
			for(j=2;j<=i/2;j++)
			{
				if(i % j == 0)
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
				System.out.println(i + " ");
		}
	}
}
