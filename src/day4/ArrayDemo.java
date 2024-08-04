package day4;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		int myArray[] = new int[5]; // Declaring an array

		myArray[0] = 10; // Assigning values to the array
		myArray[1] = 20;
		myArray[2] = 30;
		myArray[3] = 40;
		myArray[4] = 50;

		System.out.println(myArray[4]); // 50 // Extracting values from the array

		// Finding out the length of an array

		int length = myArray.length;
		System.out.println("The length is: " + length);

		// Declaring and assigning values at one go
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println(a[4]); // 5

		// Extracting all the values or printing all the values out of an array

		System.out.println(Arrays.toString(myArray));

		// Print all the values using for loop

		for (int i = 0; i < 5; i++) {
			System.out.println(myArray[i]);
		}

		// use enhanced for loop to print all the values out of an array
		System.out.println("*** Using Enhanced For Loop ***");
		for (int mA : myArray) {
			System.out.println(mA);

		}

		// printing values from last index to first
		System.out.println("Printing in reverse order");
		for (int i = myArray.length - 1; i >= 0; i--) {
			System.out.println(myArray[i]);
		}

		// System.out.println(a); // not possible to print array variable like this

	}
}
