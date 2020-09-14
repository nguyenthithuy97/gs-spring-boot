package com.example.springboot.Service;

import com.example.springboot.Entity.UserEntity;
import com.example.springboot.Repository.UserRepository;
import org.springframework.stereotype.Service;

/**
 *  user Service
 *  author Thuynt2
 */

@Service
public class UserService {

    // repository
    private UserRepository userRepository;

    // Constructor
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

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
