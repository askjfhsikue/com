package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.dao.UserMapper;
import test.entity.User;
import test.service.UserMapperService;

@Service
public class UserMapperServiceImpl implements UserMapperService {
    @Autowired(required = false)
    UserMapper userMapper;

    @Override
    public User selectById(int id){
        System.out.println("service被调用");

        if(userMapper.selectById(id)==null){
            System.out.println("失败");
        }else{
            System.out.println("成功");
        }
        return userMapper.selectById(id);

    }
    @Override
    public User selectByName(String name){
        return userMapper.selectByName(name);
    }

    @Override
    public boolean checkLogin(String name,String password){
        if(userMapper.selectByName(name)!=null){
        if(userMapper.selectByName(name).getPassword().equals(password)){
            return true;
        }else {
            return false;
        }}else {
            return false;
        }
    }
}
