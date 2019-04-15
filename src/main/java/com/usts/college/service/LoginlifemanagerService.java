package com.usts.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usts.college.bean.LifemanagerExample;
import com.usts.college.bean.LifemanagerExample.Criteria;
import com.usts.college.dao.LifemanagerMapper;



@Service
public class LoginlifemanagerService {
	@Autowired
	LifemanagerMapper lifemanagermapper;
	
	public boolean loginLife(String username, String password) {
		LifemanagerExample lifemanagerexample = new LifemanagerExample();
		Criteria criteria = lifemanagerexample.createCriteria();
	//	criteria.andLifeNameEqualTo(username);
		criteria.andLifeUsernameEqualTo(username);
		criteria.andLifePasswordEqualTo(password);
		
		return lifemanagermapper.selectByExample(lifemanagerexample).size() != 0;
	}

}
