package test.dao;

import org.springframework.stereotype.Repository;
import test.entity.User;

@Repository
public interface UserMapper {
    User selectById(int id);
    User selectByName(String name);
    boolean checkLogin(String name,String password);

}
