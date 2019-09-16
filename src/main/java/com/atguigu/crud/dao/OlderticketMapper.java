package com.atguigu.crud.dao;

import com.atguigu.crud.bean.Olderticket;
import com.atguigu.crud.bean.OlderticketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OlderticketMapper {
    long countByExample(OlderticketExample example);

    int deleteByExample(OlderticketExample example);

    int deleteByPrimaryKey(Integer olderId);

    int insert(Olderticket record);

    int insertSelective(Olderticket record);

    List<Olderticket> selectByExample(OlderticketExample example);
    
    List<Olderticket> selectByExampleOlder(OlderticketExample example);
    
    

    Olderticket selectByPrimaryKey(Integer olderId);

    int updateByExampleSelective(@Param("record") Olderticket record, @Param("example") OlderticketExample example);

    int updateByExample(@Param("record") Olderticket record, @Param("example") OlderticketExample example);

    int updateByPrimaryKeySelective(Olderticket record);

    int updateByPrimaryKey(Olderticket record);
}