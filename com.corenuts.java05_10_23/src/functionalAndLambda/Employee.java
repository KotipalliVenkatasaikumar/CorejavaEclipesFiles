package functionalAndLambda;

import java.util.Objects;

public class Employee {
	private int empId;
	private String empName;
	private String job;
    private double salary;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int empId, String empName, String job, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.job = job;
		this.salary = salary;
	}
	public Employee() {
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", job=" + job + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, job, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName) && Objects.equals(job, other.job)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	
	

}
