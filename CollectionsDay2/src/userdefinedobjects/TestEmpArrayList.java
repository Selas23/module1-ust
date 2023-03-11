package userdefinedobjects;

import java.util.Iterator;

//import oopsday4.inheritence.Employee;
import java.util.ArrayList;

public class TestEmpArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Employee> empList = new ArrayList<Employee>();
		
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 40000);

		Employee emp2 = new Employee("Jane Doe", "Male", 23, 102, "Accounting", 35000);
		
		Employee emp3 = new Employee("Jason Doe", "Female", 28, 103, "Sales", 10000);
		
		Employee emp4 = new Employee("Jonas Doe", "Male", 24, 104, "Research", 40000);
		
		Employee emp5 = new Employee("John Doe", "Male", 24, 101, "Research", 40000);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		System.out.println(empList);
		System.out.println(empList.size());
		
	}

}
