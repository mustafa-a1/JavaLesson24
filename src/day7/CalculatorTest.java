package day7;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		calc.sum(); // 1
		calc.sum(30, 50); // 2
		calc.sum(45, 30.5, 80); // 5
		calc.sum(50, 50.0); // 4
		calc.sum(70.8, 60); // 3

	}

}
