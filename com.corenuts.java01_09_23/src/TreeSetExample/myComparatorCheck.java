package TreeSetExample;

import java.util.Comparator;

public class myComparatorCheck implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpName().compareToIgnoreCase(o2.getEmpName());	}

}
