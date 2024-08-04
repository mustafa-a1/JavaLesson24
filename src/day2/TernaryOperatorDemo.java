package day2;

public class TernaryOperatorDemo {

	public static void main(String[] args) {

		// Conditional or Ternary Operator (?:)
		// variable = (n1 > n2) ? n1 : n2; if n1 is greater return n1 if false return n2
		
		int age = 15;
		System.out.println();
		String result = (age >= 18) ? "Eligible to vote" : "Not eligible!";
		System.out.println(result);
		System.out.println((age >= 18) ? "Eligible to vote" : "Not eligible!");
		
		int a = 25, b = 10;
		
		//System.out.printf("Initial value of a %d and b %d", a, b);
		System.out.println("Initial value of a is: " + a + " and b is: " + b);
		a = a +b; // 35
		b = a - b; // 25
		a = a - b;
		//System.out.printf("Final value of a %d and b %d", a, b);
		System.out.println("Final value of a is: " + a + " and b is: " + b);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
