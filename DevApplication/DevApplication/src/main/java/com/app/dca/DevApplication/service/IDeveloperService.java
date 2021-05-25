package com.app.dca.DevApplication.service;

import java.util.List;

import com.app.dca.DevApplication.bean.Developer;
import com.app.dca.DevApplication.exception.UnknownDeveloperException;

public interface IDeveloperService {

	Developer addDeveloper(Developer dev);
	
	Developer editDeveloper(Developer dev,int id);
	
	Developer statusUpdate(Developer dev);	// Block/Unblock
	
	Developer getDeveloper(int devId) throws UnknownDeveloperException;
	
	List<Developer> getAllDevelopers();
}

