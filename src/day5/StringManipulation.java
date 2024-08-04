package day5;

public class StringManipulation {

	public static void main(String[] args) {

		// Strings are immutalbe - it can not be changed
		String s = "Welcome 123"; // String literal

		String s2 = new String("Welcome"); // Through string object

		// Methods of string class

		// Length() Method -- counts all the characters in a string and returns the
		// number in int data type

		int length = s2.length();
		System.out.println("The length is: " + length);

		System.out.println(s.length()); // 11

		// ============== \\

		// concat() - join multiple strings
		String s1 = "Welcome";
		String s3 = " to Java";
		String s4 = " programming";

		System.out.println(s1.concat(s3).concat(s4)); // Welcome to Java programming

		// ================== \\

		// trim() -- would trim any leading and trailing spaces from a string

		s = "     welcome to java      ";
		System.out.println(s.length());
		s.trim();
		System.out.println(s.trim().length());

		// ========== \\

		// charAt() -- returns a single character out of a string from a specific index
		// index starts from 0

		s = "Java Selenium";
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(5));

		// ============ \\

		// contains() -- returns a boolean
		// check a string is part of the main string or not

		System.out.println(s.contains("Jav")); // true
		System.out.println(s.contains("Sel")); // true
		System.out.println(s.contains("ium")); // true
		System.out.println(s.contains("Sli")); // false
		System.out.println(s.contains("a S")); // true

		// ============== \\

		// equals(), equalsIgnoreCase() -- compares two strings and returns true/false

		s1 = "Welcome";
		s2 = "welcome";
		System.out.println(s1.equals("welcome")); // false
		System.out.println(s1.equalsIgnoreCase(s2)); // true

		// ================ \\

		// replace() -- it replaces a single character or character sequence of a given
		// string

		s = "welcome to java selenium automation";
		System.out.println(s.replace("w", "W"));
		System.out.println(s.replace("java", "python"));

		// =========== \\

		// substring() -- extracts substring from the main string

		System.out.println(s.substring(11)); // java selenium automation
		System.out.println(s.substring(11, 15)); // java

		// ========== \\

		// toUpperCase() toLowerCase() -- converts cases

		s = "Welcome";
		System.out.println(s.toUpperCase()); // WELCOME
		System.out.println(s.toLowerCase()); // welcome

		// =============== \\

		// split() -- split or divide original string into multiple parts based on
		// delimiter

		s = "abc@xyz";
		String a[] = s.split("@");
		System.out.println(a[1]); // xyz
		s = "welcome to java selenium automation";
		String b[] = s.split(" ");
		System.out.println(b[3]); // selenium

		s = "welcome to java selenium automation";
		System.out.println(s.replace(" ", "_"));

		// extract only abc from the following string
		s = "abc,123@m.com";
		String c[] = s.split(",");
		System.out.println(c[0]);

	}

}
