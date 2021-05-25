package com.app.dca.DevApplication.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dca.DevApplication.bean.Developer;
import com.app.dca.DevApplication.exception.UnknownDeveloperException;


public interface IDeveloperRepository extends JpaRepository<Developer, Integer>{

	Developer saveDeveloper(Developer dev);
	
	Developer updateDeveloper(Developer dev);
	
	Developer statusUpdate(Developer dev);
	
	Developer fetchDeveloper(int devId) throws UnknownDeveloperException;
	
	List<Developer> fetchAllDevelopers();
	
	/*
	    * finaAll
	    * save
	    * update
	    * delete
	    * 
	    * + 
	    * all methods from custom repo.
	    * 
	    * */
}