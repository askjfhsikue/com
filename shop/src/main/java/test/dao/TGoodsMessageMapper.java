package test.dao;

import test.entity.TGoods;
import test.entity.TGoodsMessage;

public interface TGoodsMessageMapper {
    int insert(TGoodsMessage record);

    int insertSelective(TGoodsMessage record);

    TGoodsMessage selectByIdL(Integer goodsId);
}