package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee1 employee = new Employee1();
		employee.setEmpId(001);
		employee.setEmpName("Balu");
		employee.setSalary(50000.00);
		Employee1 employee2 = new Employee1(002, "Sampath", 45000.00);
		Employee1 employee3 = new Employee1(003, "karthik", 60000.00);
		Employee1 employee4 = new Employee1(004, "gopi", 65000.00);
		Employee1 employee5 = new Employee1(005, "kamal", 66000.00);
		Employee1 employee6 = new Employee1(006, "suri", 66000.00);

		List<Employee1> list = new ArrayList<>();

		list.add(employee);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);

		if (list.size() >= 0) {
			System.out.println(list.get(0));
		}
		
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		if (list.size() == 100) {
			System.out.println(list.get(100));
		}

		System.out.println("****for loop*********");

		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));

		}

		System.out.println("*****foreach******");

		for (Employee1 emp : list) {
			System.out.println(emp);
		}

//		Iterator<Employee> itr1 = list.iterator();
//		// while (itr.hasNext()) {
//		System.out.println("-------------------------");
//		if (itr1.hasNext())
//			System.out.println(itr1.next());
//		if (itr1.hasNext())
//			System.out.println(itr1.next());
//		if (itr1.hasNext())
//			System.out.println(itr1.next());
//		if (itr1.hasNext())
//			System.out.println(itr1.next());
//		if (itr1.hasNext())
//			System.out.println(itr1.next());
//		if (itr1.hasNext())
//			System.out.println(itr1.next());
//		if (itr1.hasNext())
//			System.out.println(itr1.next());

		System.out.println("************foreach object**************");
		for (Object obj : list) {
			Employee1 emp = (Employee1) obj;
			System.out.println(emp.getEmpName());
		}

		/*
		 * for (Iterator itr = list.iterator(); ((Iterator) list).hasNext();) {
		 * System.out.println(itr.next());
		 */

		// for loop

//		for (int i = 0; i < list.size(); i++) {
//			if (i == 2) {
//				continue;
//			}
//
//			System.out.println(list.get(i));
//		}

//
		Iterator<Employee1> itr = list.iterator();
		while (itr.hasNext()) {
			Employee1 emp = itr.next();
			System.out.println(emp);

		}

		// for each

//		for(Employee e:list) {
//			System.out.println(e.getEmpName());
//		}

		// while loop
//		int val=0;
//		while(val<list.size()) {
//			System.out.println(list.get(val));
//			val++;
//		}

		System.out.println("**************iterator**********");

		Iterator<Employee1> itr1 = list.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
