package com.attendance.domain;

import java.sql.Date;
import java.sql.Time;

public class Attd {
    private int attid;

    private Date date;
    private Time time;
	public Attd(int attid, Date d, Time time) {
		super();
		this.attid = attid;
		this.date = d;
		this.time = time;
	}
	public Attd() {
		// TODO Auto-generated constructor stub
	}
	public int getAttid() {
		return attid;
	}
	public void setAttid(int attid) {
		this.attid = attid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date d) {
		this.date = d;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Attd [attid=" + attid + ", date=" + date + ", time=" + time + "]";
	}

 
}