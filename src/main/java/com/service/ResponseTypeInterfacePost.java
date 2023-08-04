package com.service;

import com.entity.PostRequestType;
import com.entity.ResponseType;

@FunctionalInterface
public interface ResponseTypeInterfacePost {
	ResponseType response(PostRequestType input);
}
