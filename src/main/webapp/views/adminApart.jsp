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

<!-- 宿舍管理员修改的模态框 -->
<div class="modal fade" id="empUpdateModal" tabindex="-1" role="dialog"
	 aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title">楼栋修改</h4>
			</div>
			<div class="modal-body">
				<form class="form-horizontal">
					<div class="form-group">
						<label class="col-sm-2 control-label">楼栋</label>
						<div class="col-sm-10">
							<input type="text" name="apartApa" class="form-control"
								   id="dormName_Update_input" placeholder="三组团"> <span
								class="help-block"></span>
						</div>
					</div>

				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary" id="apart_update_btn">修改</button>
			</div>
		</div>
	</div>
</div>


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
				<h4 class="modal-title" id="myModalLabel">楼栋添加</h4>
			</div>
			<div class="modal-body">
				<form class="form-horizontal">
					<div class="form-group">
						<label class="col-sm-2 control-label">姓名</label>
						<div class="col-sm-10">
							<input type="text" name="apartApa" class="form-control"
								   id="dormName_add_input" placeholder="三组团"> <span
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
			<div class="data_list_title">楼栋管理</div>
		</div>
	</div>
	<!-- 按钮 -->
	<div class="row">
		<div class="col-md-4">
			<button class="btn btn-primary" id="emp_add_modal_btn">新增</button>
			<button class="btn btn-danger" id="emp_delete_all_btn">删除</button>
		</div>

	</div>
	<!-- 显示表格数据 -->
	<div class="row">
		<div class="col-md-12">
			<table class="table table-hover table-bordered"
				   id="managerinfo_table">
				<thead>
				<tr>
					<th><input type="checkbox" id="check_all"/></th>
					<th>#</th>
					<th>楼栋</th>
					<th>操作</th>
				</tr>
				</thead>
				<tbody>

				</tbody>
			</table>
		</div>
	</div>

	<!-- 显示分页信息 -->
	<div class="row">
		<!--分页文字信息  -->
		<div class="col-md-3" id="page_info_area"></div>
		<!-- 分页条信息 -->
		<div class="col-md-5" id="page_nav_area"></div>
	</div>
