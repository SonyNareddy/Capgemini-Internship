package day2lab1;

import java.util.Scanner;

public class sum_cube {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		sum_cube obj = new sum_cube();
		obj.cube(n);	
	}
	public void cube(int n)
	{
		int sum = 0,cube,rem;
		while(n != 0)
		{
			rem = n % 10;
			cube = rem*rem*rem;
			sum = sum + cube;
			n = n/10;
		}
		System.out.println("The sum of the cubes of the digits of a number is " + sum);
	}
}
