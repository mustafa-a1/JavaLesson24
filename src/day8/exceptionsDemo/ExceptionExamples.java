package day8.exceptionsDemo;

import java.util.Scanner;

public class ExceptionExamples {

	public static void main(String[] args) {

		System.out.println("Program started.........");

		Scanner scanner = new Scanner(System.in);

		// Ex1
//		System.out.println("Enter a number: ");
//		int num = scanner.nextInt();
//		System.out.println(100/num); // ArithmeticException

		// Ex2

		/*
		 * int a[]= new int[5]; System.out.println("Enter the position (0-4)"); int posn
		 * = scanner.nextInt(); System.out.println();
		 * System.out.println("Enter the value"); int value = scanner.nextInt(); a[posn]
		 * = value; // ArrayIndexOutOfBoundsException System.out.println(a[posn]);
		 */

		// Ex3

		/*
		 * String s = null;
		 * 
		 * int len = s.length(); //NullPointerException System.out.println(len);
		 */

		// Ex4

		String s = "Welcome";
		int num = Integer.parseInt(s); // NumberFormatException
		System.out.println(num);

		System.out.println("***Program ended***");

		scanner.close();

	}

}
