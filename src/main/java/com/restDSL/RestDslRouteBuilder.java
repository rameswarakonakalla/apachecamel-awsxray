package com.restDSL;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.aws.xray.XRayTrace;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.entity.PostRequestType;
import com.entity.ResponseType;

@Component
//@XRayEnabled
public class RestDslRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		 restConfiguration()
		 //.apiHost("localhost")
		 .port(9900)
		 //.component("servlet")
		 .bindingMode(RestBindingMode.auto);
		
		rest()
		
		.get()
		.consumes("application/json")
        .produces("application/json")
		.outType(ResponseType.class)
		.to("bean:getBean");
		
		rest()
		.post("/send")
		.type(PostRequestType.class)
		.consumes("application/json")
        .produces("application/json")
        
		.outType(ResponseType.class)
		.to("bean:postBean");
		

	}

}
