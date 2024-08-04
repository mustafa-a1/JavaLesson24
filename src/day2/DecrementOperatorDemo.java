package day2;

public class DecrementOperatorDemo {

	public static void main(String[] args) {

		// Decrement Operator (--)

//		int a = 100;
//		// a = a-1;
//		a--;
//		System.out.println(a);

		// post decrement

		int b = 100;
		int result = b--;
		System.out.println(result); // 100
		System.out.println(b); // 99

		// pre decrement

		int c = 100;
		int res = --c;
		System.out.println(res); // 99

	}

}
