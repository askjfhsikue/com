package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.entity.TIntegral;
import test.entity.TIntegralExample;

public interface TIntegralMapper {
    int countByExample(TIntegralExample example);

    int deleteByExample(TIntegralExample example);

    int insert(TIntegral record);

    int insertSelective(TIntegral record);

    List<TIntegral> selectByExample(TIntegralExample example);

    int updateByExampleSelective(@Param("record") TIntegral record, @Param("example") TIntegralExample example);

    int updateByExample(@Param("record") TIntegral record, @Param("example") TIntegralExample example);
}