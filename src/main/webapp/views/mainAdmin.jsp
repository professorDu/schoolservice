<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>苏科大生活服务系统</title>
    <%
        request.setAttribute("APP_PATH", request.getContextPath());
    %>
    <script type="text/javascript"
            src="${APP_PATH }/static/js/jquery-3.1.1.js"></script>
    <link href="${APP_PATH }/static/style/dorm.css" rel="stylesheet">

    <link href="${APP_PATH }/static/bootstrap/css/bootstrap-responsive.css"
          rel="stylesheet">
    <link
            href="${APP_PATH }/static/bootstrap-datetimepicker-master/css/bootstrap-datetimepicker.min.css"
            rel="stylesheet" media="screen">

    <script type="text/javascript"
            src="${APP_PATH }/static/bootstrap-datetimepicker-master/js/bootstrap-datetimepicker.js"
            charset="UTF-8"></script>
    <script type="text/javascript"
            src="${APP_PATH }/static/bootstrap-datetimepicker-master/js/locales/bootstrap-datetimepicker.fr.js"
            charset="UTF-8"></script>


    <script type="text/javascript">
        $(document).ready(function () {
            $("#DataTables_Table_0_wrapper .row-fluid").remove();
        });
    </script>

    <link
            href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
            rel="stylesheet">
    <script
            src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <style type="text/css">
        .bs-docs-sidenav {
            background-color: #fff;
            border-radius: 6px;
            box-shadow: 0 1px 4px rgba(0, 0, 0, 0.067);
            padding: 0;
            width: 212px;
        }

        .bs-docs-sidenav > li > a {
            border: 1px solid #e5e5e5;
            display: block;
            padding: 8px 14px;
            margin: 0 0 -1px;
        }

        .bs-docs-sidenav > li:first-child > a {
            border-radius: 6px 6px 0 0;
        }

        .bs-docs-sidenav > li:last-child > a {
            border-radius: 0 0 6px 6px;
        }

        .bs-docs-sidenav > .active > a {
            border: 0 none;
            box-shadow: 1px 0 0 rgba(0, 0, 0, 0.1) inset, -1px 0 0 rgba(0, 0, 0, 0.1) inset;
            padding: 9px 15px;
            position: relative;
            text-shadow: 0 1px 0 rgba(0, 0, 0, 0.15);
            z-index: 2;
        }

        .bs-docs-sidenav .icon-chevron-right {
            float: right;
            margin-right: -6px;
            margin-top: 2px;
            opacity: 0.25;
        }

        .bs-docs-sidenav > li > a:hover {
            background-color: #f5f5f5;
        }

        .bs-docs-sidenav a:hover .icon-chevron-right {
            opacity: 0.5;
        }

        .bs-docs-sidenav .active .icon-chevron-right, .bs-docs-sidenav .active a:hover .icon-chevron-right {
            background-image: url("${APP_PATH }/static/bootstrap-3.3.7-dist/img/glyphicons-halflings-white.png");
            opacity: 1;
        }
    </style>

</head>
<body>

<div class="container-fluid"
     style="padding-right: 0px;padding-left: 0px;">
    <div region="north"
         style="height: 100px;background-image: url('${APP_PATH }/static/bootstrap-3.3.7-dist/img/bg.jpg')">
        <div align="left"
             style="width: 80%;height:100px ;float: left;padding-top: 40px;padding-left: 30px;">
            <div class="row">
                <font color="white" size="6">高校生活服务系统</font>
            </div>
        </div>
        <div class="row">
            <div class="col-md-offset-10" style="margin-top: 5%">当前用户：&nbsp;<font color="red">${username}</font></div>
        </div>
        <div style="padding-top: 70px;padding-right: 20px;"></div>
    </div>
</div>
<div class="container-fluid" style="padding-top: 25px;">
    <div class="row-fluid">
        <div class="span2 bs-docs-sidebar">
            <ul class="nav nav-list bs-docs-sidenav">
                <li><a href="javascript:void(0);" class="click" id="1"><i
                        class="icon-chevron-right"></i>首页</a></li>
                <li><a href="javascript:void(0);" class="click" id="2"><i
                        class="icon-chevron-right"></i>宿舍管理员管理</a></li>
                <li><a href="javascript:void(0);" class="click" id="3"><i
                        class="icon-chevron-right"></i>宿舍楼管理</a></li>
                <li><a href="javascript:void(0);" class="click" id="4"><i
                        class="icon-chevron-right"></i>学生信息管理</a></li>
                <li><a href="javascript:void(0);" class="click" id="5"><i
                        class="icon-chevron-right"></i>生活管理员管理</a></li>
                <li><a href="javascript:void(0);" class="click" id="6"><i
                        class="icon-chevron-right"></i>修改密码</a></li>
                <li><a href="login.jsp"><i class="icon-chevron-right"></i>退出系统</a></li>
            </ul>
        </div>
        <div class="span10"></div>
    </div>
</div>
<script type="text/javascript">
    //默认去首页
    $(function () {
        $.ajax(
            {
                type: "GET",
                url: "${APP_PATH}/adminnewpage",
                data: {
                    id: 1
                },
                dataType: "text",
                success: function (data) {
                    $(".span10").load(data);
                }
            }
        )
    });
    //通过点击去其它页面
    $(".click").click(function () {
        var aid = $(this).attr("id");
        $.ajax(
            {
                type: "GET",
                url: "${APP_PATH}/adminnewpage",
                data: {
                    id: aid
                },
                cache: false,
                async: false,
                dataType: "text",
                success: function (data) {
                    // $('.span10').load(data,function(respone){
                    //     $('.span10').html(respone);
                    // });
                    $(".span10").load(data);
                }
            }
        )
    });
</script>

</body>

</html>