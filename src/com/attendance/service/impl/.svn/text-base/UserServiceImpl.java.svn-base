package com.attendance.service.impl;

import com.attendance.dao.UserDao;
import com.attendance.dao.impl.UserDaoImpl;
import com.attendance.domain.User;
import com.attendance.service.UserService;
import com.attendance.utils.BeanFactory;

public class UserServiceImpl implements UserService {
	
/**
 * 用户登录
 * @throws Exception 
 */
	public User userlogin(String username, String password) throws Exception {
		UserDao dao=new UserDaoImpl();
		System.out.println("使用service");
		return dao.getByUsernameAndPwd(username,password);

		
	}

@Override
public void update(User user) throws Exception {
	UserDao dao=new UserDaoImpl();
	dao.update(user);
	
}

@Override
public User findByName(String username) throws Exception {
	UserDao dao=(UserDao)BeanFactory.getBean("UserDao");
	return dao.findByName(username);
	
	
}
 
}
