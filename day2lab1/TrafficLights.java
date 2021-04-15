package day2lab1;

import java.util.Scanner;

public class TrafficLights {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the signal:\n1.red\n2.yellow\n3.green");
		int select = sc.nextInt();
		System.out.println(checkSignal(select));
	}
	public static String checkSignal(int n)
	{
		switch(n)
		{
		case 1:
			return "stop";
		case 2:
			return "ready";
		case 3:
			return "go";
		}	
		return null;
	}
}
