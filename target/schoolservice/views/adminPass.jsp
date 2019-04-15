<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    request.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript"
        src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>

<link
        href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
        rel="stylesheet">
<script
        src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>


<!-- 员工添加的模态框 -->
<div class="modal fade" id="empAddModal" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"
                        aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">密码修改</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">当前密码</label>
                        <div class="col-sm-10">
                            <input type="text" name="superPass" class="form-control"
                                   id="dormName_add_input" placeholder="123"> <span
                                class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">新密码</label>
                        <div class="col-sm-10">
                            <input type="text" name="superPass" class="form-control"
                                   id="dormUsername_add_input" placeholder="456"> <span
                                class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">确认密码</label>
                        <div class="col-sm-10">
                            <input type="text" name="superPass" class="form-control"
                                   id="dormTel_add_input" placeholder="456"> <span
                                class="help-block"></span>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="apart_save_btn">保存</button>
            </div>
        </div>
    </div>
</div>


<!-- 搭建显示页面 -->
<div class="container-fluid data_list">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12 ">
            <!-- <font color="CornflowerBlue " style="text-align:center;"><h4>宿舍管理员管理</h4></font> -->
            <div class="data_list_title">修改密码</div>
        </div>
    </div>
    <!-- 按钮 -->
    <div class="row">
        <div class="col-md-4">
            <button class="btn btn-primary" id="emp_add_modal_btn">点我修改密码</button>

        </div>

    </div>


    <script type="text/javascript">

        //清空表单样式及内容
        function reset_form(ele) {
            $(ele)[0].reset();
            //清空表单样式
            $(ele).find("*").removeClass("has-error has-success");
            $(ele).find(".help-block").text("");
        }

        //点击新增按钮弹出模态框。
        $("#emp_add_modal_btn").click(function () {
            //清楚表单数据（表单重置）
            reset_form("#empAddModal form");

/*
            //1、校验用户名
            var empName = $("#dormUsername_Update_input").val();
            var regName = /^[a-zA-Z0-9_-]{6,16}$/;
            if (!regName.test(empName)) {
                show_validate_msg("#dormUsername_Update_input", "error", "用户名为6-16位英文和数字的组合");
                return false;
            } else {
                show_validate_msg("#dormUsername_Update_input", "success", "");
            }
            //2、校验电话信息
            var dormTel = $("#dormTel_Update_input").val();
            var regdormTel = /^1(3|4|5|7|8)\d{9}$/;
            if (!regdormTel.test(dormTel)) {
                show_validate_msg("#dormTel_Update_input", "error", "电话格式不正确");
                return false;
            } else {
                show_validate_msg("#dormTel_Update_input", "success", "");
            }
*/


            //弹出模态框
            $("#empAddModal").modal({
                backdrop: "static"
            });
        });

        //校验表单数据
        function validate_add_form() {
            //1、拿到要校验的数据，使用正则表达式
            var empName = $("#dormUsername_add_input").val();
            var regName = /^[a-zA-Z0-9_-]{6,16}$/;
            if (!regName.test(empName)) {
                //alert("6-16位英文和数字的组合");
                show_validate_msg("#dormUsername_add_input", "error", "用户名为6-16位英文和数字的组合");
                return false;
            } else {
                show_validate_msg("#dormUsername_add_input", "success", "");


            }

            //2、校验电话信息
            var dormTel = $("#dormTel_add_input").val();
            var regdormTel = /^1(3|4|5|7|8)\d{9}$/;
            ///^[1]+[3,8]+\\d{9}$/;
            if (!regdormTel.test(dormTel)) {
                //alert("电话格式不正确");
                show_validate_msg("#dormTel_add_input", "error", "电话格式不正确");
                //应该清空这个元素之前的样式
                //show_validate_msg("#dormTel_add_input", "error", "电话格式不正确");
                return false;
            } else {
                show_validate_msg("#dormTel_add_input", "success", "");

            }
            return true;
        }

        //抽取显示校验结果的提示信息
        function show_validate_msg(ele, status, msg) {
            //清除当前元素的校验状态
            $(ele).parent().removeClass("has-success has-error");
            $(ele).next("span").text("");
            if ("success" == status) {
                $(ele).parent().addClass("has-success");
                $(ele).next("span").text(msg);
            } else if ("error" == status) {
                $(ele).parent().addClass("has-error");
                $(ele).next("span").text(msg);
            }
        }

        //校验用户名是否可用
        $("#dormUsername_add_input").change(function () {
            //发送ajax请求校验用户名是否可用
            var dormUsername = this.value;
            $.ajax({
                url: "${APP_PATH}/checkdormUsername",
                data: "dormUsername=" + dormUsername,
                type: "POST",
                success: function (result) {
                    if (result.code == 100) {
                        //show_validate_msg("#apart_save_btn","success","用户名可用");

                        //dormUsername_add_input
                        show_validate_msg("#dormUsername_add_input", "success", "用户名可用");
                        $("#apart_save_btn").attr("ajax-va", "success");

                    } else {
                        //show_validate_msg("#empName_add_input","error",result.extend.va_msg);

                        show_validate_msg("#dormUsername_add_input", "error", result.extend.va_msg);
                        $("#apart_save_btn").attr("ajax-va", "error");
                    }
                }
            });
        });

        //点击保存，保存管理员信息。
        $("#apart_save_btn").click(function () {
            //1、模态框中填写的表单数据提交给服务器进行保存
            //1、先对要提交给服务器的数据进行校验
            if (!validate_add_form()) {
                return false;
            }
            ;
            //1、判断之前的ajax用户名校验是否成功。如果成功。
            if ($(this).attr("ajax-va") == "error") {
                return false;
            }
            //  alert($("#empAddModal form").serialize());
            $.ajax({
                url: "${APP_PATH}/apart",
                type: "POST",
                data: $("#empAddModal form").serialize(),
                success: function (result) {
                    //	alert(result.msg);
                    if (result.code == 100) {
                        //1、关闭模态框
                        $("#empAddModal").modal('hide');

                        //2、来到最后一页，显示刚才保存的数据
                        //发送ajax请求显示最后一页数据即可
                        to_page(totalRecord);
                    } else {
                        //显示失败信息
                        console.log(result);
                        //有哪个字段的错误信息就显示哪个字段的；
                        if (undefined != result.extend.errorFields.dormTel) {
                            //显示电话错误信息
                            show_validate_msg("#dormTel_add_input", "error", result.extend.errorFields.dormTel);
                        }
                        if (undefined != result.extend.errorFields.dormUsername) {
                            //显示用户名的错误信息
                            show_validate_msg("#dormUsername_add_input", "error", result.extend.errorFields.dormUsername);
                        }
                        /* alert(result.extend.errorFields.dormTel);
                        alert(result.extend.errorFields.dormUsername); */
                    }

                }
            });
            /* 	//1、先对要提交给服务器的数据进行校验
                if(!validate_add_form()){
                    return false;
                };
                //1、判断之前的ajax用户名校验是否成功。如果成功。
                if($(this).attr("ajax-va")=="error"){
                    return false;
             */
        });
        $(document).on("click", ".edit_btn", function () {
            //alert("edit");
            //1、查出部门信息，并显示部门列表
            getApart("#empUpdateModal select");
            //2、查询管理员信息
            getDormmanager($(this).attr("edit-id"));
            //3、把员工的id传递给模态框的更新按钮
            $("#apart_update_btn").attr("edit-id", $(this).attr("edit-id"));

            $("#empUpdateModal").modal({
                backdrop: "static"
            });
        });

        function getDormmanager(id) {
            $.ajax({
                url: "${APP_PATH}/dormmanager/" + id,
                type: "GET",
                success: function (result) {
                    //console.log(result);
                    var dormmDate = result.extend.dormm;
                    $("#dormName_Update_input").val(dormmDate.dormName);
                    $("#dormUsername_Update_input").val(dormmDate.dormUsername);
                    $("#dormPassword_Update_input").val(dormmDate.dormPassword);
                    $("#empUpdateModal input[name=dormGender]").val([dormmDate.dormGender]);
                    $("#dormTel_Update_input").val(dormmDate.dormTel);
                    $("#empUpdateModal select").val([dormmDate.apartPid]);
                }
            });
        }

        $("#apart_update_btn").click(function () {
            //1、校验用户名
            var empName = $("#dormUsername_Update_input").val();
            var regName = /^[a-zA-Z0-9_-]{6,16}$/;
            if (!regName.test(empName)) {
                show_validate_msg("#dormUsername_Update_input", "error", "用户名为6-16位英文和数字的组合");
                return false;
            } else {
                show_validate_msg("#dormUsername_Update_input", "success", "");
            }
            //2、校验电话信息
            var dormTel = $("#dormTel_Update_input").val();
            var regdormTel = /^1(3|4|5|7|8)\d{9}$/;
            if (!regdormTel.test(dormTel)) {
                show_validate_msg("#dormTel_Update_input", "error", "电话格式不正确");
                return false;
            } else {
                show_validate_msg("#dormTel_Update_input", "success", "");
            }
            //3、发送ajax请求 保存更新的员工数据
            $.ajax({
                url: "${APP_PATH}/dormmanager/" + $(this).attr("edit-id"),
                type: "PUT",
                data: $("#empUpdateModal form").serialize(),
                success: function (result) {
                    //alert(result.msg);
                    //1、关闭对话框
                    $("#empUpdateModal").modal("hide");
                }
            });
        })
    </script>
</div>