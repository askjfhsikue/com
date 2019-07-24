package test.service;

import test.entity.TOrder;

import java.util.List;

public interface OrderService {
    TOrder selectByUserId(Integer userId);

    boolean deleteByPrimaryKey(Integer orderId);

    List<TOrder> selectAllOrder();

    boolean insert(TOrder record);

}
