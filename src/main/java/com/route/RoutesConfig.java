package com.route;

import javax.annotation.PostConstruct;

import org.apache.camel.CamelContext;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.bean.GetBean;
import com.bean.PostBean;

@Component
//@XRayEnabled
//public class RoutesConfig extends RouteBuilder{

//	@Override
//	public void configure() throws Exception {
//		// TODO Auto-generated method stub
//		from("direct:processFromdupl")
//		.routeId("DUPL route")
//		.bean(GetBean.class , "sayHello");
//		
//		
//		from("direct:processSenddupl")
//		.bean(PostBean.class , "response");
//	}
public class RoutesConfig {
	@Bean
	@PostConstruct
	RoutesBuilder fromRoutesConfig() {
		return (RoutesBuilder) new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				// TODO Auto-generated method stub
				from("direct:processFromdupl").routeId("DUPL route").bean(GetBean.class, "sayHello");

				from("direct:processSenddupl").bean(PostBean.class, "response");
			}

		};
	}

}
