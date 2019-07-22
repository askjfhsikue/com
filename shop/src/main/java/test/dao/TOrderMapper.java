package test.dao;

import java.util.List;

import test.entity.TOrder;

public interface TOrderMapper {
    int countByExample(int example);

    int deleteByExample(int example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(TOrder record);

    int insertSelective(TOrder record);

    List<TOrder> selectByExample(int example);

    TOrder selectByPrimaryKey(Integer orderId);

//    int updateByExampleSelective(@Param("record") TOrder record, @Param("example")   example);
//
//    int updateByExample(@Param("record") TOrder record, @Param("example")   example);

    int updateByPrimaryKeySelective(TOrder record);

    int updateByPrimaryKey(TOrder record);
}