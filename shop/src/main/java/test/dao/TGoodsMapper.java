package test.dao;

import java.util.List;

import test.entity.TGoods;

public interface TGoodsMapper {
    int countByExample(int example);

    int deleteByExample(int example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(TGoods record);

    int insertSelective(TGoods record);

    List<TGoods> selectByExample(int example);

    TGoods selectByPrimaryKey(Integer goodsId);

//    int updateByExampleSelective(@Param("record") TGoods record, @Param("example")  example);
//
//    int updateByExample(@Param("record") TGoods record, @Param("example")  example);

    int updateByPrimaryKeySelective(TGoods record);

    int updateByPrimaryKey(TGoods record);
}