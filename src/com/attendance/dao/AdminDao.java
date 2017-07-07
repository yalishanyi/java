package com.attendance.dao;

import com.attendance.domain.Admin;

public interface AdminDao {
	public void add(Admin admin) throws Exception;

	
	public Admin getByAdminNameAndPwd(String username, String password) throws Exception;

}
