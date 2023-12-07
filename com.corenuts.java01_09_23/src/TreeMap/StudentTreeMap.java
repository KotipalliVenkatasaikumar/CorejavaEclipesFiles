package TreeMap;

public class StudentTreeMap {
	@Override
	public String toString() {
		return "StudentTreeMap [StuId=" + StuId + ", stuName=" + stuName + ", stuClass=" + stuClass + ", sub1=" + sub1
				+ ", sub2=" + sub2 + ", sub3=" + sub3 + ", sub4=" + sub4 + ", totalMarks=" + totalMarks
				+ ", percentage=" + percentage + "]";
	}

	private int StuId;
	private String stuName;
	private String stuClass;
	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;
	private float totalMarks;
	private float percentage;

	public int getStuId() {
		return StuId;
	}

	public void setStuId(int stuId) {
		this.StuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuClass() {
		return stuClass;
	}

	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	public int getSub4() {
		return sub4;
	}

	public void setSub4(int sub4) {
		this.sub4 = sub4;
	}

	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}

	public float getTotalMarks() {
		return totalMarks;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public float getPercentage() {
		return percentage;
	}

	public StudentTreeMap(int stuId, String stuName, String stuClass, int sub1, int sub2, int sub3, int sub4) {
		super();
		StuId = stuId;
		this.stuName = stuName;
		this.stuClass = stuClass;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}

	public StudentTreeMap() {

	}

}
