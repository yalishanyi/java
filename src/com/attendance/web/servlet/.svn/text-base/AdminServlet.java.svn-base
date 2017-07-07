package com.attendance.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.attendance.domain.Admin;
import com.attendance.service.AdminService;
import com.attendance.service.impl.AdminServiceImpl;
import com.attendance.utils.BeanFactory;

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
			// password=MD5Utils.md5(password);

			// 调用service完成登录
			//

			// UserService s=new UserServiceImpl();
			// User user=s.userlogin(username,password);
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
//		public String test(HttpServletRequest request, HttpServletResponse response)
//				throws ServletException, IOException {
//			System.out.println("使用test方法");
//			String name=request.getParameter("uname");
//			String uid=request.getParameter("uid");
//			String uphone=request.getParameter("uphone");
//			String umail=request.getParameter("umail");
//			
//			
//			
//		AdminService adminService=new AdminServiceImpl();
//		adminService.test(admin);
//			
//			
//			
//			System.out.println("获取的用户名是："+name);
//			System.out.println("获取的学号是："+uid);
//			System.out.println("获取的手机号："+uphone);
//			System.out.println("获取的邮箱是："+umail);
//			
//			
//			
//			
//			return null;
//		
//		}
		




}
