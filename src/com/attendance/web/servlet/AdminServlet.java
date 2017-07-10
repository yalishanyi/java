package com.attendance.web.servlet;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import com.attendance.converter.MyConverter;
import com.attendance.domain.Admin;
import com.attendance.domain.Attd;
import com.attendance.domain.StuAttd;
import com.attendance.domain.Team;
import com.attendance.domain.TeamAttd;
import com.attendance.domain.User;
import com.attendance.service.AdminService;
import com.attendance.service.impl.AdminServiceImpl;
import com.attendance.utils.BeanFactory;
import com.attendance.utils.JsonUtil;

import sun.awt.image.ImageWatched.Link;

/**
 * Servlet implementation class AdminServlet
 */
public class AdminServlet extends BaseServlet {


		/**
		 * 跳转到用户登录
		 * 
		 * @param request
		 * @param response
		 * @return
		 * @throws ServletException
		 * @throws IOException
		 */

		public String loginUI(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			return "login/asd.jsp";
		
		}

		/**
		 * 管理员登录实现
		 * 
		 * @param request
		 * @param response
		 * @return
		 * @throws Exception
		 */
		public String adminlogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
			System.out.println("准备登陆admin");
			// 获取用户名和密码
			String username = request.getParameter("aname");
			String password = request.getParameter("apwd");
			
			System.out.println("初始化");
//			AdminService a = (AdminService) BeanFactory.getBean("AdminService");
			AdminService a=new AdminServiceImpl();
			Admin admin = a.adminlogin(username, password);
			// 判断用户
			if (admin == null) {
				// 用户名密码不匹配
				request.setAttribute("msg", "用户名密码不匹配");
				request.getRequestDispatcher("login/asd.jsp").forward(request, response);

			} else{}

				// 将admin放入session中重定向
				request.getSession().setAttribute("admin", admin);
			response.sendRedirect(request.getContextPath()+"/admin/admin_index.jsp");
			return null;
		}
		
		public String addUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
			System.out.println("添加用户");
			// 获取用户名和密码
			
			String uname=request.getParameter("uname");
			String uid=request.getParameter("uid");
			//String upwd= request.getParameter("upwd");
			String umail= request.getParameter("umail");
			String uphone= request.getParameter("uphone");
			int attid=Integer.parseInt(request.getParameter("attid"));
			int teamid=Integer.parseInt( request.getParameter("teamid"));
			
			User user=new User();
			user.setUname(uname);
			user.setUid(uid);
			user.setUmail(umail);
			user.setUphone(uphone);
			user.setAttid(attid);
			user.setTeamid(teamid);
			System.out.println("id:"+user.getUid()+"\nname:"+user.getUname()+"\nmail:"+user.getUmail()+
					"\npwd:"+user.getUpwd()+"\nphoen:"+user.getUphone()+"\nteamid:"+user.getTeamid()+"\nisleader:"+
					user.getIsleader()+"\nattid:"+user.getAttid());
		
			System.out.println("初始化");
//			AdminService a = (AdminService) BeanFactory.getBean("AdminService");
			AdminService adminService=new AdminServiceImpl();
		//	adminService.addUser(uid, uname, upwd, umail, uphone, teamid, isleader,attid);
			adminService.addUser(user);
			return null;
		}
		public String deleteUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
			System.out.println("删除用户");
			String uid=request.getParameter("uid");
			AdminService adminService=new AdminServiceImpl();
			adminService.deleteUser(uid);
			return null;
		}
		public String alterUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
			System.out.println("修改用户");
			// 获取用户名和密码
			String idkey= request.getParameter("idkey");
			String uid=request.getParameter("uid");
			String uname=request.getParameter("uname");
			String upwd= request.getParameter("upwd");
			String umail= request.getParameter("umail");
			String uphone= request.getParameter("uphone");
			int teamid=Integer.parseInt( request.getParameter("teamid"));
			boolean isleader=Boolean.valueOf(request.getParameter("isleader")).booleanValue();
			int attrid=Integer.parseInt(request.getParameter("attid"));
			
		
			System.out.println("初始化");
