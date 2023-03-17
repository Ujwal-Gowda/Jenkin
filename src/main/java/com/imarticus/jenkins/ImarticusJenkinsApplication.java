package com.imarticus.jenkins;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ImarticusJenkinsApplication {
	
	
	public static Logger logger = LoggerFactory.getLogger(ImarticusJenkinsApplication.class);
	
	public void init() {
		
		logger.info("application got started!!!!!");
	}
	

	public static void main(String[] args) {
		
		logger.info("Running main spring boot app!!!!!");
		SpringApplication.run(ImarticusJenkinsApplication.class, args);
	}

}
