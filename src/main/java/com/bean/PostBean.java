package com.bean;
import org.apache.camel.component.aws.xray.XRayTrace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.entity.PostRequestType;
import com.entity.ResponseType;
import com.service.ResponseTypeInterface;
import com.service.ResponseTypeInterfacePost;
import com.service.RtpService;

@Component
//@XRayTrace
public class PostBean extends RtpService implements ResponseTypeInterfacePost {

	private static final Logger LOG = LoggerFactory.getLogger(PostBean.class);
    public ResponseType response (PostRequestType input) {
        // We create a new object of the ResponseType
        // Camel will be able to serialise this automatically to JSON
    	LOG.info("Thanks for your post, " + input.getName());
        return new ResponseType("Thanks for your post, " + input.getName() );
    }
}