package com.app.dca.DevApplication.service;

import com.app.dca.DevApplication.bean.User;

public interface IUserService {
	
	User login(User user);
	
	User logout(User user);
}