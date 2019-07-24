package test.dao;

import test.entity.TGoods;

public interface TGoodsMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(TGoods record);

    int insertSelective(TGoods record);

    TGoods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(TGoods record);

    int updateByPrimaryKey(TGoods record);
}