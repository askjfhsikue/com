package test.service;

import test.entity.TUser;

public interface UserService {
    boolean register(TUser tUser);
    boolean checkLogin(String userName,String password);

}
