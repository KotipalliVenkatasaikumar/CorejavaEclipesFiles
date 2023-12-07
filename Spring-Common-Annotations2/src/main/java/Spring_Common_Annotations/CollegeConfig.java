package Spring_Common_Annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "Spring_Common_Annotations")
@PropertySource("classpath:college-info.properties")
//@Qualifier("MathTeacher")
public class CollegeConfig {

//	@Bean
//	public Teacher mathTeacher() {
//		return new MathTeacher();
//	}
//
//	@Bean
//	public Principal principalBean() {
//		return new Principal();
//	}
//
////	@Bean(name = {"colBean","collegeBeanAother",})
//	@Bean
//	public College collegeBean() {
////	College college = new College(principalBean());  // by using constructor
//		College college = new College();
	
//		college.setPrincipal(principalBean()); // by using setterMAthod
//		college.setTeacher(mathTeacher());
//		return college;
//	}

}
