package userdefinedobjects;

import java.util.HashSet;

public class TestEmpHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Employee> empSet = new HashSet<Employee>();
		
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 40000);

		Employee emp2 = new Employee("Jane Doe", "Male", 23, 102, "Accounting", 35000);
		
		Employee emp3 = new Employee("Jason Doe", "Female", 28, 103, "Sales", 10000);
		
		Employee emp4 = new Employee("Jonas Doe", "Male", 24, 104, "Research", 40000);
		
		Employee emp5 = new Employee("John Doe", "Male", 24, 101, "Research", 40000);
		
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		System.out.println(empSet);
		System.out.println(empSet.size());//this hashset will not count the duplicate
		
		
	}

}
