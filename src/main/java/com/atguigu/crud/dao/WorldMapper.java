package com.atguigu.crud.dao;

import com.atguigu.crud.bean.World;
import com.atguigu.crud.bean.WorldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorldMapper {
    long countByExample(WorldExample example);

    int deleteByExample(WorldExample example);

    int deleteByPrimaryKey(Integer worldId);

    int insert(World record);

    int insertSelective(World record);

    List<World> selectByExample(WorldExample example);

    World selectByPrimaryKey(Integer worldId);

    int updateByExampleSelective(@Param("record") World record, @Param("example") WorldExample example);

    int updateByExample(@Param("record") World record, @Param("example") WorldExample example);

    int updateByPrimaryKeySelective(World record);

    int updateByPrimaryKey(World record);
}