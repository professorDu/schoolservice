package com.usts.college.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.usts.college.bean.Apart;
import com.usts.college.bean.Dormmanager;
import com.usts.college.bean.Msg;
import com.usts.college.service.AdminApartService;

/**
 * 处理和楼栋有关的请求
 * @author lfy
 *
 */
@Controller
public class AdminApartController {
	
	@Autowired
	private  AdminApartService adminapartservice;
	
	@RequestMapping(value="/apart",method=RequestMethod.POST)
//	@PostMapping("/apartsave")
	@ResponseBody
	public Msg saveManagerApart(@Valid Dormmanager dormmanager,BindingResult result){
		if(result.hasErrors()){
			Map<String, Object> map = new HashMap<>();
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				/*System.out.println("错误的字段名："+fieldError.getField());
				System.out.println("错误信息："+fieldError.getDefaultMessage());*/
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
				
			}
			return Msg.fail().add("errorFields", map);
			
			
		}else{
			adminapartservice.saveDormmanager(dormmanager);
			return Msg.success();
			
		}
	
	}
	
	
	/**
	 * 返回所有楼栋信息
	 */
	@RequestMapping("/apart")
	//@GetMapping("/apart")
	@ResponseBody
	public Msg getApart(){
		List<Apart> list = adminapartservice.getApart();
		return Msg.success().add("apart", list);
	}
	
     

}
