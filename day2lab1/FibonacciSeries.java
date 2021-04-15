package day2lab1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		n = sc.nextInt();
		System.out.println("The nth value of the fibonacci series using recursive function is "+recursive(n));
		System.out.println("The nth value of the fibonacci series using non-recursive function is "+nonrecursive(n));
		

	}
	public static int recursive(int n)
	{
		if(n <= 1)
			return n;
		else
			return recursive(n-1)+recursive(n-2);
			
	}
	public static int nonrecursive(int n)
	{
		int prefib = 0,curfib = 1,newfib;
		if(n <= 1)
		{
			return n;
		}
		for(int i=0;i<n-1;i++)
		{
			newfib = prefib+curfib;
			prefib = curfib;
			curfib = newfib;
		}
		return curfib;
	}

}
