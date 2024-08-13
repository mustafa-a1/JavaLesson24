package day8.exceptionsDemo;

public class ThrowKeyword {

	public void checkSum(int num) {

		if (num < 1) {
			throw new ArithmeticException("Number is invalid, can not find the area of a square.");
		} else {
			System.out.println(num * num);
		}

	}

	public static void main(String[] args) {

		ThrowKeyword tk = new ThrowKeyword();
		try {
			tk.checkSum(-4);
		} catch (Exception e) {
			System.out.println("Exception occured");;
		}
		System.out.println("****All the best****");
	}

}
