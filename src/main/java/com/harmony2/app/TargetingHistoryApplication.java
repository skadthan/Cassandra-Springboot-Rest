package com.harmony2.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Suresh Kadthan
 * @version 1.0
 * @since Feb 02, 2018
 */

@SpringBootApplication
@ComponentScan(basePackages="com.harmony2")
public class TargetingHistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TargetingHistoryApplication.class, args);
	}
}
