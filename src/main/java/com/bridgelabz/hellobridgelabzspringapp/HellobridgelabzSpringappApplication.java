package com.bridgelabz.hellobridgelabzspringapp;

import com.bridgelabz.hellobridgelabzspringapp.component.EmployeeBean;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Purpose : Simulate SpringBoot application invoking welcome message usng slf4j logger expression
 *
 * @author : Ramkrishna Sheral
 * @version : 0.0.1
 * @since : 01-12-2021
 */
@SpringBootApplication
@Slf4j
public class HellobridgelabzSpringappApplication {
	public static final Logger logger = LoggerFactory.getLogger(HellobridgelabzSpringappApplication.class);
	public static void main(String[] args) {
		logger.debug("Hello World!!");
		ApplicationContext context = SpringApplication.run(HellobridgelabzSpringappApplication.class, args);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(111);
		employeeBean.setEname("Ramkrishna Sheral");
		employeeBean.showEmployeeDetails();
	}

}
