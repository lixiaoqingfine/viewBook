package com.atguigu.crud.dao;

import com.atguigu.crud.bean.Orderinfo;
import com.atguigu.crud.bean.OrderinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderinfoMapper {
    long countByExample(OrderinfoExample example);

    int deleteByExample(OrderinfoExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Orderinfo record);

    int insertSelective(Orderinfo record);

    List<Orderinfo> selectByExample(OrderinfoExample example);

    Orderinfo selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Orderinfo record, @Param("example") OrderinfoExample example);

    int updateByExample(@Param("record") Orderinfo record, @Param("example") OrderinfoExample example);

    int updateByPrimaryKeySelective(Orderinfo record);

    int updateByPrimaryKey(Orderinfo record);
}