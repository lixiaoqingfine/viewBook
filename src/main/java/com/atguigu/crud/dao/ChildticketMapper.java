package com.atguigu.crud.dao;

import com.atguigu.crud.bean.Childticket;
import com.atguigu.crud.bean.ChildticketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChildticketMapper {
    long countByExample(ChildticketExample example);

    int deleteByExample(ChildticketExample example);

    int deleteByPrimaryKey(Integer childId);

    int insert(Childticket record);

    int insertSelective(Childticket record);

    List<Childticket> selectByExample(ChildticketExample example);
    
    List<Childticket> selectByExampleOrder(ChildticketExample example);

    Childticket selectByPrimaryKey(Integer childId);

    int updateByExampleSelective(@Param("record") Childticket record, @Param("example") ChildticketExample example);

    int updateByExample(@Param("record") Childticket record, @Param("example") ChildticketExample example);

    int updateByPrimaryKeySelective(Childticket record);

    int updateByPrimaryKey(Childticket record);
}