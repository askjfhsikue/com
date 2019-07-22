package test.dao;

import java.util.List;

import test.entity.TUser;


public interface TUserMapper {
    int countByExample(int example);

    int deleteByExample(int example);

    int deleteByPrimaryKey(Integer userId);

    void insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(int example);

    TUser selectByPrimaryKey(Integer userId);

    TUser selectByName(String userName);

//    int updateByExampleSelective(@Param("record") TUser record, @Param("example")  example);
//
//    int updateByExample(@Param("record") TUser record, @Param("example")  example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}