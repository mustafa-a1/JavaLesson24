package day6;

public class MethodDemo {
	
/* 1) Method name is a user-defined name 
 * but it should display the intent of 
 * performing an action. 
 * 2) Method may or may not return a value
 * 3) Method may or may not accept parameters
 * 4) Methods can be invoked through objects  
 * 5) Methods are created to perform certain actions 
 */
	// 1) No params No return

	public void methodOne() {
		System.out.println("Hey, we are learning method!");
	}

	// 2) No params Return value

	public String methodTwo() {
		String a = "Hello.";
		String b = "How are you?";
		return a + b;
	}

	// 3) Params No return

	public void methodThree(String name) {
		System.out.println(name + ", how are you?");
	}

	// 4) Params Returns value

	public int add(int a, int b) {
		return a + b;
	}

}
