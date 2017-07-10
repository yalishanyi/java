package com.attendance.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.attendance.domain.User;
import com.attendance.service.UserService;
import com.attendance.service.impl.UserServiceImpl;
import com.attendance.utils.BeanFactory;
import com.attendance.utils.JsonUtil;

/**
 * 和用户相关的servlet方法
 * 
 */
public class UserServlet extends BaseServlet {

	// public String add(HttpServletRequest request, HttpServletResponse
	// response) throws ServletException, IOException {
	//// System.out.println("userAdd");
	// return null;
	// }
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
	 * 用户登录实现
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public String userlogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("准备登陆user");
		
		// 获取用户名和密码
		String username = request.getParameter("uname");
		String password = request.getParameter("upwd");
		// password=MD5Utils.md5(password);

		// 调用service完成登录

		UserService s = new UserServiceImpl();
		User user = s.userlogin(username, password);
		// 判断用户
		if (user == null) {
			// 用户名密码不匹配
			request.setAttribute("msg", "用户名密码不匹配");
			request.getRequestDispatcher("login/asd.jsp").forward(request, response);

		} else{}
			// {
			// //判断是否激活
			// if(Constant.USER_IS_ACTIVE!=user.getState()){
			// request.setAttribute("msg", "用户未激活");
			// return "jsp/login.jsp";
			// }
			// }
			// 将user放入session中重定向
		
		
		request.getSession().setAttribute("user", user);
		
		response.sendRedirect(request.getContextPath()+"/user/user_index.jsp");
		return null;
	}
	
	
	
	/**
	 * 用户信息修改
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception 
	 */
	public String updateinfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//1.封装数据
		User user = new User();
		
		BeanUtils.populate(user, request.getParameterMap());
		
		UserService s=new UserServiceImpl();
		s.update(user);
		
		
		
		return "/user/index.jsp";
	}
	
	public String findInfoByName(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//获取用户名
		String username=request.getParameter("uname");
		
		UserService us=new UserServiceImpl();
		
		User user=us.findByName(username);
		
		String json=JsonUtil.object2json(user);
		
		//写回去
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(json);
		System.out.println("返回的数据是："+json);
		
		
		return null;
		
		
		
	}
	
	
}
