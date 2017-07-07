package com.attendance.dao.impl;



import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.attendance.dao.UserDao;
import com.attendance.domain.User;
import com.attendance.utils.DataSourceUtils;


public class UserDaoImpl implements UserDao {

	public void add(User user) throws Exception{
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="insert into user values(?,?,?,?,?,?,?,?,?,?)";
		qRunner.update(sql,user.getUid(),user.getUname(),user.getUpwd(),
				user.getUname(),user.getUmail(),user.getUphone());
		
	}

	public User getByUsernameAndPwd(String username, String password) throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from user where uname=? and upwd=? ";
		User result;
		result= qRunner.query(sql,new BeanHandler<>(User.class),username,password);
		System.out.println("获取的用户是："+result.getUname());
		System.out.println("获取的密码是："+result.getUpwd());
		 return result;
	}

	@Override
	public void update(User user) throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="update user set uphone=?,uemail=? where uid=?";
		qRunner.update(sql,user.getUphone(),user.getUmail(),user.getUid());
		
		
	}

	@Override
	public User findByName(String username) throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from user where uname=username";
		return qRunner.query(sql, new BeanHandler<>(User.class),username);
		
	}

}
