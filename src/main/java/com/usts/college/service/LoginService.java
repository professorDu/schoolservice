package com.usts.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.usts.college.bean.SupermanagerExample;
import com.usts.college.bean.SupermanagerExample.Criteria;
import com.usts.college.dao.SupermanagerMapper;

@Service
public class LoginService {
	@Autowired
	SupermanagerMapper supermanagerMapper;
	

	public boolean loginAdmin(String username, String password) {
		SupermanagerExample supermanagerExample = new SupermanagerExample();
		Criteria criteria = supermanagerExample.createCriteria();
		criteria.andSuperNameEqualTo(username);
		criteria.andSuperPassEqualTo(password);
		return supermanagerMapper.selectByExample(supermanagerExample).size() != 0;
	}
	
	
}
