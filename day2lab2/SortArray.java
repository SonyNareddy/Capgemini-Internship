package day2lab2;

import java.util.*;

public class SortArray {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter size of an array:");
	    Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();
	    System.out.println("Enter array:");
	    String arr[] = new String[num];
	    for(int i = 0;i < num;i++) {
	    	arr[i] = sc.next();
	    }
	    String arr1[] = new String[num];
	    SortArray obj= new SortArray ();
	    arr1 = obj.sortStrings(arr);
	    System.out.println("The sorted array is:");
	    for(int i = 0;i < num;i++) {
	    	System.out.print(arr1[i]+" ");
	    }
	}
	public String[] sortStrings(String arr[]) {
		String temp;
		for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) { 
	            if (arr[i].compareTo(arr[j]) > 0) 
	            {
	                temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
		for(int i = 0;i < arr.length;i++) {
			if(arr[i].length() % 2 == 0) {
			  temp = arr[i].substring(0,arr[i].length()/2).toUpperCase();
			  temp += arr[i].substring(arr[i].length()/2,arr[i].length()).toLowerCase();
			  arr[i] = temp;
			}else {
			  temp = arr[i].substring(0,((int)arr[i].length()/2)+1).toUpperCase();
			  temp += arr[i].substring(((int)arr[i].length()/2+1),arr[i].length()).toLowerCase();
			  arr[i] = temp;
			}
		}
		return arr;	
	}

}
