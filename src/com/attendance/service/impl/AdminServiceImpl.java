package com.attendance.service.impl;

import com.attendance.dao.AdminDao;
import com.attendance.dao.impl.AdminDaoImpl;
import com.attendance.domain.Admin;
import com.attendance.domain.Attd;
import com.attendance.domain.StuAttd;
import com.attendance.domain.Team;
import com.attendance.domain.TeamAttd;
import com.attendance.domain.User;
import com.attendance.service.AdminService;
import com.attendance.utils.BeanFactory;

import sun.awt.image.ImageWatched.Link;

import java.util.List;

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
		public boolean addAttendanceData(Attd attd)throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service导入考勤数据");
			return dao.addAttendanceData(attd);
		}
		public boolean addUser(String uid, String uname, String upwd, String umail, String uphone,int teamid,boolean isleader,int attrid) throws Exception{
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service添加用户");
			return dao.addUser(uid, uname, upwd, umail, uphone, teamid, isleader,attrid);
		}
		public boolean addUser(User user) throws Exception{
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service添加用户");
			return dao.addUser(user);
		}
		public boolean deleteUser(String uid)throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service删除用户");
			return dao.deleteUser(uid);

			
		}
		public boolean alterUser(String idkey,String uid, String uname, String upwd, String umail, String uphone,int teamid,boolean isleader,int attrid) throws Exception{
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service修改用户");
			return dao.alterUser(idkey,uid, uname, upwd, umail, uphone, teamid, isleader,attrid);
		}
		public List<User> findUserByKey(String key)throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service通过关键字查找用户");
			return dao.findUserByKey(key);
			
		}
		public User findUserById(String uid) throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service通过id查找用户");
			return dao.findUserById(uid);
		}
		public List<User> findUserByName(String uname)throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service通过name查找用户");
			return dao.findUserByName(uname);
		}
		public List<User> findUserByPwd(String upwd)throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service通过pwd查找用户");
			return dao.findUserByPwd(upwd);
		}
		public List<User> findUserByMail(String umail)throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service通过mail查找用户");
			return dao.findUserByMail(umail);
		}
		public List<User> findUserByPhone(String uphone)throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service通过phone查找用户");
			return dao.findUserByPhone(uphone);
		}
		public List<User> findUserByTeamid(int uteamid)throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service通过teamid查找用户");
			return dao.findUserByTeamid(uteamid);
		}
		public List<User> findUserByIsleader(boolean isleader)throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service通过isleader查找用户");
			return dao.findUserByIsleader(isleader);
		}
		public User findUserByAttid(int attid)throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service通过attid查找用户");
			return dao.findUserByAttid(attid);
		}
		@Override
		public boolean addTeam(Team team) throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service增加team");
			return dao.addTeam(team);
			
		}
		public List<Attd> findAttdById(String id)throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service通过id查找用户考勤记录");
			return dao.findAttdById(id);
		}
		public List<StuAttd> checkAttendanceRecordById(String id) throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service通过attid查找用户");
			return dao.checkAttendanceRecordById(id);
		}
		@Override
		public List<StuAttd> findStuAttdById(String id) throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service通过id查找考勤情况");
			return dao.findStuAttdById(id);
		}

		public List<StuAttd> findStuAttdByName(String name)throws Exception{
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service通过name查找考勤情况");
			return dao.findStuAttdByName(name);
		}
		public List<StuAttd> findStuAttdByAttid(int attid)throws Exception{
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service通过attid查找考勤情况");
			return dao.findStuAttdByAttid(attid);
		}
		@Override
		public List<StuAttd> findStuAttdAll() throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service查看所有考勤情况");
			return dao.findStuAttdByAll();
		}
		@Override
		public List<TeamAttd> findTeamAttdByTeamid(int teamid) throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service通过teamid查找队伍考勤情况");
			return dao.findTeamAttdByTeamid(teamid);
		}
		@Override
		public void attendanceStatistics() throws Exception {
			AdminDao dao=new AdminDaoImpl();
			System.out.println("使用service进行考勤统计");
			dao.attendanceStatistics();
		}
		
		
		
		@Override
		public List<Admin> findAll() throws Exception {
	AdminDao adao=(AdminDao) BeanFactory.getBean("AdminDao");
			
			return adao.findAll();
			
		}

		@Override
		public void add(Admin admin) throws Exception {
			AdminDao adao=(AdminDao) BeanFactory.getBean("AdminDao");
			adao.add(admin);
		}

		@Override
		public void delete(int aid) throws Exception {
			AdminDao adao=(AdminDao) BeanFactory.getBean("AdminDao");
			adao.delete(aid);
			
		}

		@Override
		public void updatePwd(int aid, String apwd) throws Exception {
			AdminDao adao=(AdminDao) BeanFactory.getBean("AdminDao");
			adao.updatePwd(aid, apwd);
		}
}
