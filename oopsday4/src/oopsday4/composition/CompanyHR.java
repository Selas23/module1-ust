package oopsday4.composition;

public class CompanyHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address resAdd = new Address("31","Mannath","Worli","Mumbai",400000);
		
		Address commAdd = new Address ("32","Antila","Bandra","Mumbai",400018);
		
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 40000,resAdd,commAdd);
		System.out.println(emp1);

		Employee emp2 = new Employee("Jane Doe", "Male", 23, 102, "Accounting", 35000,resAdd,commAdd);
		System.out.println(emp2);

		Employee emp3 = new Employee("Jason Doe", "Female", 28, 103, "Sales", 10000,resAdd,commAdd);
		System.out.println(emp3);

		Employee emp4 = new Employee("Jonas Doe", "Male", 24, 104, "Research", 40000,resAdd,commAdd);
		System.out.println(emp4);

		Employee emp5 = new Employee("John Doe", "Male", 24, 101, "Research", 40000,resAdd,commAdd);
		System.out.println(emp5);
		
		if(emp1.equals(emp5)) {
			System.out.println("the objects are same");}
		else {
			System.out.println("the objects are not same");
		}
		}
		
	}


