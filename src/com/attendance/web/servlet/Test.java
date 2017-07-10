package com.attendance.web.servlet;

import java.sql.Time;
import java.sql.Date;
import com.attendance.converter.MyConverter;
import com.attendance.domain.Attd;
import com.attendance.domain.User;
import com.attendance.service.AdminService;
import com.attendance.service.impl.AdminServiceImpl;


public class Test {

	public static void main(String[] args) {
		AdminService as=new AdminServiceImpl();
		User user=new User("3838", "张三", "121", "kjdfk@qq.com", "110",3,false,3838);
		try {
			Date date=(Date) new MyConverter().convert( Date.class, "2014-2-26");
			System.out.println(date);
			date.setDate(date.getDate()+6);
			java.util.Date date2=date;
		
			System.out.println(date2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
