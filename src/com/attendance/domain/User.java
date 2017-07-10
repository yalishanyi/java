package com.attendance.domain;


/**
 * `uid` int not null auto_increment,
  `uname` varchar(45) null,
  `upwd` varchar(45) null,
  `umail` varchar(45) null,
  `uphone` varchar(45) null,
  `teamid` int(10) not null,
  `isleader` tinyint(1) zerofill not null,
  `attid` int not null,
 * Created by Administrator on 2017/7/2.
 */
public class User  {
    private String uid;
    private String uname=null;
    private String upwd="123456";
    private String umail=null;
    private String uphone=null;
    private int teamid;
    private boolean isleader=false;
    private int attid;
    public User(String uid, String uname, String upwd, String umail, String uphone,int teamid,boolean isleader,int attrid) {
		this.uid=uid;
		this.uname=uname;
		this.upwd=upwd;
		this.umail=umail;
		this.uphone=uphone;
		this.teamid=teamid;
		this.isleader=isleader;
		this.attid=attrid;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", umail=" + umail + ", uphone=" + uphone
				+ ", teamid=" + teamid + ", isleader=" + isleader + ", attid=" + attid + "]";
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUmail() {
		return umail;
	}
	public void setUmail(String umail) {
		this.umail = umail;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public boolean getIsleader() {
		return isleader;
	}
	public void setIsleader(boolean isleader) {
		this.isleader = isleader;
	}
	public int getAttid() {
		return attid;
	}
	public void setAttid(int attrid) {
		this.attid = attrid;
	}

    
	
}
