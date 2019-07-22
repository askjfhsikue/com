package test.dao;

import java.util.List;

import test.entity.TGoodsMessage;

public interface TGoodsMessageMapper {
    int countByExample(int example);

    int deleteByExample(int example);

    int insert(TGoodsMessage record);

    int insertSelective(TGoodsMessage record);

    List<TGoodsMessage> selectByExample(int example);

//    int updateByExampleSelective(@Param("record") TGoodsMessage record, @Param("example")   example);
//
//    int updateByExample(@Param("record") TGoodsMessage record, @Param("example")   example);
}