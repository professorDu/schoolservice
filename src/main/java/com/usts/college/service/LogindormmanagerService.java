package com.usts.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usts.college.bean.DormmanagerExample;
import com.usts.college.bean.DormmanagerExample.Criteria;
import com.usts.college.dao.DormmanagerMapper;



@Service
public class LogindormmanagerService {
	@Autowired
	DormmanagerMapper dormmanagermapper;
	


	public boolean loginManager(String username, String password) {
		DormmanagerExample dormmanagerexample = new DormmanagerExample();
		Criteria criteria = dormmanagerexample.createCriteria();
		//criteria.andDormNameEqualTo(username);
		criteria.andDormUsernameEqualTo(username);
		criteria.andDormPasswordEqualTo(password);
		
	//	dormmanagermapper.se
		
		return dormmanagermapper.selectByExample(dormmanagerexample).size() != 0;
	}
	

}
