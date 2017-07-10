package com.attendance.domain;


import java.sql.Date;




public class StuAttd {
	private String stuid;
	private boolean attendance;
	private Date date;
	
	public StuAttd(String stuid, boolean  attendance, Date date) {
		super();
		this.stuid = stuid;
		this.date = date;
		this. attendance =  attendance;
	}
	public StuAttd() {
		// TODO Auto-generated constructor stub
	}
	public String getStuid() {
		return stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	public boolean isAttendance() {
		return attendance;
	}

	public void setAttendance(boolean attendance) {
		this.attendance = attendance;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "StuAttd [stuid=" + stuid + ", date=" + date + ",  attendance=" +  attendance + "]";
	} 
	
}
