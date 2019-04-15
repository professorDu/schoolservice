package com.usts.college.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usts.college.bean.Apart;
import com.usts.college.bean.Dormmanager;
import com.usts.college.dao.ApartMapper;
import com.usts.college.dao.DormmanagerMapper;
@Service
public class AdminApartService {
	
	@Autowired
	private ApartMapper apartmapper;
	
	@Autowired
	private DormmanagerMapper dormmanagermapper;

	public List<Apart> getApart() {
		List<Apart> list = apartmapper.selectByExample(null);
		return list;
	}

	public void saveDormmanager(Dormmanager dormmanager) {
		dormmanagermapper.insertSelective(dormmanager);
		
	
	}


	

}
