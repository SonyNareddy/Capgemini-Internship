package com.app.dca.DevApplication.service;
import java.util.List;

import com.app.dca.DevApplication.bean.Response;
import com.app.dca.DevApplication.exception.UnknownDeveloperException;
import com.app.dca.DevApplication.exception.UnknownFeedException;
import com.app.dca.DevApplication.exception.UnknownResponseException;


public interface IResponseService {
	
	Response addResponse(Response resp);
	
	Response editResponse(Response resp);
	
	Response removeResponse(int respId) throws UnknownResponseException;
	
	Response likeResponse(int respId);
	
	List<Response> getResponseByFeed(int feedId) throws UnknownFeedException;
	
	List<Response> getResponseByDeveloper(int devId) throws UnknownDeveloperException;
}