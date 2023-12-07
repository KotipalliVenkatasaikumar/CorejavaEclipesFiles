package TreeMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ArrayList.EmployeeSalary;

public class SetEmployeeSal {
	public static void main(String[] args) {
		EmployeeSal emp1 = new EmployeeSal();
		emp1.setEmpId(1);
		emp1.setEmpName("Maha");
		emp1.setJob("president");
		emp1.setSalary(100000);
		emp1.setCommission(40000);
		EmployeeSal emp2 = new EmployeeSal(2, "raja", "salesMan", 30000, 5000);
		EmployeeSal emp3 = new EmployeeSal(3, "arun", "salesMan", 25000, 0);
		EmployeeSal emp4 = new EmployeeSal(4, "kiran", "manager", 50000, 10000);
		EmployeeSal emp5 = new EmployeeSal(5, "laxmi", "salesMan", 30000, 5000);
		EmployeeSal emp6 = new EmployeeSal(6, "naren", "salesMan", 25000, 0);
		EmployeeSal emp7 = new EmployeeSal(7, "kumar", "manager", 50000, 10000);
		EmployeeSal emp8 = new EmployeeSal(8, "suri", "salesMan", 80000, 0);
		EmployeeSal emp9 = new EmployeeSal(9, "gopi", "manager", 70000, 20000);
		EmployeeSal emp10 = new EmployeeSal(10, "suresh", "salesMan", 30000, 0);

		List<EmployeeSal> list = new ArrayList<>();
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
		for (EmployeeSal itr : list) {
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
//			System.out.println(itr);
//			System.out.println("EmployeeName :" + itr.getEmpName() + "  Salary :" + itr.getSalary() + "  commission :"
//					+ itr.getCommission() + "  hike :" + itr.getHike() + "  NetSalary :" + itr.getNetSalary());

		}

		Map<String, Integer> map = jobRoleCount(list);
		Map<String, List<EmployeeSal>> map1 = jobRole(list);

	}
	

	public static Map<String, Integer> jobRoleCount(List<EmployeeSal> jobRoles) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer value = 0;
		for (EmployeeSal employeeSal : jobRoles) {
			String key = employeeSal.getJob();
			if (map.containsKey(key)) {
				value = map.get(key);
				value = value + 1;
				map.put(key, value);
			} else {
				map.put(key, 1);
			}

		}
		System.out.println(map);
		return map;

	}

	public static Map<String, List<EmployeeSal>> jobRole(List<EmployeeSal> jobRoles) {
		Map<String, List<EmployeeSal>> map = new HashMap<String, List<EmployeeSal>>();
		for (EmployeeSal employeeSal : jobRoles) {
			String key = employeeSal.getJob();
			if (map.containsKey(key)) {
				List<EmployeeSal> list = map.get(key);
				list.add(employeeSal);
				map.put(key, list);
			} else {
				List<EmployeeSal> list = new ArrayList<>();
				list.add(employeeSal);
				map.put(key, list);
			}
		}
		for (Map.Entry<String, List<EmployeeSal>> element : map.entrySet()) {
			System.out.println(element.getKey());
			List<EmployeeSal> list = element.getValue();
			for (EmployeeSal employeeSal : list) {
				System.out.println(employeeSal);
			}
		}

		return map;

	}

}
