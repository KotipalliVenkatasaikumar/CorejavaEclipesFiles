package mapInterafce;

public class StudentMarks {
	
		private int StuId;
		private String stuName;
		private int age;
		
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
		
		public StudentMarks(int stuId, String stuName) {
			super();
			StuId = stuId;
			this.stuName = stuName;
			
		}
		public StudentMarks() {
			
		}
	
}
