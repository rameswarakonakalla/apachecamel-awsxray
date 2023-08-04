package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ApachecamelAwsxrayApplication {

	public static void main(String[] args) {
//		AWSXRayRecorderBuilder builder = AWSXRayRecorderBuilder.standard().withPlugin(new EC2Plugin());
//		AWSXRay.setGlobalRecorder(builder.build());
		SpringApplication.run(ApachecamelAwsxrayApplication.class, args);
	}

}
