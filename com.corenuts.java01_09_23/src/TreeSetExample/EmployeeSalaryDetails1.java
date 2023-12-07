package TreeSetExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeSalaryDetails1 {
	public static void main(String[] args) {
		Employee emp1 = new Employee();

		Employee emp2 = new Employee(2, "raja", "salesMan", 30000, 5000);
		Employee emp6 = new Employee(6, "naren", "salesMan", 25000, 0);
		Employee emp3 = new Employee(3, "arun", "salesMan", 25000, 0);
		Employee emp4 = new Employee(4, "kiran", "manager", 50000, 10000);
		Employee emp7 = new Employee(7, "kumar", "manager", 50000, 10000);
		Employee emp9 = new Employee(9, "gopi", "manager", 70000, 20000);
		Employee emp10 = new Employee(10, "suresh", "salesMan", 30000, 0);
		Employee emp8 = new Employee(8, "suri", "salesMan", 80000, 0);
		Employee emp5 = new Employee(5, "laxmi", "salesMan", 30000, 5000);

		emp1.setEmpId(1);
		emp1.setEmpName("Maha");
		emp1.setJob("president");
		emp1.setSalary(100000);
		emp1.setCommission(40000);

		Set<Employee> set = new TreeSet<Employee>();

		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		set.add(emp6);
		set.add(emp7);
		set.add(emp8);
		set.add(emp9);
		set.add(emp10);

//		for (Employee employee : list) {
//			System.out.println(employee);
//		}

		for (Employee itr : set) {
			if (itr.getCommission() != 0) {
				float netSalary = itr.getSalary() + itr.getCommission();
				itr.setNetSalary(netSalary);
			} else if (itr.getJob().equals("manager")) {
				float hikeAmtForManager = (itr.getSalary() * 30) / 100;
				itr.setHike(hikeAmtForManager);
				float totalSalary = itr.getSalary() + hikeAmtForManager;
				itr.setNetSalary(totalSalary);

			} else if (itr.getJob().equals("salesMan")) {
				float hikeAmtForSalesMan = (itr.getSalary() * 20) / 100;
				itr.setHike(hikeAmtForSalesMan);
				float totalSalary = itr.getSalary() + hikeAmtForSalesMan;
				itr.setNetSalary(totalSalary);
			}
			System.out.println(itr);

//			System.out.println("EmployeeName :" + itr.getEmpName() + "  Salary :" + itr.getSalary() + "  commission :"
//					+ itr.getCommission() + "  hike :" + itr.getHike() + "  NetSalary :" + itr.getNetSalary());

		}

		System.out.println("******name******");

		List<Employee> list = new ArrayList<>();
		list.addAll(set);

		Collections.sort(list, new myComparatorCheck());
		for (Employee employee : list) {
			System.err.println(employee);
		}

		System.out.println("*******job*********");
		Collections.sort(list, new MyComparatorNetsal());
		for (Employee employee : list) {
			System.out.println(employee);
		}

//	}

	}
}