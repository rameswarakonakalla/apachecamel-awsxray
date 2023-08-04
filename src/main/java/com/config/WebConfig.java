package com.config;

import javax.servlet.Filter;

import org.apache.camel.CamelContext;
import org.apache.camel.component.aws.xray.XRayTracer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

import com.amazonaws.xray.javax.servlet.AWSXRayServletFilter;

@Configuration
public class WebConfig {

	@Autowired
	private CamelContext camelContext;

	private static final Logger LOG = LoggerFactory.getLogger(WebConfig.class);

	@Bean
	public Filter TracingFilter() {
		XRayTracer xRayTracer = new XRayTracer();
		xRayTracer.init(camelContext);
		LOG.info("Inside WebConfig");
		return new AWSXRayServletFilter("AWS-Camel-xray");

	}


}
