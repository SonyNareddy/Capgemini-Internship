package lab6Collections;

import java.util.*;

public class SortReveresedNum {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
        System.out.println("Enter number of elements in array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }  
	    getSorted(a, n);
	    for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	private static int[] getSorted(int[] a, int n) {
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
