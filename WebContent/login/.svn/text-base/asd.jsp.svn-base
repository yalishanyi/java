<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>网站登录</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/login/login.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/login/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/login/login.js"></script>
</head>
<body style="overflow: hidden">
	<div class="pagewrap">
		<div class="main">
			<div class="header"></div>
			<div id="zero" class="content">

				<div class="con_left"></div>
				<div class="con_right">
					<div class="con_r_top">
						<a href="javascript:;" class="left"
							style="color: rgb(153, 153, 153); border-bottom-width: 2px; border-bottom-style: solid; border-bottom-color: rgb(222, 222, 222);">管理员登录</a>
						<a href="javascript:;" class="right"
							style="color: rgb(51, 51, 51); border-bottom-width: 2px; border-bottom-style: solid; border-bottom-color: rgb(46, 85, 142);">用户登录</a>
					</div>
					<ul>

						<li class="con_r_left" style="display: none;">

							<form id="form2" method="post"
								action="${pageContext.request.contextPath}/admin?method=adminlogin"
								autocomplete="off">
								<div class="user">
									<div>
										<span class="user-icon"></span> <input type="text"
											id="username2" name="aname" placeholder="输入账号">
									</div>

									<div>
										<span class="mima-icon"></span> <input type="password"
											id="password2" name="apwd" placeholder="输入密码">
									</div>

									<div>
										<span class="code-icon"></span> <input type="hidden" id="code2"
											name="code" value="1">
									</div>


								</div>
								<br>
								<button id="btn_Login2" type="submit">登 录</button>
							</form>
						</li>


						<li class="con_r_right" style="display: block;">

							<form id="form1" method="post"
								action="${pageContext.request.contextPath}/user?method=userlogin"
								autocomplete="off">
								<div class="user">
									<div>
										<span class="user-icon"></span> <input type="text"
											id="username" name="uname" placeholder="输入账号">
									</div>

									<div>
										<span class="mima-icon"></span> <input type="password"
											id="password" name="upwd" placeholder="输入密码">
									</div>

									<div>
										<span class="code-icon"></span> <input type="hidden" id="code"
											name="code" value="0">
									</div>



								</div>
								<br>
								<button id="btn_Login" type="submit">登 录</button>
							</form>
						</li>
					</ul>

				</div>


			</div>
		</div>
	</div>

</body>

</html>