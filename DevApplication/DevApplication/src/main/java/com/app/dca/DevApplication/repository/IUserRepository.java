package com.app.dca.DevApplication.repository;

import com.app.dca.DevApplication.bean.User;

public interface IUserRepository {
	
	User login(User user);
	
	User logout(User user);
}
