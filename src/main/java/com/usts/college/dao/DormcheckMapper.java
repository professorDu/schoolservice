package com.usts.college.dao;

import com.usts.college.bean.Dormcheck;
import com.usts.college.bean.DormcheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DormcheckMapper {
    long countByExample(DormcheckExample example);

    int deleteByExample(DormcheckExample example);

    int deleteByPrimaryKey(Integer dormcheckId);

    int insert(Dormcheck record);

    int insertSelective(Dormcheck record);

    List<Dormcheck> selectByExample(DormcheckExample example);

    Dormcheck selectByPrimaryKey(Integer dormcheckId);
    //检查宿舍查询连接宿舍和楼栋
    List<Dormcheck> selectByExampleWithCheckRAndA(DormcheckExample example);

    Dormcheck selectByPrimaryKeyCheckWithCheckRAndA(Integer dormcheckId);

    int updateByExampleSelective(@Param("record") Dormcheck record, @Param("example") DormcheckExample example);

    int updateByExample(@Param("record") Dormcheck record, @Param("example") DormcheckExample example);

    int updateByPrimaryKeySelective(Dormcheck record);

    int updateByPrimaryKey(Dormcheck record);
}