</div>
<script type="text/javascript">
    var totalRecord,
        currentPage;
    var time = 0;
    //1、页面加载完成以后，直接去发送ajax请求,要到分页数据
    $(function () {
        //去首页
        to_page(1);
    });

    function to_page(pn) {
        $.ajax({
            url: "${APP_PATH}/ApartPlus/managerinfo",
            data: "pn=" + pn,
            type: "GET",
            success: function (result) {
                //1、解析并显示员工数据
                build_managerinfo_table(result);
                //2、解析并显示分页信息
                build_page_info(result);
                //3、解析显示分页条数据
                build_page_nav(result);
            }
        });
    }

    function build_managerinfo_table(result) {
        $("#managerinfo_table tbody").empty();
        var managerinfo = result.extend.pageInfo.list;
        $.each(managerinfo, function (index, item) {

            var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
            var dormIdTd = $("<td namel=''></td>").append(index + 1);
            dormIdTd.attr("namel", item.apartId);
            var dormNameTd = $("<td></td>").append(item.apartApa);

            var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
            //为编辑按钮添加一个自定义的属性，来表示当前员工id
            editBtn.attr("edit-id", item.apartId);
            //editBtn.attr("edit-id", item.empId);
            var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btnapart")
                .append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
            //为删除按钮添加一个自定义的属性来表示当前删除的员工id
            delBtn.attr("del-id", item.apartId);
            var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);

            var aa = $("<tr></tr>").append(checkBoxTd)
                .append(dormIdTd)
                .append(dormNameTd)
                .append(btnTd)
                .appendTo("#managerinfo_table tbody");


        });

    }

    //解析显示分页信息
    function build_page_info(result) {
        $("#page_info_area").empty();
        $("#page_info_area").append("当前" + result.extend.pageInfo.pageNum + "页,总" +
            result.extend.pageInfo.pages + "页,总" +
            result.extend.pageInfo.total + "条记录");
        totalRecord = result.extend.pageInfo.total;
        currentPage = result.extend.pageInfo.pageNum;

    }

    //解析显示分页条，点击分页要能去下一页....
    function build_page_nav(result) {
        //page_nav_area
        $("#page_nav_area").empty();
        var ul = $("<ul></ul>").addClass("pagination");

        //构建元素
        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href", "#"));
        var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
        if (result.extend.pageInfo.hasPreviousPage == false) {
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        } else {
            //为元素添加点击翻页的事件
            firstPageLi.click(function () {
                to_page(1);
            });
            prePageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum - 1);
            });
        }


        var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
        var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href", "#"));
        if (result.extend.pageInfo.hasNextPage == false) {
            nextPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        } else {
            nextPageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum + 1);
            });
            lastPageLi.click(function () {
                to_page(result.extend.pageInfo.pages);
            });
        }


        //添加首页和前一页 的提示
        ul.append(firstPageLi).append(prePageLi);
        //1,2，3遍历给ul中添加页码提示
        $.each(result.extend.pageInfo.navigatepageNums, function (index, item) {

            var numLi = $("<li></li>").append($("<a></a>").append(item));
            if (result.extend.pageInfo.pageNum == item) {
                numLi.addClass("active");
            }
            numLi.click(function () {
                to_page(item);
            });
            ul.append(numLi);
        });
        //添加下一页和末页 的提示
        ul.append(nextPageLi).append(lastPageLi);

        //把ul加入到nav
        var navEle = $("<nav></nav>").append(ul);
        navEle.appendTo("#page_nav_area");
    }


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
        //$("#empAddModal form")[0].reset();


        //弹出模态框
        $("#empAddModal").modal({
            backdrop: "static"
        });
    });

    //查出所有的楼栋信息并显示在下拉列表中
    function getApart(ele) {
        //清空之前下拉列表的值
        $(ele).empty();
        $.ajax({
            url: "${APP_PATH}/ApartPlus/apart",
            type: "GET",
            success: function (result) {
                $.each(result.extend.apart, function () {
                    var optionEle = $("<option></option>").append(this.apartApa).attr("value", this.apartId);
                    optionEle.appendTo(ele);
                });
            }
        });
    }

    //校验表单数据
    function validate_add_form() {
        //1、拿到要校验的数据，使用正则表达式
        var empName = $("#dormUsername_add_input").val();
        var regName = /^[a-zA-Z0-9_-]{6,16}$/;
        if (!regName.test(empName)) {
            return true;
        }

        //2、校验电话信息
        var dormTel = $("#dormTel_add_input").val();
        var regdormTel = /^1(3|4|5|7|8)\d{9}$/;
        ///^[1]+[3,8]+\\d{9}$/;
        if (!regdormTel.test(dormTel)) {

            return true;
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


    //点击保存，保存管理员信息。
    $("#apart_save_btn").click(function () {
        //1、模态框中填写的表单数据提交给服务器进行保存
        //1、先对要提交给服务器的数据进行校验
        if (!validate_add_form()) {
            return true;
        };
        //1、判断之前的ajax用户名校验是否成功。如果成功。
        if ($(this).attr("ajax-va") == "error") {
            return true;
        }
        //  alert($("#empAddModal form").serialize());
        $.ajax({
            url: "${APP_PATH}/ApartPlus/apartlife",
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
        // getApart("#empUpdateModal select");
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
            url: "${APP_PATH}/ApartPlus/dormmanager/" + id,
            type: "GET",
            success: function (result) {
                //console.log(result);
                var dormmDate = result.extend.dormm;
                $("#dormName_Update_input").val(dormmDate.apartApa);
            }
        });
    }

    $("#apart_update_btn").click(function () {
        $.ajax({
            url: "${APP_PATH}/ApartPlus/dormmanager/" + $(this).attr("edit-id"),
            type: "PUT",
            data: $("#empUpdateModal form").serialize(),
            success: function (result) {
                //alert(result.msg);
                //1、关闭对话框
                $("#empUpdateModal").modal("hide");
                //2、回到本页面
                to_page(currentPage);
            }
        });
    });


    //单个删除
    $(document).on("click", ".delete_btnapart", function () {
        //判断计时器是否处于关闭状态
        if (time == 0) {
            time = 1; //设定间隔时间（秒）
            //启动计时器，倒计时time秒后自动关闭计时器。
            var index = setInterval(function () {
                time--;
                if (time == 0) {
                    clearInterval(index);
                }
            }, 100);
        //1、弹出是否确认删除对话框
        var empName = $(this).parents("tr").find("td:eq(2)").text();
        var empId = $(this).attr("del-id");
        //alert($(this).parents("tr").find("td:eq(1)").text());
        if (confirm("确认删除【" + empName + "】吗？")) {
            //确认，发送ajax请求删除即可
            $.ajax({
                url: "${APP_PATH}/ApartPlus/dormmanager/" + empId,
                type: "DELETE",
                success: function (result) {

                    alert("删除成功！");
                    //回到本页
                    to_page(currentPage);
                }
            });
        }
		}
    });

    //完成全选/全不选功能
    $("#check_all").click(function () {
        //attr获取checked是undefined;
        //我们这些dom原生的属性；attr获取自定义属性的值；
        //prop修改和读取dom原生属性的值
        $(".check_item").prop("checked", $(this).prop("checked"));
    });

    //check_item
    $(document).on("click", ".check_item", function () {
        //判断当前选择中的元素是否5个
        var flag = $(".check_item:checked").length == $(".check_item").length;
        $("#check_all").prop("checked", flag);
    });

    //点击全部删除，就批量删除
    $("#emp_delete_all_btn").click(function () {
        //
        var empNames = "";
        var del_idstr = "";
        $.each($(".check_item:checked"), function () {
            //this
            empNames += $(this).parents("tr").find("td:eq(2)").text() + ",";
            //组装员工id字符串
            del_idstr += $(this).parents("tr").find("td:eq(1)").attr("namel") + "-";
        });
        //去除empNames多余的,
        empNames = empNames.substring(0, empNames.length - 1);
        //去除删除的id多余的-
        del_idstr = del_idstr.substring(0, del_idstr.length - 1);
        if (confirm("确认删除【" + empNames + "】吗？")) {
            //发送ajax请求删除
            $.ajax({
                url: "${APP_PATH}/ApartPlus/dormmanager/" + del_idstr,
                type: "DELETE",
                success: function (result) {
                    alert(result.msg);
                    //回到当前页面
                    to_page(currentPage);
                }
            });
        }
    });

</script>

