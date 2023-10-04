package com.amdocs.demo_amd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestDemoAmdApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoAmdApplication::main).with(TestDemoAmdApplication.class).run(args);
	}

}
