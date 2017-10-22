package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sanjeevkumar_r@hcl.com
 *
 */
//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.hcl","com.hcl.web.controller","com.hcl.modal","com.hcl.dao"})
public class InterviewPortalApplication /*implements CommandLineRunner*/ extends SpringBootServletInitializer { 

/*	@Autowired
	private UserDao userDao;*/
	
	public static void main(String[] args) {
		SpringApplication.run(InterviewPortalApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(InterviewPortalApplication.class);
	}

	/*@Override
	public void run(String... arg0) throws Exception {
		
		User userArray [] = {
			new User("Sanjeev", "Rathaur", "sanjeevkumar_r@hcl.com"),
			new User("Sanjeev1", "Rathaur1", "sanjeevkumar_r1@hcl.com"),
			new User("Sanjeev1", "Rathaur1", "sanjeevkumar_r2@hcl.com")
		};
		
		for (User user : userArray) {
			userDao.save(user);
		}
		
		List<User> userList = userDao.findAll();
		
		for (User user : userList) {
			System.out.println(user.toString());
		}
		
		
		
	}*/
	
	
	
}
