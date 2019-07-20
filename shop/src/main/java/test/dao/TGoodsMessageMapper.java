package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.entity.TGoodsMessage;
import test.entity.TGoodsMessageExample;

public interface TGoodsMessageMapper {
    int countByExample(TGoodsMessageExample example);

    int deleteByExample(TGoodsMessageExample example);

    int insert(TGoodsMessage record);

    int insertSelective(TGoodsMessage record);

    List<TGoodsMessage> selectByExample(TGoodsMessageExample example);

    int updateByExampleSelective(@Param("record") TGoodsMessage record, @Param("example") TGoodsMessageExample example);

    int updateByExample(@Param("record") TGoodsMessage record, @Param("example") TGoodsMessageExample example);
}