package test.dao;

import test.entity.TCart;

public interface TCartMapper {
    int insert(TCart record);

    int insertSelective(TCart record);
}