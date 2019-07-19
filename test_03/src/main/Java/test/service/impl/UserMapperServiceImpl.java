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

}
