package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.dao.TUserMapper;
import test.entity.TUser;
import test.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    TUserMapper tUserMapper;

    @Override
    public boolean register(TUser tUser){

        if(tUserMapper.selectByName(tUser.getUserName())==null){
            tUserMapper.insert(tUser);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean checkLogin(String userName,String password){
        TUser tUser1=tUserMapper.selectByName(userName);
        if(tUser1==null){
            return false;
        }else {
            if(password.equals(tUser1.getPassword())){
                return true;
            }else{
                return false;
            }
        }
    }


}
