package com.config;

import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.amazonaws.xray.entities.Subsegment;
import com.amazonaws.xray.spring.aop.AbstractXRayInterceptor;
import com.amazonaws.xray.spring.aop.BaseAbstractXRayInterceptor;

@Aspect
@Component
public class XRayInspector extends BaseAbstractXRayInterceptor {

	private static final Logger LOG = LoggerFactory.getLogger(XRayInspector.class);
	@Override
	protected Map<String, Map<String, Object>> generateMetadata(ProceedingJoinPoint pjp, Subsegment subsegment) {
		return super.generateMetadata(pjp, subsegment);
	}
	@Override
	@Pointcut("@within(com.amazonaws.xray.spring.aop.XRayEnabled) && bean(*)")
	protected void xrayEnabledClasses() {
		LOG.info("XRayInspector class");
	}
}