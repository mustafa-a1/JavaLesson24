package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Group {

	private int groupId;
	private List<Employee> employees;
	
	public Group(int groupId) {
		this.groupId= groupId;
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void sortEmployeesByName() {
		Collections.sort(employees, Comparator.comparing(Employee::getName));
	}
	
	public String toString() {
		return "Group{groupId=" + groupId + ", employees=" + employees + "}";
	}
}
