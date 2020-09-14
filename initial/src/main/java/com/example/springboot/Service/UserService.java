package com.example.springboot.Service;

import com.example.springboot.Entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    /**
     * get user information by id
     * @param id
     * @return user
     */
    public UserEntity getUserInfo(Integer id) {
        //TODO
        return new UserEntity();
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
