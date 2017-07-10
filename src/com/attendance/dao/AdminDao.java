package com.attendance.dao;

import com.attendance.domain.Admin;
import com.attendance.domain.Attd;
import com.attendance.domain.StuAttd;
import com.attendance.domain.Team;
import com.attendance.domain.TeamAttd;
import com.attendance.domain.User;

import java.util.List;

public interface AdminDao {
	public void add(Admin admin) throws Exception;

	
	public Admin getByAdminNameAndPwd(String username, String password) throws Exception;
	public boolean addAttendanceData(Attd attd)throws Exception ;
	public boolean addUser(String uid, String uname, String upwd, String umail, String uphone,int teamid,boolean isleader,int attrid) throws Exception;
	public boolean deleteUser(String uid)throws Exception;
	public boolean alterUser(String uid,String idkey, String uname, String upwd, String umail, String uphone,int teamid,boolean isleader,int attrid) throws Exception;
	public List<User> findUserByKey(String key)throws Exception ;
	public User findUserById(String uid)throws Exception ;
	public List<User> findUserByName(String uname)throws Exception ;
	public List<User> findUserByPwd(String upwd)throws Exception ;
	public List<User> findUserByMail(String umail)throws Exception ;
	public List<User> findUserByPhone(String uphone)throws Exception ;
	public List<User> findUserByTeamid(int uteamid)throws Exception ;
	public List<User> findUserByIsleader(boolean isleader)throws Exception ;
	public User findUserByAttid(int attid)throws Exception ;
	public List<Attd> findAttdById(String id)throws Exception;
	public List<StuAttd> checkAttendanceRecordById(String id)throws Exception;
	public boolean addUser(User user)throws Exception;
	public boolean addTeam(Team team)throws Exception;
	public List<StuAttd> findStuAttdById(String id)throws Exception;
	public List<StuAttd> findStuAttdByName(String name)throws Exception;
	public List<StuAttd> findStuAttdByAttid(int attid)throws Exception;
	public List<StuAttd> findStuAttdByAll()throws Exception;
	public List<TeamAttd> findTeamAttdByTeamid(int teamid)throws Exception;

	public List<Attd> findAttdAll()throws Exception;
	public Object attendanceStatistics()throws Exception;
	
	
	
	
	
	
	public List<Admin> findAll() throws Exception;


	public void delete(int aid) throws Exception;


	public void updatePwd(int aid, String apwd) throws Exception;

}
