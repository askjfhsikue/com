package test.service;

import org.apache.ibatis.annotations.Param;
import test.entity.TUser;

import java.util.Map;

public interface UserService {
    boolean checkLogin(String userName,String password);
    TUser selectByName(String username);
    Map<String,Object> checkLogin(TUser tUser);
    boolean register(TUser tUser);
    boolean changePermissions(Integer userId,Integer power);




}
