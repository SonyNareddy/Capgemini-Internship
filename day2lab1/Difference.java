package day2lab1;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the n value:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("The difference between the sum of the squares and the square of the sum is :"+calculateDifference(n));
	}
	public static int calculateDifference(int n)
	{
		int sum=0,add=0,square;
		for(int i=1;i<=n;i++)
		{
			sum = sum + i;
		}
		for(int i=1;i<=n;i++)
		{
			square = i*i;
			add = add + square; 
		}
		sum = sum * 2;
		return (add-sum);
		
	}
	
}
