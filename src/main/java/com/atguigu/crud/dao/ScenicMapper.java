package com.atguigu.crud.dao;

import com.atguigu.crud.bean.Scenic;
import com.atguigu.crud.bean.ScenicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicMapper {
    long countByExample(ScenicExample example);

    int deleteByExample(ScenicExample example);

    int deleteByPrimaryKey(Integer scenicId);

    int insert(Scenic record);

    int insertSelective(Scenic record);

    List<Scenic> selectByExample(ScenicExample example);
    
    List<Scenic> selectByExampleOrder(ScenicExample example);
    
    

    Scenic selectByPrimaryKey(Integer scenicId);
    
    // 连表查询adultticket表
    List<Scenic> selectByExampleWithAdult(ScenicExample example);
    
 // 连表查询adultticket表
    Scenic selectByPrimaryKeyWithAdult(Integer scenicId);
    
    // 连表查询all表
    List<Scenic> selectByExampleWithAll(ScenicExample example);
    
 // 连表查询all表
    Scenic selectByPrimaryKeyWithAll(Integer scenicId);

    int updateByExampleSelective(@Param("record") Scenic record, @Param("example") ScenicExample example);

    int updateByExample(@Param("record") Scenic record, @Param("example") ScenicExample example);

    int updateByPrimaryKeySelective(Scenic record);

    int updateByPrimaryKey(Scenic record);
}