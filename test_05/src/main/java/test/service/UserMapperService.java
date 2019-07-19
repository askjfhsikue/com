package test.service;

import test.entity.User;

public interface UserMapperService {

    User selectById(int id);
    User selectByName(String name);
    boolean checkLogin(String name,String password);
}
