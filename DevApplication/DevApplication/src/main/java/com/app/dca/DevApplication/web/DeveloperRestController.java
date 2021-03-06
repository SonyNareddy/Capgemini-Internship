package com.app.dca.DevApplication.web;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dca.DevApplication.bean.Developer;
import com.app.dca.DevApplication.exception.UnknownDeveloperException;
import com.app.dca.DevApplication.service.IDeveloperService;

@Validated
@RestController
@RequestMapping("/api")
public class DeveloperRestController {
	@Autowired
	private IDeveloperService service;
	
	public DeveloperRestController() {
		System.out.println(" ----->> Product Rest Controller Constructor ");
	}
	
	@GetMapping("/devhome")
	public String homeRequest()
	{
		return "Welcome : My Developer Application "+LocalDateTime.now();
	}
	
	@PostMapping("/developer")
	public Developer insertDeveloper(@RequestBody  Developer dev)
	{
		service.addDeveloper(dev);
		return dev;
	}
	
	@PutMapping("/editdeveloper/{id}")
	public Developer editDeveloper(@RequestBody Developer dev, @PathVariable int id)
	{
		service.editDeveloper(dev, id);
		return dev;
	}
	
	@GetMapping("/getdeveloper/{id}")
	public Developer getDeveloper(@PathVariable int devId) throws UnknownDeveloperException
	{
		return service.getDeveloper(devId);
	}
	
	@GetMapping("/developers")
	public List<Developer> getAllDevelopers()
	{
		return service.getAllDevelopers();
	}
}
