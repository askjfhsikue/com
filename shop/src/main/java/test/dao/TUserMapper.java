package test.dao;

import test.entity.TUser;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer userId);

    boolean insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer userId);

    TUser selectByName(String username);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}