package com.usts.college.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.usts.college.bean.Dormmanager;
import com.usts.college.service.AdminManagerService;
import com.usts.college.bean.Msg;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class AdminManagerController {

	@Autowired
	AdminManagerService adminManagerservice;
	
	

	/**
	 * 单个批量二合一
	 * 批量删除：1-2-3
	 * 单个删除：1
	 * 
	 * @param ids
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/dormmanager/{ids}",method=RequestMethod.DELETE)
	public Msg deleteDormmanager(@PathVariable("ids")String ids){
				//批量删除
				if(ids.contains("-")){
					List<Integer> del_ids = new ArrayList<>();
					String[] str_ids = ids.split("-");
					//组装id的集合
					for (String string : str_ids) {
						del_ids.add(Integer.parseInt(string));
					}
					adminManagerservice.deleteBatch(del_ids);
				}else{
					Integer id = Integer.parseInt(ids);
					adminManagerservice.deleteDormmanager(id);
				}
				return Msg.success();
		
		
	}

	/**
	 * 如果直接发送ajax=PUT形式的请求
	 * 封装的数据
	 * Employee 
	 * [empId=1014, empName=null, gender=null, email=null, dId=null]
	 * 
	 * 问题：
	 * 请求体中有数据；
	 * 但是Employee对象封装不上；
	 * update tbl_emp  where emp_id = 1014;
	 * 
	 * 原因：
	 * Tomcat：
	 * 		1、将请求体中的数据，封装一个map。
	 * 		2、request.getParameter("empName")就会从这个map中取值。
	 * 		3、SpringMVC封装POJO对象的时候。
	 * 				会把POJO中每个属性的值，request.getParamter("email");
	 * AJAX发送PUT请求引发的血案：
	 * 		PUT请求，请求体中的数据，request.getParameter("empName")拿不到
	 * 		Tomcat一看是PUT不会封装请求体中的数据为map，只有POST形式的请求才封装请求体为map
	 * org.apache.catalina.connector.Request--parseParameters() (3111);
	 * 
	 * protected String parseBodyMethods = "POST";
	 * if( !getConnector().isParseBodyMethod(getMethod()) ) {
                success = true;
                return;
            }
	 * 
	 * 
	 * 解决方案；
	 * 我们要能支持直接发送PUT之类的请求还要封装请求体中的数据
	 * 1、配置上HttpPutFormContentFilter；
	 * 2、他的作用；将请求体中的数据解析包装成一个map。
	 * 3、request被重新包装，request.getParameter()被重写，就会从自己封装的map中取数据
	 * 员工更新方法
	 * @param dormmanager
	 * @return
	 */
	@RequestMapping(value = "/dormmanager/{dormId}", method = RequestMethod.PUT)
	@ResponseBody
	public Msg saveDormmanager(Dormmanager dormmanager,HttpServletRequest request) {
		adminManagerservice.updateDormmanager(dormmanager);

		return Msg.success();
	}

	/**
	 * 根据id查询宿舍管理员信息
	 */
	@RequestMapping(value = "/dormmanager/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getDormmanager(@PathVariable("id") Integer id) {
		Dormmanager dormmanager = adminManagerservice.getDormmanager(id);
		return Msg.success().add("dormm", dormmanager);
	}

	@RequestMapping("/managerinfo")
	@ResponseBody
	public Msg getEmpsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Dormmanager> emps = adminManagerservice.getAll();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(emps, 5);
		return Msg.success().add("pageInfo", page);
	}

	/**
	 * 检查宿舍管理员的用户名是否可用
	 * 
	 * @return true 代表当前用户名可用 false为不可用
	 */
	@RequestMapping("/checkdormUsername")
	@ResponseBody
	public Msg dormUsername(@RequestParam("dormUsername") String dormUsername) {

		String regx = "^[a-zA-Z0-9_-]{6,16}$";
		if (!dormUsername.matches(regx)) {
			return Msg.fail().add("va_msg", "用户名为6-16位英文和数字的组合");
		}
		// 数据库名重复校验
		Boolean b = adminManagerservice.checkdormUsername(dormUsername);
		if (b) {
			return Msg.success();
		} else {
			return Msg.fail().add("va_msg", "用户名不可用");
		}

	}
}
