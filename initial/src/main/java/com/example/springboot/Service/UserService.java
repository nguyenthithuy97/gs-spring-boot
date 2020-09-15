package com.example.springboot.Service;

import com.example.springboot.Repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  user Service
 *  author Thuynt2
 */

@Service
public class UserService {

    // repository
    private UserMapper userMapper;

    // Constructor
    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * get user information by id
     * @param id
     * @return user
     */
    public String getUserInfo(Integer id) {
        return userMapper.selectUserByID(id).toString();
    }

    /**
     * say hello everyUser
     * @param name
     * @return Hello userName
     */
    public String getWelcomeMess(String name) {
        return String.format("Hello %s!",  name);
    }
}