//			AdminService a = (AdminService) BeanFactory.getBean("AdminService");
			AdminService adminService=new AdminServiceImpl();
			adminService.alterUser(idkey,uid, uname, upwd, umail, uphone, teamid, isleader,attrid);
			
			return null;
		}
		public String findUserByKey(HttpServletRequest request, HttpServletResponse response) throws Exception {
			//获取用户名
			String key=request.getParameter("key");
			AdminService as=new AdminServiceImpl();
			List<User> user=as.findUserByKey(key);
			String json=JsonUtil.list2json(user);
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);

			return null;		
		}
		public String findUserById(HttpServletRequest request, HttpServletResponse response)throws Exception {
			String uid=request.getParameter("uid");
			AdminService as=new AdminServiceImpl();
			User user=as.findUserById(uid);
			
			String json=JsonUtil.object2json(user);
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);

			return null;
		}
		public String findInfoByName(HttpServletRequest request, HttpServletResponse response) throws Exception {
			//获取用户名
			String username=request.getParameter("uname");
			
			AdminService as=new AdminServiceImpl();
			
			List<User> user=as.findUserByName(username);
			
			String json=JsonUtil.list2json(user);
			
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);

			return null;		
		}
		public String findUserByPwd(HttpServletRequest request, HttpServletResponse response)throws Exception {
			String upwd=request.getParameter("upwd");
			AdminService as=new AdminServiceImpl();
			List<User> user=as.findUserByPwd(upwd);
			
			String json=JsonUtil.list2json(user);
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);

			return null;
		}
		public String findUserByMail(HttpServletRequest request, HttpServletResponse response)throws Exception {
			String umail=request.getParameter("umail");
			AdminService as=new AdminServiceImpl();
			List<User> user=as.findUserByPwd(umail);
			
			String json=JsonUtil.list2json(user);
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);

			return null;
		}
		public String findUserByPhone(HttpServletRequest request, HttpServletResponse response)throws Exception {
			String uphone=request.getParameter("uphone");
			AdminService as=new AdminServiceImpl();
			List<User> user=as.findUserByPhone(uphone);
			
			String json=JsonUtil.list2json(user);
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);

			return null;
		}
		public String findUserByTeamid(HttpServletRequest request, HttpServletResponse response)throws Exception{
			int uteamid=Integer.parseInt(request.getParameter("uteamid"));
			AdminService as=new AdminServiceImpl();
			List<User> user=as.findUserByTeamid(uteamid);
			
			String json=JsonUtil.list2json(user);
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);

			return null;
		}
		public String findUserByIsleader(HttpServletRequest request, HttpServletResponse response)throws Exception {
			boolean isleader=Boolean.parseBoolean(request.getParameter("isleader"));
			AdminService as=new AdminServiceImpl();
			List<User> user=as.findUserByIsleader(isleader);
			
			String json=JsonUtil.list2json(user);
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);

			return null;
		}
		public String findUserByAttid(HttpServletRequest request, HttpServletResponse response)throws Exception {
			int attid=Integer.parseInt(request.getParameter("attid"));
			AdminService as=new AdminServiceImpl();
			User user=as.findUserByAttid(attid);
			
			String json=JsonUtil.object2json(user);//object2json(user);
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);

			return null;
		}
		public String findAttdById(HttpServletRequest request, HttpServletResponse response)throws Exception {
			String id=request.getParameter("id");
			AdminService as=new AdminServiceImpl();
			List<Attd> attds=as.findAttdById(id);
			
			String json=JsonUtil.list2json(attds);//object2json(user);
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);

			return null;
		}
		public String addTeam(HttpServletRequest request, HttpServletResponse response)throws Exception {
			int tid=Integer.parseInt(request.getParameter("tid"));
			String tname=request.getParameter("tname");
			AdminService as=new AdminServiceImpl();
			Team team=new Team();
			team.setTid(tid);
			team.setTname(tname);
			as.addTeam(team);
			

			return null;
		}
		
		public String checkAttendanceRecordById(HttpServletRequest request, HttpServletResponse response)throws Exception {
			String id=request.getParameter("id");
			AdminService as=new AdminServiceImpl();
			List<StuAttd> attds=as.checkAttendanceRecordById(id);
			String json=JsonUtil.list2json(attds);//object2json(user);
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);
			return null;
		}
		public String findStuAttdById(HttpServletRequest request, HttpServletResponse response)throws Exception {
			String id=request.getParameter("id");
			AdminService as=new AdminServiceImpl();
			List<StuAttd> attds=as.findStuAttdById(id);
			String json=JsonUtil.list2json(attds);//object2json(user);
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);
			return null;
		}
		public String findStuAttdByName(HttpServletRequest request, HttpServletResponse response)throws Exception {
			String name=request.getParameter("name");
			AdminService as=new AdminServiceImpl();
			List<StuAttd> attds=as.findStuAttdByName(name);
			String json=JsonUtil.list2json(attds);//object2json(user);
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);
			return null;
		}
		public String findStuAttdByAttid(HttpServletRequest request, HttpServletResponse response)throws Exception {
			int attid=Integer.parseInt(request.getParameter("attid"));
			AdminService as=new AdminServiceImpl();
			List<StuAttd> attds=as.findStuAttdByAttid(attid);
			String json=JsonUtil.list2json(attds);//object2json(user);
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);
			return null;
		}
		public String findStuAttdAll(HttpServletRequest request, HttpServletResponse response)throws Exception {
			
			AdminService as=new AdminServiceImpl();
			List<StuAttd> attds=as.findStuAttdAll();
			String json=JsonUtil.list2json(attds);//object2json(user);
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);
			return null;
		}
		public String findTeamAttdByTeamid(HttpServletRequest request, HttpServletResponse response)throws Exception {
			int teamid=Integer.parseInt(request.getParameter("teamid"));
			AdminService as=new AdminServiceImpl();
			List<TeamAttd> attds=as.findTeamAttdByTeamid(teamid);
			String json=JsonUtil.list2json(attds);//object2json(user);
			//写回去
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(json);
			System.out.println("返回的数据是："+json);
			return null;
		}
		public String attendanceDataImport (HttpServletRequest request, HttpServletResponse response) throws Exception {
			System.out.println("考勤数据导入");
			// 获取用户名和密码
			AdminService a=new AdminServiceImpl();
			String requestString= request.getParameter("attid");
			while(requestString!=null)
			{
				int attid=Integer.parseInt(requestString);
			    Date d=(Date) new MyConverter().convert( Date.class, request.getParameter("date"));
			    Time t=(Time) new MyConverter().convert( Time.class, request.getParameter("time"));
			    a.addAttendanceData(new Attd(attid,d,t));
			}
			a.attendanceStatistics();
			return null;
		}
		
		
		
		public String findAll(HttpServletRequest request, HttpServletResponse response) throws Exception {
			//1.调用service 查询所有 返回一个list
			AdminService as=(AdminService) BeanFactory.getBean("AdminService");
			List<Admin> list=as.findAll();
			
			//2.将list放入request域中 请求转发
			request.setAttribute("list", list);
			
			return null;
		}

		public void add(HttpServletRequest request, HttpServletResponse response) throws Exception {
			AdminService as=(AdminService) BeanFactory.getBean("AdminService");
			String aname = request.getParameter("aname");
			int aid = Integer.parseInt(request.getParameter("aid"));
			String apwd = request.getParameter("apwd");
			Admin admin = null;
			admin.setAid(aid);
			admin.setAname(aname);
			admin.setApwd(apwd);
			as.add(admin);
		}
		
		public void delete(HttpServletRequest request, HttpServletResponse response) throws Exception{
			AdminService as=(AdminService) BeanFactory.getBean("AdminService");
			int aid = Integer.parseInt(request.getParameter("aid"));
			as.delete(aid);
			
		}

		public void updatePwd(HttpServletRequest request, HttpServletResponse response) throws Exception{
			AdminService as=(AdminService) BeanFactory.getBean("AdminService");
			int aid = Integer.parseInt(request.getParameter("aid"));
			String apwd = request.getParameter("apwd");
			as.updatePwd(aid, apwd);
		}
}
