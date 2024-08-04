package day4;

public class ActionItem2 {

	public static void main(String[] args) {

		
		//System.out.println("Factorial is: " + doFactorial(9));
		
		System.out.println("Fahrenheit value is: " + convertToFahrenheit(42));
		
	}

//	public static long doFactorial(int number) {
//
//		// declare a new int type variable
//		long factorial = 1;
//		while (number > 1) {
//			factorial *= number; // We are multiplying subsequent values with factorial
//			number--; // Decrementing the given number in every iteration
//		}
//
//		return factorial; // Returning the calculated value
//	}

	
	public static double convertToFahrenheit(int celcius) {
	double fahrenheit;
		fahrenheit = ((celcius * 9) / 5) + 32; // Conversion formula
		return fahrenheit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
