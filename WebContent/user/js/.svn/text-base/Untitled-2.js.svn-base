$(function() {
	$(".body .navi_body .navi_head .left1").click(function() {
		$(".body .con .con_left .con_left1").css("display", "block");
		$(".body .con .con_left .con_left2").css("display", "none");
		$(".body .con .con_left .con_left3").css("display", "none");

	});
	$(".body .navi_body .navi_head .left2").click(function() {
		$(".body .con .con_left .con_left1").css("display", "none");
		$(".body .con .con_left .con_left2").css("display", "block");
		$(".body .con .con_left .con_left3").css("display", "none");
	});
	$(".body .navi_body .navi_head .left3").click(function() {
		$(".body .con .con_left .con_left1").css("display", "none");
		$(".body .con .con_left .con_left2").css("display", "none");
		$(".body .con .con_left .con_left3").css("display", "block");
	});

	$("#imgHoverTreeCode").click(function() {
		changehovertreecheckcode();
	});
	function getdata() {

		var userName = document.getElementById("uname");
		var userID = document.getElementById("uid");
		var userPhone = document.getElementById("uphone");
		var userMail = document.getElementById("umail");
	}

	function changehovertreecheckcode() {
		var imgNode = document.getElementById("imgHoverTreeCode");
		imgNode.src = "/siteresource/hovertreecheckcode.ashx?t="
				+ (new Date()).valueOf(); // 这里加个时间的参数是为了防止浏览器缓存的问题
											// hovertree.com
	}

	$.ajax({
		url : '/user?method=findInfoByName',
		type : 'POST',
		dataType : 'json',
		timeout : 1000,
		cache : false,
		beforeSend : LoadFunction, // 加载执行方法
		error : erryFunction, // 错误执行方法
		success : succFunction
	// 成功执行方法
	});
	function LoadFunction() {
		// $("#list").html('加载中...');
	}
	function erryFunction() {
		alert("加载失败");
	}
	function succFunction(tt) {
		//    	
		// $("#id名").html(data); //绑定数据
		//
		// $(".class名").val(data); //给input表单绑定数据
		// $("#list").html('');

		// eval将字符串转成对象数组
		// var json = { "id": "10086", "uname": "zhangsan", "email":
		// "zhangsan@qq.com" };
		// json = eval(json);
		// alert("===json:id=" + json.id + ",uname=" + json.uname + ",email=" +
		// json.email);

		var json = eval("("+tt+")"); // 数组
		$.each(json, function(index, item) {
			// 循环获取数据
			var name = json[index].Name;
			var id = json[index].Idr;
			var phone = json[index].Phone;
			var adress = json[index].Adress;
			$("#username").val(name);
			$("#id").val(id);
			$("#phone").val(phone);
			$("#adress").val(adress);
			// $("#list").html($("#list").html() + "<br>" + name + " - " +
			// idnumber + " - " + sex + "<br/>");
		});
	}

	$('#button1').click(function() {// 修改信息

		// 获取表单中的参数
		var params = $("#form1").serialize();
		// alert(params);
		// 发送登录的异步请求
		$.post("${ctx}/loginAjax.action", params, function(data, status) {
			alert(data.tip);
		}, "json");

	});

	$('#button1').click(function() {// 修改密码
		var msg = "";
		if ($.trim($('#premima').val()) === '') {
			msg = "请输入原密码!";

		} else if ($.trim($('#newmima').val()) === '') {
			msg = "请输入新密码!";

		} else if ($.trim($('#againmima').val()) === '') {
			msg = "请重复输入新密码!";

		}

		if (msg !== "") {
			alert(msg);
			return false;
		} else {

			// 获取表单中的参数
			var params = $("#form2").serialize();
			// alert(params);
			// 发送登录的异步请求
			$.post("${ctx}/loginAjax.action", params, function(data, status) {
				alert(data.tip);
			}, "json");
		}
	});

});