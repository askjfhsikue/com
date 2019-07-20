package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.entity.TStorehouse;
import test.entity.TStorehouseExample;

public interface TStorehouseMapper {
    int countByExample(TStorehouseExample example);

    int deleteByExample(TStorehouseExample example);

    int insert(TStorehouse record);

    int insertSelective(TStorehouse record);

    List<TStorehouse> selectByExample(TStorehouseExample example);

    int updateByExampleSelective(@Param("record") TStorehouse record, @Param("example") TStorehouseExample example);

    int updateByExample(@Param("record") TStorehouse record, @Param("example") TStorehouseExample example);
}