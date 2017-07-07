package com.attendance.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.attendance.dao.AdminDao;
import com.attendance.domain.Admin;
import com.attendance.domain.User;
import com.attendance.utils.DataSourceUtils;

public class AdminDaoImpl implements AdminDao {

	@Override
	public void add(Admin admin) throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="insert into admin values(?,?,?)";
		qRunner.update(sql,admin.getAid(),admin.getAname(),admin.getApwd());

	}

	@Override
	public Admin getByAdminNameAndPwd(String username, String password) throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from admin where aname=? and apwd=? limit 1";
		Admin result;
		 result= qRunner.query(sql,new BeanHandler<>(Admin.class),username,password);
			System.out.println("获取的用户是："+result.getAname());
		 System.out.println("获取的密码是："+result.getApwd());
		 return result;
		
		
		
	}

}
