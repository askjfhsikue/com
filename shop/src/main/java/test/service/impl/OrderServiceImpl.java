package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.dao.TOrderMapper;
import test.entity.TOrder;
import test.service.OrderService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    TOrderMapper tOrderMapper;

    @Override
    public TOrder selectByUserId(Integer userId){
        return tOrderMapper.selectByUserId(userId);
    }

    @Override
    public boolean insert(TOrder tOrder){
        return tOrderMapper.insert(tOrder);
    }

    @Override
    public boolean deleteByPrimaryKey(Integer orderId){
        return tOrderMapper.deleteByPrimaryKey(orderId);
    }

    @Override
    public List<TOrder> selectAllOrder(){
        return tOrderMapper.selectAllOrder();
    }



}
