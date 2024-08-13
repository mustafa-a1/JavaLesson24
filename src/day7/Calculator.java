package day7;

public class Calculator {

	int a = 10, b = 20;

	// #1 No params
	public void sum() {
		System.out.println(a + b);
	}

	// #2 two params
	public void sum(int x, int y) {
		System.out.println(x + y);
	}

	// #3 two with diff data types
	public void sum(double x, int y) {
		System.out.println(x + y);
	}

	// $4 two but sequence changed
	public void sum(int x, double y) {
		System.out.println(x + y);
	}

	// #5 num of params changed
	public void sum(int x, double y, int z) {
		System.out.println(x + y + z);
	}

}
