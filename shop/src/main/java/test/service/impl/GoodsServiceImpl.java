package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.dao.TGoodsMapper;
import test.dao.TGoodsMessageMapper;
import test.entity.TGoods;
import test.entity.TGoodsMessage;
import test.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    TGoodsMapper tGoodsMapper;
    @Autowired
    TGoodsMessageMapper tGoodsMessageMapper;

    @Override
    public  TGoods selectByPrimaryKey(Integer goodsId){
        return tGoodsMapper.selectByPrimaryKey(goodsId);
    }

    @Override
    public TGoodsMessage selectById(Integer goodsId){
        return tGoodsMessageMapper.selectById(goodsId);
    }

    @Override
    public boolean addGoods(TGoods tGoods,TGoodsMessage tGoodsMessage){

        return (tGoodsMapper.insert(tGoods)&&tGoodsMessageMapper.insertSelective(tGoodsMessage))?true:false;
    }

    @Override
    public boolean addGoodsMessage(TGoodsMessage tGoodsMessage){
        return tGoodsMessageMapper.insertSelective(tGoodsMessage);
    }

    @Override
    public boolean deleteGoods(Integer goodsId){
        if(tGoodsMapper.selectByPrimaryKey(goodsId)!=null) {  //判断是否存在该商品
            return tGoodsMapper.deleteById(goodsId);
        }else {
            if(tGoodsMessageMapper.selectById(goodsId)!=null){  //判断是否存在该商品的信息
                return tGoodsMessageMapper.deleteMessageById(goodsId);
            }else {
                return true;
            }
        }
    }
}
