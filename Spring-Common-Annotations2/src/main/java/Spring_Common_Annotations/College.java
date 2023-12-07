package Spring_Common_Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("collegeBean")
@Component
public class College {
	// dependency injuction
	@Autowired
	private Principal principal;

	@Autowired
	@Qualifier("teluguTeacher")
	private Teacher teacher;

	@Value("${college.Name}")
	private String collegeName;

//	@Autowired
//	public void setPrincipal(Principal principal) {
//		this.principal = principal;
//	}

//		
//	public College(Principal principal) {
//		super();
//		this.principal = principal;
//	}

//	@Autowired
//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void test() {
		principal.principalInfo();
		teacher.teah();
		System.out.println("clg name : " + collegeName);
		System.out.println("calling test method");
	}

}
