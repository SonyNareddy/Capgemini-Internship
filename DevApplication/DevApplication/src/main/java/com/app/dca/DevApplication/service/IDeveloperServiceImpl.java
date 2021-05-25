package com.app.dca.DevApplication.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.dca.DevApplication.bean.Developer;
import com.app.dca.DevApplication.exception.UnknownDeveloperException;
import com.app.dca.DevApplication.repository.IDeveloperRepository;

@Service
public class IDeveloperServiceImpl implements IDeveloperService{

	@Autowired
	private  IDeveloperRepository repo;
	
	@Override
	@Transactional
	public Developer addDeveloper(Developer dev)
	{
		repo.save(dev);
		return dev;
	}
	
	@Override
	public Developer editDeveloper(Developer dev,int id)
	{
		Optional<Developer> up = repo.findById(id);
		Developer developer = null;
		if(up.isPresent())
		{
			developer = up.get();
			developer.setName(dev.getName());
			developer.setEmail(dev.getEmail());
			developer.setSkillLevel(dev.getSkillLevel());
			developer.setMemberSince(dev.getMemberSince());
			developer.setFeeds(dev.getFeeds());
			developer.setUser(dev.getUser());
			developer.setTotalFeeds(dev.getTotalFeeds());
			developer.setReputation(dev.getReputation());
			developer.setVerified(dev.isVerified());
			developer.setBlocked(dev.isBlocked());
			return repo.save(developer);
		}
		return developer;
	}	
	
	@Override
	public Developer statusUpdate(Developer dev)
	{
		return null;
	}
	
	@Override
	public Developer getDeveloper(int devId) throws UnknownDeveloperException
	{
		return repo.findById(devId).get();
	}
	
	@Override
	public List<Developer> getAllDevelopers()
	{
		return repo.findAll();
	}
}
