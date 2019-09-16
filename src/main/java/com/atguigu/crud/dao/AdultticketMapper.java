package com.atguigu.crud.dao;

import com.atguigu.crud.bean.Adultticket;
import com.atguigu.crud.bean.AdultticketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdultticketMapper {
    long countByExample(AdultticketExample example);

    int deleteByExample(AdultticketExample example);

    int deleteByPrimaryKey(Integer adultId);

    int insert(Adultticket record);

    int insertSelective(Adultticket record);

    List<Adultticket> selectByExample(AdultticketExample example);
    
    List<Adultticket> selectByExampleorder(AdultticketExample example);
    
    

    Adultticket selectByPrimaryKey(Integer adultId);

    int updateByExampleSelective(@Param("record") Adultticket record, @Param("example") AdultticketExample example);

    int updateByExample(@Param("record") Adultticket record, @Param("example") AdultticketExample example);

    int updateByPrimaryKeySelective(Adultticket record);

    int updateByPrimaryKey(Adultticket record);
}