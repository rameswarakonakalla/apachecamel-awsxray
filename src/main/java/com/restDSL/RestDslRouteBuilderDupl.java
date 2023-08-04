package com.restDSL;

import org.apache.camel.CamelContext;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.aws.xray.XRayTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.entity.PostRequestType;
import com.entity.ResponseType;


@Configuration
//@XRayTrace
public class RestDslRouteBuilderDupl{

	
	@Bean
	RoutesBuilder duplConfig() {
		return new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				
				rest()
				
				.get("/fromdupl")
				.consumes("application/json")
		        .produces("application/json")
				.outType(ResponseType.class)
				.to("direct:processFromdupl");
				
				rest()
				.post("/senddupl")
				.type(PostRequestType.class)
				.consumes("application/json")
		        .produces("application/json")
		        
				.outType(ResponseType.class)
				.to("direct:processSenddupl");
			}
		};
	}

}
