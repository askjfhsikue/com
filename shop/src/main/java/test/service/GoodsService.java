package test.service;

import test.entity.TGoods;
import test.entity.TGoodsMessage;

public interface GoodsService {
    TGoods selectByPrimaryKey(Integer goodsId);
    TGoodsMessage selectById(Integer goodsId);
    boolean addGoods(TGoods tGoods,TGoodsMessage tGoodsMessage);
    boolean addGoodsMessage(TGoodsMessage tGoodsMessage);
    boolean deleteGoods(Integer goodsId);

}
