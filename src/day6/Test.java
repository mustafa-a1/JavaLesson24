package day6;

public class Test {

	public static void main(String[] args) {

		// Create an object of Student class
		// and save it under a reference variable
		Student student1 = new Student();
		student1.sid = 1001;
		student1.name = "David";
		student1.grade = 'A';
		student1.printStudentData();

		Employee emp1 = new Employee();
		emp1.eid = 7007;
		emp1.name = "Smith";
		emp1.department = "Finance";
		emp1.salary = 130000;
		
		emp1.diplay();
		new Employee().name= "Srvani";
		new Employee().eid= 8000;
		new Employee().department= "QA";
		new Employee().salary= 150000;
		new Employee().diplay();
	}

}
