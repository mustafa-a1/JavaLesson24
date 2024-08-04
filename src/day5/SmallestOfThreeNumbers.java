package day5;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {

		int a = 89, b = 67, c = 37, smallest;

		// Comparing between a and b and extracting the smallest

		int temp = (a < b) ? a : b;

		// Comparing temp with c and store the result in smallest variable

		smallest = (c < temp) ? c : temp;

		System.out.println("The smallest number is: " + smallest);

		// More concise approach for brain storming

		smallest = c < (a < b ? a : b) ? c : (a < b ? a : b);
		System.out.println("The smallest number is: " + smallest);

	}

}
