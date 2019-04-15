<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page  isELIgnored = "false" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>苏科大生活服务系统</title>
<%
	request.setAttribute("APP_PATH", request.getContextPath());
%>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 支持移动设备优先 -->
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<script src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
	<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  	<script type="text/javascript">
  			
			$(document).ready(function(){
				$(".screenbg ul li").each(function(){
					$(this).css("opacity","0");
				});
				$(".screenbg ul li:first").css("opacity","1");
				var index = 0;
				var t;
				var li = $(".screenbg ul li");	
				var number = li.size();
				function change(index){
					li.css("visibility","visible");
					li.eq(index).siblings().animate({opacity:0},3000);
					li.eq(index).animate({opacity:1},8000);
				}
				function show(){
					index = index + 1;
					if(index<=number-1){
						change(index);
					}else{
						index = 0;
						change(index);
					}
				}
				t = setInterval(show,3000);
				//根据窗口宽度生成图片宽度
				var width = $(window).width();
				$(".screenbg ul img").css("width",width+"px");
			});
		</script>
		<style type="text/css" >
				/*背景图片*/
				.screenbg {
					position:fixed;
					bottom:0;
					left:0;
					z-index:-999;
					overflow:hidden;
					width:100%;
					height:100%;
					min-height:100%;
				}
				.screenbg ul li {
					display:block;
					list-style:none;
					position:fixed;
					overflow:hidden;
					top:0;
					left:0;
					width:100%;
					height:100%;
					z-index:-1000;
					float:right;
				}
				.screenbg ul a {
					left:0;
					top:0;
					width:100%;
					height:100%;
					display:inline-block;
					margin:0;
					padding:0;
					cursor:default;
				}
				.screenbg a img {
					vertical-align:middle;
					display:inline;
					border:none;
					display:block;
					list-style:none;
					position:fixed;
					overflow:hidden;
					top:0;
					left:0;
					width:100%;
					height:100%;
					z-index:-1000;
					float:right;
				}
		</style>
		
  </head>
  
  <body style="background-color: #E2E2E2;">
    <div class="container">
        <div class="row text-center " style="padding-top:100px;">
            <div class="col-md-12">
                <img src="${APP_PATH }/static/bootstrap-3.3.7-dist/img/usts.png" />
            </div>
        </div>
         <div class="row ">
               
                <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3 col-xs-10 col-xs-offset-1">
                           
                            <div class="panel-body" id="loginAdmin">
                                <form role="form" >
                                <!-- <form role="form"> -->
                                    <hr />
                                    <h5>输入用户名密码登陆</h5>
                                       <br />
                                     <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input name="username" type="text" class="form-control" placeholder="用户名 " id="user" />
                                        </div>
                                                                              <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-lock"  ></i></span>
                                            <input name="password" type="password" class="form-control"  placeholder="密码" id="pass" />
                                        </div>
                                    <div class="form-group">
                                            <label class="radio-inline" >
                                                <input type="radio" name="usertype" value="0" checked="checked"/> 超级管理员
                                            </label>
                                            <label class="radio-inline" >
                                                <input type="radio" name="usertype"  value="1" /> 宿舍管理员
                                            </label>
                                            <label class="radio-inline" >
                                                <input type="radio" name="usertype"  value="2"/> 生活管理员
                                            </label>

                                    </div><br/>

                                    <font id="error" color="red">${error }</font>

                                    <button class="btn btn-primary btn-lg btn-block" id="login_btn">登陆</button>
                                    <hr>
                                </form>
                            </div>
                           
                        </div>
                
                
        </div>
    </div>
		<!--背景图切换-->
		<div class="screenbg">
		  <ul>
				<li><a href="javascript:;"><img src="${APP_PATH }/static/bootstrap-3.3.7-dist/img/0.gif"></a></li>
				<li><a href="javascript:;"><img src="${APP_PATH }/static/bootstrap-3.3.7-dist/img/9.jpg"></a></li>
				<li><a href="javascript:;"><img src="${APP_PATH }/static/bootstrap-3.3.7-dist/img/8.jpg"></a></li>
				<li><a href="javascript:;"><img src="${APP_PATH }/static/bootstrap-3.3.7-dist/img/7.jpg"></a></li>
				<li><a href="javascript:;"><img src="${APP_PATH }/static/bootstrap-3.3.7-dist/img/6.jpg"></a></li>
		  </ul>
		</div>
		<%--<% session.invalidate(); %>--%>
    <script type="text/javascript">
        //loginAdmin?username="+username+"&password="+password+"&usertype="+usertype,
        $("#login_btn").click(function() {
            //1、校验用户名
            var username = $("#user").val();
            var password = $("#pass").val();
            var radio = document.getElementsByName("usertype");
            for (i=0; i<radio.length; i++) {
                if (radio[i].checked) {
                 var usertype=i;
                }
            }

            $.ajax({
                url : "${APP_PATH}/loginAdmin?username="+username+"&password="+password+"&usertype="+usertype,
                type : "GET",
                success : function(result) {
                    if(result.code==100&&usertype==0){
                        window.location.href = "${APP_PATH}/mainAdmin";
                    }else if(result.code==100&&usertype==1){
                        window.location.href = "${APP_PATH}/mainManager";
                    } else if(result.code==100&&usertype==2){
                        window.location.href = "${APP_PATH}/mainLifemanager";
                    }
                    else if(result.code==200){
                        alert("用户名或密码错误");
                    }
                }
            });
        });

    </script>



        </body>
</html>
