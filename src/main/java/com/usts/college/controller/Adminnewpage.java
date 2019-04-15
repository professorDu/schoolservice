package com.usts.college.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Adminnewpage {

	/**
	 * 导入jackson包。
	 * 
	 * @param
	 * @return
	 */
	@RequestMapping("/adminnewpage")
	@ResponseBody
	public String getNewPageJson(@RequestParam("id") String id) {
		if (id.equals("1")) {
			return "adminblank";
		}
		else if(id.equals("2")){
			return "adminmanager";
		}
		else if(id.equals("3")){
			return "adminapart";
		}
		else if(id.equals("4")){
			return "adminstudent";
		}
		else if(id.equals("5")){
			return "adminlife";
		}
		else if(id.equals("6")){
			return "adminpass";
		}

		return "adminblank";
	}
	@RequestMapping("/adminblank")
	public String adminblank() {
			return "adminBlank";
	}
	
	@RequestMapping("/adminmanager")
	public String adminmanager() {
			return "adminManager";
	}
	
	@RequestMapping("/adminapart")
	public String adminapart() {
			return "adminApart";
	}
	
	@RequestMapping("/adminstudent")
	public String adminstudent() {
			return "adminStudent";
	}
	
	@RequestMapping("/adminlife")
	public String adminlife() {
			return "adminLife";
	}
	
	@RequestMapping("/adminpass")
	public String adminpass() {
			return "adminPass";
	}
}
