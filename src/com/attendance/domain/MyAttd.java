package com.attendance.domain;

import java.sql.Date;
import java.sql.Time;

public class MyAttd {
	private String uid;
	private Date date;
	private Time minTime;
	private Time maxTime;
	public String getUid() {
		return uid;
	}
	public void setUid(String attid) {
		this.uid = attid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getMinTime() {
		return minTime;
	}
	public void setMinTime(Time minTime) {
		this.minTime = minTime;
	}
	public Time getMaxTime() {
		return maxTime;
	}
	public void setMaxTime(Time maxTime) {
		this.maxTime = maxTime;
	}
	@SuppressWarnings("deprecation")
	public double getStayTime() {
		int staySeconds= ((maxTime.getHours()-minTime.getHours())*60+maxTime.getMinutes()-minTime.getMinutes())*60+maxTime.getSeconds()-minTime.getSeconds();
		return staySeconds/3600.0;
	}
	@Override
	public String toString() {
		return "MyAttd [uid=" + uid + ", date=" + date + ", minTime=" + minTime + ", maxTime=" + maxTime + "]";
	}
}
