package test.dao;

import java.util.List;

import test.entity.TIntegral;

public interface TIntegralMapper {
    int countByExample(int example);

    int deleteByExample(int example);

    int insert(TIntegral record);

    int insertSelective(TIntegral record);

    List<TIntegral> selectByExample(int example);

//    int updateByExampleSelective(@Param("record") TIntegral record, @Param("example")   example);
//
//    int updateByExample(@Param("record") TIntegral record, @Param("example")   example);
}