package day10;

public class Main {

	public static void main(String[] args) {
		
		Group group = new Group(1001);
		group.addEmployee(new Employee(101, "Moose"));
		group.addEmployee(new Employee(102, "Abe"));
		group.addEmployee(new Employee(103, "Ali"));
		group.addEmployee(new Employee(104, "Moe"));
		group.addEmployee(new Employee(105, "Sam"));
		
		System.out.println("Before sorting: " + group); 
		group.sortEmployeesByName();
		System.out.println("After sorting: " + group); 
	}
	
	
	
}
