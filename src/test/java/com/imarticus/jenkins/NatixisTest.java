package com.imarticus.jenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class NatixisTest {

	
	public static Logger logger = LoggerFactory.getLogger(ImarticusJenkinsApplication.class);
	
	@Test
	void test() {
		
	
	 logger.info("application got started !!!");
	 assertEquals(true, true);
	}

}
