package day8.exceptionsDemo;

public class HandleException {

	public static void main(String[] args) {

		System.out.println("Program started....");

//		String s = null;
//
//		try {
//			int len = s.length(); // NullPointerException
//			System.out.println(len);
//		} catch (NullPointerException e) {
//			System.out.println("Exception occured!!");
//
//		}

		String s = "Welcome";

		try {
			int num = Integer.parseInt(s); // NullPointerException
			System.out.println(num);
		} catch (NullPointerException e) {
			System.out.println("Exception occured!!");
		} catch (ArithmeticException e) {
			System.out.println("Exception occured!!");
		} catch (NumberFormatException e) {
			System.out.println("Exception occured!!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occured!!");

		}

		System.out.println("End of program....");
	}

}
