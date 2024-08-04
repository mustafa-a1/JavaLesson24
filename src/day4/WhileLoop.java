package day4;

public class WhileLoop {

	public static void main(String[] args) {

		/*
		 * 
		 * // Initialization; Condition/Logic; Increment/Decrement
		 * 
		 * // Print 1 to 5 using while loop int num = 1;
		 * 
		 * while (num <= 5) { System.out.println(num); num++; }
		 * 
		 * // Print 1 to 5 using do while loop
		 * 
		 * int number = 1;
		 * 
		 * do { //System.out.println(number); System.out.println("Mustafa"); number++;
		 * }while(number <= 5);
		 * 
		 */

		// Situation 1 Break statement

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			// Keeping the code intact, exclude printing 6-10
			if (i == 5) {
				break; // Jumping statement (Jumping out of the loop)
			}
		}

		System.out.println("**Situation 2**".repeat(2));
		// Situation 2 Print all the numbers less than 5

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue; // Skips the current sequence
			}
			System.out.println(i);
		}

	}

}
