package test.dao;

import org.apache.ibatis.annotations.Param;
import test.entity.TUser;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer userId);

    boolean insert(TUser record);

    boolean updatePower(@Param("userId")Integer userId,@Param("power")Integer power);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer userId);

    TUser selectByName(String username);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}