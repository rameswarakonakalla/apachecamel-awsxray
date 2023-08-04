package com.bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.entity.ResponseType;
import com.service.ResponseTypeInterface;
import com.service.RtpService;

@Component
//@XRayTrace
public class GetBean extends RtpService implements ResponseTypeInterface{
	private static final Logger LOG = LoggerFactory.getLogger(GetBean.class);
    public ResponseType sayHello() {
    	LOG.info("Hello, world!");
        return new ResponseType("Hello, world!");
    }

}