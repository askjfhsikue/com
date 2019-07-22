package test.dao;

import java.util.List;

import test.entity.TStorehouse;

public interface TStorehouseMapper {
    int countByExample(int example);

    int deleteByExample(int example);

    int insert(TStorehouse record);

    int insertSelective(TStorehouse record);

    List<TStorehouse> selectByExample(int example);

//    int updateByExampleSelective(@Param("record") TStorehouse record, @Param("example")   example);
//
//    int updateByExample(@Param("record") TStorehouse record, @Param("example")   example);
}