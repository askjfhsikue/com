package test.dao;

import test.entity.TOrder;

import java.util.List;

public interface TOrderMapper {
    boolean deleteByPrimaryKey(Integer orderId);

    boolean insert(TOrder record);

    int insertSelective(TOrder record);

    TOrder selectByPrimaryKey(Integer orderId);

    TOrder selectByUserId(Integer userId);

    int updateByPrimaryKeySelective(TOrder record);

    int updateByPrimaryKey(TOrder record);

    List<TOrder> selectAllOrder();
}