package com.example.springboot.Controller;

import com.example.springboot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *  get user information
 *  author thuynt
 */

@RestController
public class UserController {

    // Constants
    public static final String ID = "id";
    public static final String NAME = "name";

    public static final String DEFAULT_ID = "1";
    public static final String DEFAULT_NAME = "World";

    // Services
    private UserService userService;

    // Constructor
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Welcome user with name
     */
    @GetMapping("/welcome")
    public String getWelcomeMess(@RequestParam(value = NAME, defaultValue = DEFAULT_NAME) String name) {
        return userService.getWelcomeMess(name);
    }

    /**
     * get user information by id
     */
    @GetMapping("/user")
    public String getUserInfo(@RequestParam(value = ID, defaultValue = DEFAULT_ID) Integer userId) {
        return userService.getUserInfo(userId);
    }
}
