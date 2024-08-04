package day4;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		// declaration
		int a[][] = new int[3][2];

		// Assigning values to the cells

		a[0][0] = 100;
		a[0][1] = 200;

		a[1][0] = 600;
		a[1][1] = 700;

		a[2][0] = 800;
		a[2][1] = 900;

		System.out.println(a[1][1]); // 700

		int b[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		System.out.println(b[2][1]);

		System.out.println("Printing all the values");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}

		}

		System.out.println("Printing all the values from b array");

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.println(b[i][j]);
			}
		}

		System.out.println("Extracting all the values using enhanced for loop");
		for (int arr[] : b) {
			for (int x : arr) {
				System.out.print(x + " ");

			}
			System.out.println();
		}

	}
}
