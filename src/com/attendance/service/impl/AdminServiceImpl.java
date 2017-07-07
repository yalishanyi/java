package com.attendance.service.impl;

import com.attendance.dao.AdminDao;
import com.attendance.dao.UserDao;
import com.attendance.dao.impl.AdminDaoImpl;
import com.attendance.dao.impl.UserDaoImpl;
import com.attendance.domain.Admin;
import com.attendance.domain.User;
import com.attendance.service.AdminService;

public class AdminServiceImpl implements AdminService {

	/**
	 * 管理员登录
	 * @throws Exception 
	 */
		public Admin adminlogin(String username, String password) throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service");
			return dao.getByAdminNameAndPwd(username,password);

			
		}

	

}
