$(function () {
    $(".content .con_right .left").click(function (e) {
        $(this).css({ "color": "#333333", "border-bottom": "2px solid #2e558e" });
        $(".content .con_right .right").css({ "color": "#999999", "border-bottom": "2px solid #dedede" });
        $(".content .con_right ul .con_r_left").css("display", "block");
        $(".content .con_right ul .con_r_right").css("display", "none");
        if (fluCodeInterval == null || fluCheckCodeInterval == null) {
            show();
            flushQRCode();
            checkQRCodeStatus();
        }
    }
    );
    $(".content .con_right .right").click(function (e) {
        $(this).css({ "color": "#333333", "border-bottom": "2px solid #2e558e" });
        $(".content .con_right .left").css({ "color": "#999999", "border-bottom": "2px solid #dedede" });
        $(".content .con_right  .con_r_right").css("display", "block");
        $(".content .con_right  .con_r_left").css("display", "none");
    });

 

    $('#btn_Login').click(function () {//用户登录
		var msg = "";
        if ($.trim($('#username').val()) == '') {
            msg="请输入您的用户名!";
            
        } else if ($.trim($('#password').val()) == '') {
            msg="请输入密码!";
           
        }
		
		if (msg != ""){  
                alert(msg); return false;
		}
		else{  
                // 获取表单中的参数  
                var params = $("#form1").serialize();  
                //alert(params);  
                // 发送登录的异步请求  
                $.post("${ctx}/loginAjax.action", params, function(data, status){  
                    alert(data.tip);  
                }, "json");  
            }  
        }	
    );
	
	$('#btn_Login2').click(function () {//管理员登录
		var msg = "";
        if ($.trim($('#username2').val()) == '') {
            msg="请输入您的用户名!";
            
        } else if ($.trim($('#password2').val()) == '') {
            msg="请输入密码!";
           
        }
		
		if (msg != ""){  
                alert(msg);  return false;}
		else{  
                // 获取表单中的参数  
                var params = $("#form2").serialize();  
                //alert(params);  
                // 发送登录的异步请求  
                $.post("${ctx}/loginAjax.action", params, function(data, status){  
                    alert(data.tip);  
                }, "json");  
            }  
        }	
    );

    $("#imgHoverTreeCode").click(function () {
        changehovertreecheckcode();
    });

    function changehovertreecheckcode() {
        var imgNode = document.getElementById("imgHoverTreeCode");
        imgNode.src = "/siteresource/hovertreecheckcode.ashx?t=" + (new Date()).valueOf(); // 这里加个时间的参数是为了防止浏览器缓存的问题 hovertree.com
    }
	
	 

})// JavaScript Document