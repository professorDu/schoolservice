package com.usts.college.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usts.college.bean.Dormmanager;
import com.usts.college.bean.DormmanagerExample;
import com.usts.college.bean.DormmanagerExample.Criteria;
import com.usts.college.dao.DormmanagerMapper;


@Service
public class AdminManagerService {
	
	@Autowired
	DormmanagerMapper dormmanagermapper;
	
	/**
	 * 查询所有管理员信息
	 * @return
	 */
	public  List<Dormmanager> getAll() {
		// TODO Auto-generated method stub
		return dormmanagermapper.selectByExampleWithApart(null);
	}

	
	/**
	 * 查询所有管理员信息
	 * @return true 代表当前用户名可用   false为不可用
	 */
	public Boolean checkdormUsername(String dormUsername) {
		DormmanagerExample example = new DormmanagerExample();
		Criteria criteria = example.createCriteria();
		criteria.andDormUsernameEqualTo(dormUsername);
		long count = dormmanagermapper.countByExample(example);
		return count==0;
	}


	public Dormmanager getDormmanager(Integer id) {
		Dormmanager dormmanager = dormmanagermapper.selectByPrimaryKey(id);
		return dormmanager;
	}

	/**
	 * 更新管理员信息
	 * @return true 代表当前用户名可用   false为不可用
	 */
	public void updateDormmanager(Dormmanager dormmanager) {
		dormmanagermapper.updateByPrimaryKeySelective(dormmanager);
		
		
	}

	/**
	 * 删除管理员信息
	 * @return true 代表当前用户名可用   false为不可用
	 */
	public void deleteDormmanager(Integer ids) {
		dormmanagermapper.deleteByPrimaryKey(ids);
		
	}

	/**
	 * 批量删除管理员信息
	 * @return true 代表当前用户名可用   false为不可用
	 */
	public void deleteBatch(List<Integer> del_ids) {
		
		DormmanagerExample example = new DormmanagerExample();
		Criteria criteria = example.createCriteria();
		criteria.andDormIdIn(del_ids);
		dormmanagermapper.deleteByExample(example);
		
		
	}


}
