package com.usts.college.service;

import com.usts.college.bean.Apart;
import com.usts.college.bean.ApartExample;
import com.usts.college.dao.ApartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminApartPlusService {
    @Autowired
    private ApartMapper apartmapper;

    public void saveDormmanager(Apart apart) {
        // dormmanagermapper.insertSelective(dormmanager);
        apartmapper.insertSelective(apart);
    }
    /**
     * 查询所有管理员信息
     * @return
     */
    public List<Apart> getAll() {
        // TODO Auto-generated method stub
        // return lifemanagermapper.selectByExampleWithApart(null);
        return apartmapper.selectByExample(null);
    }


    /**
     * 查询所有管理员信息
     * @return true 代表当前用户名可用   false为不可用
     */
    public Boolean checkdormUsername(String dormUsername) {
        ApartExample example = new ApartExample();
        ApartExample.Criteria criteria = example.createCriteria();
        //criteria.andLifeUsernameEqualTo(dormUsername);
        criteria.andApartApaEqualTo(dormUsername);
        long count = apartmapper.countByExample(example);
        return count==0;
    }


    public Apart getDormmanager(Integer id) {
      //  Lifemanager lifemanager = lifemanagermapper.selectByPrimaryKey(id);
        Apart apart = apartmapper.selectByPrimaryKey(id);
        return apart;
    }

    /**
     * 更新管理员信息
     * @return true 代表当前用户名可用   false为不可用
     */
    public void updateDormmanager(Apart apart) {
        apartmapper.updateByPrimaryKeySelective(apart);


    }

    /**
     * 删除管理员信息
     * @return true 代表当前用户名可用   false为不可用
     */
    public void deleteDormmanager(Integer ids) {
        apartmapper.deleteByPrimaryKey(ids);

    }

    /**
     * 批量删除管理员信息
     * @return true 代表当前用户名可用   false为不可用
     */
    public void deleteBatch(List<Integer> del_ids) {
        ApartExample example = new ApartExample();
        ApartExample.Criteria criteria = example.createCriteria();
        criteria.andApartIdIn(del_ids);
        apartmapper.deleteByExample(example);



    }
}
