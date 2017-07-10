package com.attendance.domain;

import java.util.Date;

public class TeamAttd {
	private int teamid;
	private boolean teamattendance;
	private Date date;
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public boolean isTeamattendance() {
		return teamattendance;
	}
	public void setTeamattendance(boolean teamattendance) {
		this.teamattendance = teamattendance;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public TeamAttd(int teamid, boolean teamattendance, Date date) {
		super();
		this.teamid = teamid;
		this.teamattendance = teamattendance;
		this.date = date;
	}
	public TeamAttd() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TeamAttd [teamid=" + teamid + ", teamattendance=" + teamattendance + ", date=" + date + "]";
	}
	
}
