package day6;

public class ConstructorDemo {

	// constructors allow to assign values to variables
	// No return type & same name as class name
	// This keyword refers to class level variables

	String name;
	String streetName;
	int houseNumber;
	String zipCode;

	public ConstructorDemo(String name, String streetName, int houseNumber, String zipCode) {
		this.name = name;
		this.streetName = streetName;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		
	}

	public String declaredAddress() {

		return (name + "\n" + houseNumber + ", " + streetName + "\n" + zipCode);
	}

}
