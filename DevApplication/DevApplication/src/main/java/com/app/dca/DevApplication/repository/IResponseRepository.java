package com.app.dca.DevApplication.repository;
import java.util.List;

import com.app.dca.DevApplication.bean.Response;
import com.app.dca.DevApplication.exception.UnknownDeveloperException;
import com.app.dca.DevApplication.exception.UnknownFeedException;
import com.app.dca.DevApplication.exception.UnknownResponseException;

public interface IResponseRepository {
	
	Response saveResponse(Response resp);
	
	Response updateResponse(Response resp);
	
	Response removeResponse(int respId) throws UnknownResponseException;
	
	Response likeResponse(int respId);
	
	List<Response> fetchResponseByFeed(int feedId) throws UnknownFeedException;
	
	List<Response> fetchResponseByDeveloper(int devId) throws UnknownDeveloperException;
}