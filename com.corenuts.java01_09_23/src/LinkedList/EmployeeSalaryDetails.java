package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import ArrayList.EmployeeSalary;

public class EmployeeSalaryDetails {
	public static void main(String[] args) {
		EmployeeSalary emp1 = new EmployeeSalary();
		emp1.setEmpId(1);
		emp1.setEmpName("Maha");
		emp1.setJob("president");
		emp1.setSalary(100000);
		emp1.setCommission(40000);
		EmployeeSalary emp2 = new EmployeeSalary(2, "raja", "salesMan", 30000, 5000);
		EmployeeSalary emp3 = new EmployeeSalary(3, "arun", "salesMan", 25000, 0);
		EmployeeSalary emp4 = new EmployeeSalary(4, "kiran", "manager", 50000, 10000);
		EmployeeSalary emp5 = new EmployeeSalary(5, "laxmi", "salesMan", 30000, 5000);
		EmployeeSalary emp6 = new EmployeeSalary(6, "naren", "salesMan", 25000, 0);
		EmployeeSalary emp7 = new EmployeeSalary(7, "kumar", "manager", 50000, 10000);
		EmployeeSalary emp8 = new EmployeeSalary(8, "suri", "salesMan", 80000, 0);
		EmployeeSalary emp9 = new EmployeeSalary(9, "gopi", "manager", 70000, 20000);
		EmployeeSalary emp10 = new EmployeeSalary(10, "suresh", "salesMan", 30000, 0);

		LinkedList<EmployeeSalary> list = new LinkedList();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		list.add(emp8);
		list.add(emp9);
		list.add(emp10);
		for (EmployeeSalary itr : list) {
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
			System.out.println("EmployeeName :" + itr.getEmpName() + "  Salary :" + itr.getSalary() + "  commission :"
					+ itr.getCommission() + "  hike :" + itr.getHike() + "  NetSalary :" + itr.getNetSalary());

		}

	}

}
