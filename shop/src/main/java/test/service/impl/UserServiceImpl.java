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
        TUser tUser1=tUserMapper.selectByName(tUser.getUserName());
        if(tUser1==null){
            tUserMapper.insert(tUser);
            return true;
        }else {
            return false;
        }
    }
}
