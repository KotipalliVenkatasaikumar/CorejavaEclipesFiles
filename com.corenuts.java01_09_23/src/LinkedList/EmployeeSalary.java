package LinkedList;

public class EmployeeSalary {
	private int empId;
	private String empName;
	private String job;
	private int salary;
	private int commission;
	private float hike;
	private float netSalary;

	public float getHike() {
		return hike;
	}

	public void setHike(float hike) {
		this.hike = hike;
	}

	public float getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}

	public EmployeeSalary(int empId, String empName, String job, int salary, int commission) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.job = job;
		this.salary = salary;
		this.commission = commission;
	}

	@Override
	public String toString() {
		return "EmployeeSalary [empId=" + empId + ", empName=" + empName + ", job=" + job + ", salary=" + salary
				+ ", commission=" + commission + ", hike=" + hike + ", netSalary=" + netSalary + "]";
	}

	public EmployeeSalary() {

	}

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

}
