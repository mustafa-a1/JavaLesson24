package day8.interfaceDemo;

public interface Shape {

	int length = 10; // Final and Static
	int width = 20; // Final and Static

	void circle(); // Public

	default void square() {
		System.out.println("Square belongs to default method");
	}

	public static void rectangle() {
		System.out.println("Rectangle belongs to static method");
	}

}
