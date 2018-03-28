package com.krvgz.demotensorflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tensorflow.TensorFlow;

@RestController
@SpringBootApplication
public class DemoTensorflowApplication extends SpringBootServletInitializer {

	@GetMapping(value = "/tensorflow")
	public String tensorflow() {
		return "TensorFlowExample using TensorFlow version: " +  TensorFlow.version();
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoTensorflowApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoTensorflowApplication.class, args);
	}
}
