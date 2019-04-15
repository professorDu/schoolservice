package com.usts.college.service;


import com.usts.college.bean.Lifemanager;
import com.usts.college.bean.LifemanagerExample;
import com.usts.college.dao.LifemanagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminLifeManagerService {
    @Autowired
    private LifemanagerMapper lifemanagermapper;
    public void saveDormmanager(Lifemanager lifemanager) {
       // dormmanagermapper.insertSelective(dormmanager);
        lifemanagermapper.insertSelective(lifemanager);
    }
    /**
     * 查询所有管理员信息
     * @return
     */
    public List<Lifemanager> getAll() {
        // TODO Auto-generated method stub
       // return lifemanagermapper.selectByExampleWithApart(null);
        return lifemanagermapper.selectByExample(null);
    }


    /**
     * 查询所有管理员信息
     * @return true 代表当前用户名可用   false为不可用
     */
    public Boolean checkdormUsername(String dormUsername) {
        //DormmanagerExample example = new DormmanagerExample();
        LifemanagerExample example =new LifemanagerExample();
        LifemanagerExample.Criteria criteria = example.createCriteria();
       // criteria.andDormUsernameEqualTo(dormUsername);
        criteria.andLifeUsernameEqualTo(dormUsername);
        long count = lifemanagermapper.countByExample(example);
        return count==0;
    }


    public Lifemanager getDormmanager(Integer id) {
        Lifemanager lifemanager = lifemanagermapper.selectByPrimaryKey(id);
        return lifemanager;
    }

    /**
     * 更新管理员信息
     * @return true 代表当前用户名可用   false为不可用
     */
    public void updateDormmanager(Lifemanager lifemanager) {
        lifemanagermapper.updateByPrimaryKeySelective(lifemanager);


    }

    /**
     * 删除管理员信息
     * @return true 代表当前用户名可用   false为不可用
     */
    public void deleteDormmanager(Integer ids) {
        lifemanagermapper.deleteByPrimaryKey(ids);

    }

    /**
     * 批量删除管理员信息
     * @return true 代表当前用户名可用   false为不可用
     */
    public void deleteBatch(List<Integer> del_ids) {

      //  DormmanagerExample example = new DormmanagerExample();
        LifemanagerExample example = new LifemanagerExample();
        LifemanagerExample.Criteria criteria = example.createCriteria();
        //criteria.andDormIdIn(del_ids);
       criteria.andLifeIdIn(del_ids);
//        criteria.andLifeUsernameIn();
        lifemanagermapper.deleteByExample(example);


    }

}
