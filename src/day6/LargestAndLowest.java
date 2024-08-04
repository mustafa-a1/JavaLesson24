package day6;

import java.util.Arrays;

public class LargestAndLowest {

	public static void main(String[] args) {
		// Q4. Largest and lowest num of an array
		// Using iteration (Greedy approach)
		int arr[] = { 3, 8, 8, 9, 2, 67, 34 };

		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}

		}

		System.out.println("The minimum number: " + min);
		System.out.println("The maximum number: " + max);

		// Using predefined functions/library

		int minimum = Arrays.stream(arr).min().getAsInt();
		int maxiumum = Arrays.stream(arr).max().getAsInt();
		System.out.println("Minimum is: " + minimum);
		System.out.println("Maximum is: " + maxiumum);

	}

}
