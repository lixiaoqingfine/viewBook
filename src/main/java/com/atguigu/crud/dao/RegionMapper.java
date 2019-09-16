package com.atguigu.crud.dao;

import com.atguigu.crud.bean.Region;
import com.atguigu.crud.bean.RegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegionMapper {
    long countByExample(RegionExample example);

    int deleteByExample(RegionExample example);

    int deleteByPrimaryKey(Integer regionId);

    int insert(Region record);

    int insertSelective(Region record);

    List<Region> selectByExample(RegionExample example);
    
    List<Region> selectByExampleWithAddress(RegionExample example);

    Region selectByPrimaryKey(Integer regionId);
    
    Region selectByPrimaryKeyWidthAddress(Integer regionId);
    
 

    int updateByExampleSelective(@Param("record") Region record, @Param("example") RegionExample example);

    int updateByExample(@Param("record") Region record, @Param("example") RegionExample example);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKey(Region record);
}