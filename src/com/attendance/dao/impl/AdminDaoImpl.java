package com.attendance.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.attendance.dao.AdminDao;
import com.attendance.domain.Admin;
import com.attendance.domain.Attd;
import com.attendance.domain.MyAttd;
import com.attendance.domain.StandardOfAttendance;
import com.attendance.domain.StuAttd;
import com.attendance.domain.Team;
import com.attendance.domain.TeamAttd;
import com.attendance.domain.User;

import java.sql.Date;
import java.util.List;
import com.attendance.utils.DataSourceUtils;
import com.sun.org.apache.bcel.internal.generic.NEW;

import sun.awt.image.ImageWatched.Link;

public class AdminDaoImpl implements AdminDao {

	@Override
	public void add(Admin admin) throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql=" insert into admin values(?,?,?)";
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
	public boolean addAttendanceData(Attd attd)throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql=" insert  into attd values(?,?,?)";
		boolean result;
		qRunner.update(sql,attd.getAttid(), attd.getDate(), attd.getTime());
		result=true;
		System.out.println("attid:"+attd.getAttid()+" date:"+attd.getDate()+" time:"+attd.getTime());
		 return result;
	}

		
	public boolean addUser(String uid, String uname, String upwd, String umail, String uphone,int teamid,boolean isleader,int attrid) throws Exception{
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="insert  into user values(?,?,?,?,?,?,?,?)";
		boolean result;
		qRunner.update(sql,uid, uname, upwd, umail, uphone, teamid, isleader,attrid);
		result=true;
		
		sql="update team set uno =uno+1 where tid in(select DISTINCT teamid from user where uid=?)";
		qRunner.update(sql,uid);
		 return result;
	}
	@Override
	public boolean addUser(User user) throws Exception {
		
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		
		String sql="insert  into user values(?,?,?,?,?,?,?,?)";
		boolean result;
		qRunner.update(sql,user.getUid(), user.getUname(), user.getUpwd(), 
				user.getUmail(), user.getUphone(), user.getTeamid(), user.getIsleader(),user.getAttid());
		result=true;
		System.out.println("id:"+user.getUid()+"\nname:"+user.getUname()+"\nmail:"+user.getUmail()+
				"\npwd:"+user.getUpwd()+"\nphoen:"+user.getUphone()+"\nteamid:"+user.getTeamid()+"\nisleader:"+
				user.getIsleader()+"\nattid:"+user.getAttid());
		sql="update team set tno =tno+1 where tid =(select DISTINCT teamid from user where uid=?)";
		qRunner.update(sql,user.getUid());
		
		 return result;
	}
	public boolean deleteUser(String uid)throws Exception{
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="update team set tno =tno-1 where tid =(select DISTINCT teamid from user where uid=?)";
		qRunner.update(sql,uid);
		sql="delete from user where uid=? ";
		boolean result;
		qRunner.update(sql,uid);
		result=true;
		 return result;
	}
	public boolean alterUser(String idkey,String uid, String uname, String upwd, String umail, String uphone,int teamid,boolean isleader,int attrid) throws Exception{
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="update user set uid=? , uname=? , upwd=?, umail=?, uphone=? , teamid=? ,isleader=?,attid=? where uid=?";
		boolean result;
		qRunner.update(sql,uid, uname, upwd, umail, uphone, teamid, isleader,attrid,idkey);
		result=true;
		 return result;
	}
	public List<User> findUserByKey(String key)throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select DISTINCT * from user where uid=? or uname=? or umail=? or uphone=? or teamid=? or attid=? ";
		int ikey=Integer.parseInt(key);
		List<User> result=null;
		 result= qRunner.query(sql,new BeanListHandler<>(User.class),key,key,key,key,ikey,ikey);
		 return result;
	}
	public User findUserById(String uid)throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from user where uid=? limit 1";
		User result=null;
		 result= qRunner.query(sql,new BeanHandler<>(User.class),uid);
		 return result;
	}
	public List<User> findUserByName(String uname)throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select DISTINCT * from user where uname=? ";
	
		List<User> result=null;
		 result= qRunner.query(sql,new BeanListHandler<>(User.class),uname);
		 return result;
	}
	public List<User> findUserByPwd(String upwd)throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select DISTINCT * from user where upwd=? ";
		List<User> result=null;
		 result= qRunner.query(sql,new BeanListHandler<>(User.class),upwd);
		 return result;
	}
	public List<User> findUserByMail(String umail)throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select DISTINCT * from user where umail=? ";
		List<User> result=null;
		 result= qRunner.query(sql,new BeanListHandler<>(User.class),umail);
		 return result;
	}
	public List<User> findUserByPhone(String uphone)throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select DISTINCT * from user where uphone=? ";
		List<User> result=null;
		 result= qRunner.query(sql,new BeanListHandler<>(User.class),uphone);
		 return result;
	}
	public List<User> findUserByTeamid(int uteamid)throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select DISTINCT * from user where uteamid=? ";
		List<User> result=null;
		 result= qRunner.query(sql,new BeanListHandler<>(User.class),uteamid);
		 return result;
	}
	public List<User> findUserByIsleader(boolean isleader)throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select DISTINCT * from user where isleader=? ";
		List<User> result=null;
		 result= qRunner.query(sql,new BeanListHandler<>(User.class),isleader);
		 return result;
	}
	public User findUserByAttid(int attid)throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select  * from user where attid=? limit 1";
		User result=null;
		 result= qRunner.query(sql,new BeanHandler<>(User.class),attid);
		 return result;
	}
	@Override
	public boolean addTeam(Team team) throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="insert  into team values(?,?,?)";
		boolean result;
		qRunner.update(sql,team.getTid(), team.getTname(), team.getTno());
		result=true;
		
		return result;
	}
	public List<Attd> findAttdById(String id)throws Exception{
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from attd where attid in (select attid from user where uid=?) ";
		List<Attd> result=null;
		 result= qRunner.query(sql,new BeanListHandler<>(Attd.class),id);
		 return result;
	}
	public List<Attd> findAttdAll()throws Exception{
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from attd group by attid";
		List<Attd> result=null;
		 result= qRunner.query(sql,new BeanListHandler<>(Attd.class));
		 return result;
	}

	@Override
	public List<StuAttd> checkAttendanceRecordById(String id) throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select* from attd where attid in(select attid from user where uid=?)";
		List<StuAttd> result=null;
		 result= qRunner.query(sql,new BeanListHandler<>(StuAttd.class),id);
		return result;
	}
	@Override
	public List<StuAttd> findStuAttdById(String id) throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		
		String sql="select DISTINCT * from stuattd where stuid=?";
		List<StuAttd> result=null;
		 result= qRunner.query(sql,new BeanListHandler<>(StuAttd.class),id);
		 System.out.println("id="+id);
		return result;
	}

	@Override
	public List<StuAttd> findStuAttdByName(String name) throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from stuattd where stuid in (select uid from user where uname=? )";
		List<StuAttd> result=null;
		 result= qRunner.query(sql,new BeanListHandler<>(StuAttd.class),name);
		 System.out.println("name:"+name);
		return result;
	}

	@Override
	public List<StuAttd> findStuAttdByAttid(int attid) throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql=" select * from stuattd where stuid in (select uid from user where attid=? limit 1) ";
		List<StuAttd> result=null;
		result= qRunner.query(sql,new BeanListHandler<>(StuAttd.class),attid);
		System.out.println("attid"+attid);
		return result;
	}

	@Override
	public List<StuAttd> findStuAttdByAll() throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from stuattd";
		List<StuAttd> result=null;
		 result= qRunner.query(sql,new BeanListHandler<>(StuAttd.class));
		 System.out.println("所有人的考勤数据");
		return result;
	}

	@Override
	public List<TeamAttd> findTeamAttdByTeamid(int teamid) throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select DISTINCT * from teamattd where teamid=?";
		List<TeamAttd> result=null;
		 result= qRunner.query(sql,new BeanListHandler<>(TeamAttd.class),teamid);
		 System.out.println("id="+teamid);
		return result;
	}

	@Override
	public Object attendanceStatistics() throws Exception {
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select uid,date, minTime, maxTime  from user, (select DISTINCT attid,date,min(time) as minTime,max(time) as maxTime from attd group by attid,date)as attds where user.attid=attds.attid";
		List<MyAttd> atts= qRunner.query(sql,new BeanListHandler<>(MyAttd.class));
		for (MyAttd myAttd : atts) {
			StuAttd stuAttd=new StuAttd();
			stuAttd.setStuid(myAttd.getUid());
			stuAttd.setDate(myAttd.getDate());
			stuAttd.setAttendance(myAttd.getStayTime()>=StandardOfAttendance.STAYTIME);
			addStuAttd(stuAttd);
		}
		sql="select teamid,teamattendance, date  from user, (select DISTINCT attid,date,min(time) as minTime,max(time) as maxTime from attd group by attid,date)as attds where user.attid=attds.attid";
	//	List<> = qRunner.query(sql,new BeanListHandler<>(MyAttd.class));
		System.out.println("考勤集合："+atts);
		return null;
	}

	private void addStuAttd(StuAttd stuAttd) throws Exception{
		QueryRunner qRunner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="insert into stuattd values(?,?,?)";
		qRunner.update(sql,stuAttd.getStuid(),stuAttd.isAttendance(),stuAttd.getDate());
		
	}
	
	
	
	@Override
	public List<Admin> findAll() throws Exception{
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from admin";
		return qr.query(sql, new BeanListHandler<>(Admin.class));
	}

	@Override
	public void delete(int aid) throws Exception {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="delete from admin where aid = ?";
		qr.update(sql, aid);
		
	}

	@Override
	public void updatePwd(int aid, String apwd) throws Exception{
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "update admin set apwd = ? where aid = ?";
		qr.update(sql, apwd, aid);
	}
	
	

	
}

	


