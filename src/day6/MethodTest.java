package day6;

public class MethodTest {

	public static void main(String[] args) {

		MethodDemo m = new MethodDemo();
		m.methodOne();
		String result = m.methodTwo();
		System.out.println(result);
		m.methodThree("Sarmin");
		int sum = m.add(1, 5);
		System.out.println(sum);

	}

}
