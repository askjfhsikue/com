package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.dao.TIntegralMapper;
import test.dao.TUserMapper;
import test.entity.TUser;
import test.service.UserService;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    TUserMapper tUserMapper;
    @Autowired
    TIntegralMapper tIntegralMapper;

    @Override
    public boolean register(TUser tUser){

        if(tUserMapper.selectByName(tUser.getUserName())==null){
            tUserMapper.insert(tUser);
            TUser tUser1=tUserMapper.selectByName(tUser.getUserName());
            tIntegralMapper.insert(tUser1.getUserId());
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


    @Override
    public Map<String,Object> checkLogin(TUser tUser){
        Map<String,Object> map=new HashMap<>();
        TUser tUser1=tUserMapper.selectByName(tUser.getUserName());
        if(tUser!=null) {
            if(tUser1.getPassword().equals(tUser.getPassword())){
                map.put("state",true);
                map.put("power",tUser.getPower());
            }else {
                map.put("state",false);
            }
        }else {
            map.put("state",false);
        }
        return map;
    }

    @Override
    public TUser selectByName(String username){
        return tUserMapper.selectByName(username);
    }




}
