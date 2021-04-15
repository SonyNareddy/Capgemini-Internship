package day2lab2;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		
		ReverseArray rs = new ReverseArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		System.out.println("Enter array: ");
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int b[] = new int[n];
		b = rs.getSort(a,n);
		System.out.println("The array after reversing is: ");
		for(int i = 0;i < n;i++) {
	      	System.out.print(b[i]+" ");
	    }
	}

	private int[] getSort(int[] a, int n) {
		for(int i = 0;i < n;i++) {
			int rev = 0;
			while(a[i] > 0) {
				int temp = a[i] % 10;
				rev = (rev*10) + temp;
				a[i] /= 10;
			}
			a[i] = rev;
		}
		Arrays.sort(a);
		return a;
	}

}
