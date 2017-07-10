<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/admin/css/Login.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/admin/css/around.css" />

</head>
<body>
<div class="body">
	<div class="navi_body">
		<div class="navi_head">
			<div style="width:80%; margin-left:auto; margin-right:auto;">
				<span>
					<p class="navi_title">首页</p>
				</span>
				<span>
					<p class="navi_title">用户管理</p>
					<p><a href="javascript:;" class="left1" >添加用户</a></p>
					<p><a href="javascript:;" class="left2" >添加团队</a></p>
					<p><a href="javascript:;" class="left3" >导入数据</a></p>
				</span>
				<span>
					<p class="navi_title">考勤情况</p>
					<p><a href="javascript:;" class="left4" >团队考勤情况</a></p>
					<p><a href="javascript:;" class="left5" >个人考勤情况</a></p>
					<p><a href="javascript:;" class="left8" style="display: none;">显示所有</a></p>
					<p><a href="javascript:;" class="left9" style="display: none;">查找</a></p>
				</span>
				<span>
					<p class="navi_title">考勤标准</p>
					<p><a href="javascript:;" class="left6" >考勤标准设定</a></p>
				</span>
				<span>
					<p class="navi_title">关于</p>
					<p><a href="javascript:;" class="left7" >关于</a></p>
				</span>
			</div>
		</div>
	</div>
	
<div class="con">
    <div class="con_left">
      
       <div class="con_left1" id="con_left1" style="display: block;">
       <form id="form1" method="post" action="${pageContext.request.contextPath}/admin?method=addUser" autocomplete="off">
	<div class="user">
<div>
<span class="name"></span>
	<p>姓名：</p><input type="text"  id="username"   name="uname" placeholder="" value="">
</div>
 
<div>
<span class="name"></span>
<p>学号：</p><input type="text" id="id"  name="uid" placeholder="" value="">
</div>

<div>
<span class="name"></span>
<p>电话：</p><input type="text" id="phone" name="uphone" placeholder="" value="">
</div>

<div>
<span class="name"></span>
<p>邮箱：</p><input type="text" id="adress"  name="umail" placeholder="" value="">
</div>

<div>
<span class="name"></span>
<p>考勤号：</p><input type="text" id="number" name="attid" placeholder="" value="">
</div>

<div>
<span class="name"></span>
<p>团队编号：</p><input type="text" id="team" name="teamid" placeholder="" value="">
</div>

</div>
<button class="button1" id="btn_perser" type="submit">添加</button>
</form>
	</div>
	
	
	<div class="con_left2" style="display: none;">
	<form id="form2" method="post" action="${pageContext.request.contextPath}/admin?method=addTeam" autocomplete="off">
	<div class="user">
<div>
<span class="name"></span>
	<p>团队编号：</p><input type="text"  id="teamnumber"  name="tid" placeholder="" value="">
</div>
 
<div>
<span class="name"></span>
<p>团队名：</p><input type="text" id="teamname" name="tname"  placeholder="" value="">
</div>



</div>
<button  class="button1" id="btn_perser2" type="submit">添加</button>
</form>

	</div>
	
	<div class="con_left3" style="display: none;">
	<div class="leftbox">
       <form>
        <input id="fileInput" type="file" onchange="processFiles(this.files)" >
        <!-- <input id="fileInput" type="file" onchange="processFiles(this.files)" multiple> -->
		</form>
        <div id="fileOutput">
        </div>
    </div>
		</div>
		
		<div class="con_left4" id="con_left4" style="display: none;">
		<div class="first" style="display: block;">
		<div class="user">
		<form id="form4" method="post" action="${pageContext.request.contextPath}/admin?method=findTeamAttdByTeamid" autocomplete="off">
	
<div>
<span class="teamid"></span>

	<p>请输入团队编号：</p><input type="text"  id="teamnumber2"  name="teamid"  placeholder="" value="">
</div>
	<button class="button1" id="btn_perser4" type="submit">确定</button>		
</form>
</div>
			</div>
