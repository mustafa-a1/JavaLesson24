package actionItems;

public class Action_Item3 {

	public static void main(String[] args) {

		/*
		 * int num1 = 15; int num2 = 10;
		 * 
		 * if (num1 > num2) { System.out.println("Largest number is: " + num1); } else {
		 * System.out.println("Largest number is: " + num2); }
		 * 
		 * // Using ternary operator int largest = (num1 > num2) ? num1 : num2;
		 * System.out.println("Largest number using ternary operator: " + largest);
		 */

		/*
		 * int num1 = 50; int num2 = 6; int num3 = 7;
		 * 
		 * if (num1 <= num2 && num1 <= num3) { System.out.println("Smallest number: " +
		 * num1); } else if (num2 <= num1 && num2 <= num3) {
		 * System.out.println("Smallest number: " + num2); } else {
		 * System.out.println("Smallest number: " + num3); }
		 * 
		 */

		String dayName = "Friday";

		switch (dayName) {
		case "Monday":
			System.out.println("Day number is 1");
			break;
		case "Tuesday":
			System.out.println("Day number is 2");
			break;
		case "Wednesday":
			System.out.println("Day number is 3");
			break;
		case "Thursday":
			System.out.println("Day number is 4");
			break;
		case "Friday":
			System.out.println("Day number is 5");
			break;
		case "Saturday":
			System.out.println("Day number is 6");
			break;
		case "Sunday":
			System.out.println("Day number is 7");
			break;
		default:

		}

	}

}
