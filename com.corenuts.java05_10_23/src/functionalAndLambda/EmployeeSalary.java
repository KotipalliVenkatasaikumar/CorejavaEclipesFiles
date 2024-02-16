package functionalAndLambda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeSalary {
	public static void main(String[] args) {
//		List<Employee> list = new ArrayList<>();
//		list.add(new Employee(1, "sai", "dev", 500000.00));
//		list.add(new Employee(2, "gopi", "Sr dev", 900000.00));
//		list.add(new Employee(1, "sampu", "dev", 600000.00));
//		list.add(new Employee(1, "vasu", "tes", 700000.00));
//		list.add(new Employee(1, "pradeep", "dev", 800000.00));
//		list.add(new Employee(1, "karthik", "production", 950000.00));
//		list.add(new Employee(1, "raf", "dev", 550000.00));
//
//		double sum = 0;
//		for (Employee obj : list) {
//			sum = sum + obj.getSalary();
//		}
//		System.out.println(" sum of total salary =" +sum);

		
		Set<Employee> set=new HashSet<>();
		set.add(new Employee(1, "sai", "dev", 500000.00));
		set.add(new Employee(2, "sai", "dev", 500000.00));
		set.add(new Employee(1, "sai", "dev", 500000.00));
		set.add(new Employee(2, "sai", "dev", 500000.00));
		set.add(new Employee(3, "sai", "dev", 500000.00));
		for (Employee employee : set) {
			System.err.println(employee);
		}
	}

}
