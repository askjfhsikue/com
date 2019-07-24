package test.dao;

import test.entity.TIntegral;

public interface TIntegralMapper {
    boolean insert(int userId);

    int insertSelective(TIntegral record);
}