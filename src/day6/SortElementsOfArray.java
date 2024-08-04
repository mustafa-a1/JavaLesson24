package day6;

import java.util.Arrays;

public class SortElementsOfArray {

	public static void main(String[] args) {
// Q3
		// Using predefined class

		int array[] = { 89, 76, 2, 34, 5, 7, 56 };
		// Sort all the elements of a given array
		Arrays.sort(array);
		System.out.println("Elements of array in ascending order: ");

		for (int i : array) {
			System.out.print(i + " ");
		}

		System.out.println();
		sortMyarray(array);

	}

	// Using bubble sort technique
	public static void sortMyarray(int[] givenArray) {

		int length = givenArray.length;
		for (int i = 0; i < length; i++) {

			for (int j = 0; j < length - i - 1; j++) {
				if (givenArray[j] > givenArray[j + 1]) {
					int temp = givenArray[j];
					givenArray[j] = givenArray[j + 1];
					givenArray[j + 1] = temp;
				}
			}

		}
		System.out.println("Sorted array: ");

		for (int i : givenArray) {
			System.out.print(i + "\t");
		}

	}

}