<table class="con_table" id="teamimfor" style="display: none;">
	<thead>
            <tr>
                <th>学号</th>
                <th>时间</th>
                <th>状态</th>
                <th>考勤号</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>小米</td>
                <td>未知</td>
                <td>1234567</td>
                <td>火星文明</td>
            </tr>
            <tr>
                <td>华为</td>
                <td>未知</td>
                <td>1234567</td>
                <td>火星文明</td>
            </tr>
            <tr>
                <td>三星</td>
                <td>未知</td>
                <td>1234567</td>
                <td>火星文明</td>
            </tr>
            <tr>
                <td>苹果</td>
                <td>未知</td>
                <td>1234567</td>
                <td>火星文明</td>
            </tr>
        </tbody>
        <tfoot> 
        <tfoot>
                <tr>                 
                    <td><a href="#" class="more">上一页</a></td>
                    <td colspan="1"><a href="#" class="more">下一页</a></td>
                    <td colspan="2"></td>
                </tr>
              </tfoot>
        </tfoot> 
		</table>
		</div>
		
		<div class="con_left8" id="con_left8" style="display: none;">
		
<table class="con_table">
	<thead>
            <tr>
                <th>学号</th>
                <th>时间</th>
                <th>状态</th>
                <th>所属团队</th>
                <th>考勤号</th>
            </tr>
        </thead>
        <tbody>
            <tr class="one">
                <td>小米</td>
                <td>未知</td>
                <td>1234567</td>
                <td>火星文明</td>
            </tr>
            <tr class="two">
                <td>华为</td>
                <td>未知</td>
                <td>1234567</td>
                <td>火星文明</td>
            </tr>
            <tr class="three">
                <td>三星</td>
                <td>未知</td>
                <td>1234567</td>
                <td>火星文明</td>
            </tr>
            <tr class="four">
                <td>苹果</td>
                <td>未知</td>
                <td>1234567</td>
                <td>火星文明</td>
            </tr>
        </tbody>
        <tfoot> 
        <tfoot>
                <tr>                 
                    <td><a href="#" class="more">上一页</a></td>
                    <td colspan="1"><a href="#" class="more">下一页</a></td>
                    <td colspan="2"></td>
                </tr>
              </tfoot>
        </tfoot> 
		</table>

		</div>
		
		<div class="con_left9" id="con_left9" style="display: none;">
		<form id="form9" method="post" action="${pageContext.request.contextPath}/admin?method=findStuAttdById" autocomplete="off">
	<div class="user">
<div>
<span class="searchid"></span>
	<p>按学号查找：</p><input type="text"  id="searchid" name="id"  placeholder="学号" value="">
	<button class="button1" id="btn_perser9_1" type="submit">确定</button>
</div>
<div class="con_left9" id="con_left9" style="display: none;">
	
<form id="form9_2" method="post" action="${pageContext.request.contextPath}/admin?method=findStuAttdByName" autocomplete="off">
	<div class="user">
<div>
<span class="searchname"></span>
	<p>按姓名查找：</p><input type="text"  id="searchname" name="name"  placeholder="姓名" value="">
	<button class="button1" id="btn_perser9_2" type="submit">确定</button>
</div>
	</div>
			</form>
			<form id="form9_3" method="post" action="${pageContext.request.contextPath}/admin?method=findStuAttdByAttid" autocomplete="off">
	<div class="user">
<div>
<span class="searchnumber"></span>
	<p>按考勤号查找：</p><input type="text"  id="searchnumber" name="attid"  placeholder="考勤号" value="">
	<button class="button1" id="btn_perser9_3" type="submit">确定</button>
</div>
				</div>
			</form>
		
		</div>
			</div>
</form>
	<table class="con_table" style="display: none">
	<thead>
            <tr>
                <th>姓名</th>
                <th>性别</th>
                <th>电话</th>
                <th>地址</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>小米</td>
                <td>未知</td>
                <td>1234567</td>
                <td>火星文明</td>
            </tr>
            <tr>
                <td>华为</td>
                <td>未知</td>
                <td>1234567</td>
                <td>火星文明</td>
            </tr>
            <tr>
                <td>三星</td>
                <td>未知</td>
                <td>1234567</td>
                <td>火星文明</td>
            </tr>
            <tr>
                <td>苹果</td>
                <td>未知</td>
                <td>1234567</td>
                <td>火星文明</td>
            </tr>
        </tbody>
        <tfoot> 
        <tfoot>
                <tr>                 
                    <td><a href="#" class="more">上一页</a></td>
                    <td colspan="1"><a href="#" class="more">下一页</a></td>
                    <td colspan="2"></td>
                </tr>
              </tfoot>
        </tfoot> 
		</table>
		</div>
		
	</div>
	</div>
	</div>
<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">
<p>版权所有</p>
<p>xxx</p>
</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/admin/js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/admin/js/Untitled-2.js"></script>
</body>
</html>