package test.dao;

import test.entity.TGoods;
import test.entity.TGoodsMessage;

public interface TGoodsMessageMapper {
    int insert(TGoodsMessage record);

    boolean insertSelective(TGoodsMessage record);

    TGoodsMessage selectById(Integer goodsId);

    boolean deleteMessageById(Integer goodsId);
}