$(function () {
    $(".body .navi_body .navi_head .left1").click(function () { 
        $(".body .con .con_left .con_left1").css("display", "block");
        $(".body .con .con_left .con_left2").css("display", "none");
		$(".body .con .con_left .con_left3").css("display", "none");
		$(".body .con .con_left .con_left4").css("display", "none");
		$(".body .con .con_left .con_left6").css("display", "none");
		$(".body .con .con_left .con_left8").css("display", "none");
		$(".body .con .con_left .con_left9").css("display", "none");
    });
    $(".body .navi_body .navi_head .left2").click(function () {
        $(".body .con .con_left .con_left1").css("display", "none");
        $(".body .con .con_left .con_left2").css("display", "block");
		$(".body .con .con_left .con_left3").css("display", "none");
		$(".body .con .con_left .con_left4").css("display", "none");
        $(".body .con .con_left .con_left6").css("display", "none");
		$(".body .con .con_left .con_left8").css("display", "none");
		$(".body .con .con_left .con_left9").css("display", "none");
    });
	$(".body .navi_body .navi_head .left3").click(function () {
         $(".body .con .con_left .con_left1").css("display", "none");
        $(".body .con .con_left .con_left2").css("display", "none");
		$(".body .con .con_left .con_left3").css("display", "block");
		$(".body .con .con_left .con_left4").css("display", "none");
		$(".body .con .con_left .con_left6").css("display", "none");
		$(".body .con .con_left .con_left8").css("display", "none");
		$(".body .con .con_left .con_left9").css("display", "none");
    });
	$(".body .navi_body .navi_head .left4").click(function () { 
        $(".body .con .con_left .con_left1").css("display", "none");
        $(".body .con .con_left .con_left2").css("display", "none");
		$(".body .con .con_left .con_left3").css("display", "none");
		$(".body .con .con_left .con_left4").css("display", "block");
		$(".body .con .con_left .con_left6").css("display", "none");
		$(".body .con .con_left .con_left8").css("display", "none");
		$(".body .con .con_left .con_left9").css("display", "none");
    });
	$(".body .navi_body .navi_head .left5").click(function () { 
        $(".body .navi_body .navi_head .left8").css("display", "block");
        $(".body .navi_body .navi_head .left9").css("display", "block");
    });
	$(".body .navi_body .navi_head .left6").click(function () { 
        $(".body .con .con_left .con_left1").css("display", "none");
        $(".body .con .con_left .con_left2").css("display", "none");
		$(".body .con .con_left .con_left3").css("display", "none");
		$(".body .con .con_left .con_left4").css("display", "none");
		$(".body .con .con_left .con_left6").css("display", "block");
		$(".body .con .con_left .con_left8").css("display", "none");
		$(".body .con .con_left .con_left9").css("display", "none");
    });
	$(".body .navi_body .navi_head .left8").click(function () { 
        $(".body .con .con_left .con_left1").css("display", "none");
        $(".body .con .con_left .con_left2").css("display", "none");
		$(".body .con .con_left .con_left3").css("display", "none");
		$(".body .con .con_left .con_left4").css("display", "none");
		$(".body .con .con_left .con_left6").css("display", "none");
		$(".body .con .con_left .con_left8").css("display", "block");
		$(".body .con .con_left .con_left9").css("display", "none");
    });
	$(".body .navi_body .navi_head .left9").click(function () { 
        $(".body .con .con_left .con_left1").css("display", "none");
        $(".body .con .con_left .con_left2").css("display", "none");
		$(".body .con .con_left .con_left3").css("display", "none");
		$(".body .con .con_left .con_left4").css("display", "none");
		$(".body .con .con_left .con_left6").css("display", "none");
		$(".body .con .con_left .con_left8").css("display", "none");
		$(".body .con .con_left .con_left9").css("display", "block");
    });
	$('#btn_perser9_1').click(function () {//学号查找
		$(".body .con .con_left .con_left9 .user").css("display", "none");
		$(".body .con .con_left .con_left9 .con_table").css("display", "block");
		  
                // 获取表单中的参数  
                var params = $("#form9_1").serialize();  
                //alert(params);  
                // 发送登录的异步请求  
                $.post("${ctx}/loginAjax.action", params, function(data, status){  
                    alert(data.tip);  
                }, "json");  
              
        }	
    );
	
	$('#btn_perser9_2').click(function () {//姓名查找
		$(".body .con .con_left .con_left9 .user").css("display", "none");
		$(".body .con .con_left .con_left9 .con_table").css("display", "block");
		  
                // 获取表单中的参数  
                var params = $("#form9_2").serialize();  
                //alert(params);  
                // 发送登录的异步请求  
                $.post("${ctx}/loginAjax.action", params, function(data, status){  
                    alert(data.tip);  
                }, "json");  
              
        }	
    );
	$('#btn_perser9_3').click(function () {//考勤号查找
		$(".body .con .con_left .con_left9 .user").css("display", "none");
		$(".body .con .con_left .con_left9 .con_table").css("display", "block");
		  
                // 获取表单中的参数  
                var params = $("#form9_3").serialize();  
                //alert(params);  
                // 发送登录的异步请求  
                $.post("${ctx}/loginAjax.action", params, function(data, status){  
                    alert(data.tip);  
                }, "json");  
              
        }	
    );
	
	$("#imgHoverTreeCode").click(function () {
        changehovertreecheckcode();
    });

    function changehovertreecheckcode() {
        var imgNode = document.getElementById("imgHoverTreeCode");
        imgNode.src = "/siteresource/hovertreecheckcode.ashx?t=" + (new Date()).valueOf(); // 这里加个时间的参数是为了防止浏览器缓存的问题 hovertree.com
    }
	
	$('#btn_perser').click(function () {//添加用户
		  
                // 获取表单中的参数  
                var params = $("#form1").serialize();  
                //alert(params);  
                // 发送登录的异步请求  
                $.post("${ctx}/loginAjax.action", params, function(data, status){  
                    alert(data.tip);  
                }, "json");  
              
        }	
    );
	
	$('#btn_perser2').click(function () {//添加团队
		  
                // 获取表单中的参数  
                var params = $("#form2").serialize();  
                //alert(params);  
                // 发送登录的异步请求  
                $.post("${ctx}/loginAjax.action", params, function(data, status){  
                    alert(data.tip);  
                }, "json");  
              
        }	
    );
	
	$('#btn_perser4').click(function () {//团队查找
		$(".body .con .con_left .con_left4 .first").css("display", "none");
		$(".body .con .con_left .con_left4 .con_table").css("display", "block");
		  
                // 获取表单中的参数  
                var params = $("#form4").serialize();  
                //alert(params);  
                // 发送登录的异步请求  
                $.post("${ctx}/loginAjax.action", params, function(data, status){  
                    alert(data.tip);  
                }, "json");  
              
        }	
    );
	
	$('#btn_perser9_1').click(function () {//学号查找
		$(".body .con .con_left .con_left9 .user").css("display", "none");
		$(".body .con .con_left .con_left9 .con_table").css("display", "block");
		  
                // 获取表单中的参数  
                var params = $("#form9").serialize();  
                //alert(params);  
                // 发送登录的异步请求  
                $.post("${ctx}/loginAjax.action", params, function(data, status){  
                    alert(data.tip);  
                }, "json");  
              
        }	
    );
	
	$('#btn_perser9_2').click(function () {//姓名查找
		$(".body .con .con_left .con_left9 .user").css("display", "none");
		$(".body .con .con_left .con_left9 .con_table").css("display", "block");
		  
                // 获取表单中的参数  
                var params = $("#form9").serialize();  
                //alert(params);  
                // 发送登录的异步请求  
                $.post("${ctx}/loginAjax.action", params, function(data, status){  
                    alert(data.tip);  
                }, "json");  
              
        }	
    );
	$('#btn_perser9_3').click(function () {//考勤号查找
		$(".body .con .con_left .con_left9 .user").css("display", "none");
		$(".body .con .con_left .con_left9 .con_table").css("display", "block");
		  
                // 获取表单中的参数  
                var params = $("#form9").serialize();  
                //alert(params);  
                // 发送登录的异步请求  
                $.post("${ctx}/loginAjax.action", params, function(data, status){  
                    alert(data.tip);  
                }, "json");  
              
        }	
    );
	
	
});