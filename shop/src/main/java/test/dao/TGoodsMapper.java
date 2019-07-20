package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.entity.TGoods;
import test.entity.TGoodsExample;

public interface TGoodsMapper {
    int countByExample(TGoodsExample example);

    int deleteByExample(TGoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(TGoods record);

    int insertSelective(TGoods record);

    List<TGoods> selectByExample(TGoodsExample example);

    TGoods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") TGoods record, @Param("example") TGoodsExample example);

    int updateByExample(@Param("record") TGoods record, @Param("example") TGoodsExample example);

    int updateByPrimaryKeySelective(TGoods record);

    int updateByPrimaryKey(TGoods record);
}