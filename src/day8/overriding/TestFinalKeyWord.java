package day8.overriding;

public class TestFinalKeyWord {

	// Cannot change value with Final keyword

	final int rollNo = 1001;

	public static void main(String[] args) {

		TestFinalKeyWord obj = new TestFinalKeyWord();

		System.out.println("Roll no is: " + obj.rollNo);

	}

}
