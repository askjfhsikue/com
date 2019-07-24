package test.dao;

import test.entity.TGoods;

public interface TGoodsMapper {
    boolean deleteByPrimaryKey(Integer goodsId);

    boolean deleteById(Integer goodsId);

    boolean insert(TGoods record);

    int insertSelective(TGoods record);

    TGoods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(TGoods record);

    int updateByPrimaryKey(TGoods record);
}