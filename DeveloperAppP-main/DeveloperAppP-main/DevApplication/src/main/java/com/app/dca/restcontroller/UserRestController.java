package com.app.dca.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dca.entity.UserD;
import com.app.dca.service.IUserService;
import com.app.dca.service.IUserServiceImpl;
@Validated
@RestController
@RequestMapping("/api")
public class UserRestController {
	@Autowired
	private IUserService service;
	
	
	
}