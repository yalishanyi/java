package com.attendance.dao;

import com.attendance.domain.User;

public interface UserDao {

	public void add(User user) throws Exception;

	public User getByUsernameAndPwd(String username, String password) throws Exception;

	public void update(User user) throws Exception;

	public User findByName(String username)throws Exception;

}
