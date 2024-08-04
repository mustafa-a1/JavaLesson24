package actionItems;

import java.util.Arrays;

public class ActionItem4 {

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 6, 9, 8 };
		System.out.println("Odd Numbers:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Even Numbers:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}
