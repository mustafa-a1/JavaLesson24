package day6;

public class CheckPalindrome {

	public static void main(String[] args) {

		// Q5 Check to see if a string is palindrome
		String input = "java";
		System.out.println("Given string is a palindrome = " + isPalindrome(input));

		// Q6 remove junk or special character from a string
		String doubtfulInput = "This is my string with special characters: !#*&!";
		String result = doubtfulInput.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(result);

	}

	public static boolean isPalindrome(String str) {

		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return str.equals(reversed);
	}

}
