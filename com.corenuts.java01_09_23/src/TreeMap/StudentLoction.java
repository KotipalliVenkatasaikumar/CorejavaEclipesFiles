package TreeMap;

public class StudentLoction {
	private String studId;
	private String stuNmae;
	private String stuLoction;

	public String getStudId() {
		return studId;
	}

	@Override
	public String toString() {
		return "StudentLoction [studId=" + studId + ", stuNmae=" + stuNmae + ", stuLoction=" + stuLoction + "]";
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getStuNmae() {
		return stuNmae;
	}

	public void setStuNmae(String stuNmae) {
		this.stuNmae = stuNmae;
	}

	public StudentLoction(String studId, String stuNmae, String stuLoction) {
		super();
		this.studId = studId;
		this.stuNmae = stuNmae;
		this.stuLoction = stuLoction;
	}

	public String getStuLoction() {
		return stuLoction;
	}

	public void setStuLoction(String stuLoction) {
		this.stuLoction = stuLoction;
	}

}
