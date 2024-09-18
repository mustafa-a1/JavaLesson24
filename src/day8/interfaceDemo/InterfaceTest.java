package day8.interfaceDemo;

public class InterfaceTest implements Shape {

	@Override
	public void circle() {

		System.out.println("Circle belongs to abstract method");
	}

	public void triangle() {
		System.out.println("Triangle belongs to InterfaceTest class");
	}

	public static void main(String[] args) {

		InterfaceTest iobj = new InterfaceTest();
		iobj.circle(); // Abstract method implemented in this class
		iobj.square(); // Default
		Shape.rectangle(); // Static method
		iobj.triangle(); // Class method
	
		System.out.println("Area is: " + Shape.length * Shape.width);

	}

}
