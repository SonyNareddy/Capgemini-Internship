package day2lab2;

import java.util.*;


public class SecondSmall {

	public static void main(String[] args) {
		System.out.println("Enter the n value");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the array values");
        for(int i = 0;i < num;i++) {
        	arr[i] = sc.nextInt();
        }
        System.out.println("The second smallest number is: " +getSecondSmallest(arr));
	}
	public static int getSecondSmallest(int arr[]) {
		Arrays.sort(arr);
		return arr[1];
	}

}
