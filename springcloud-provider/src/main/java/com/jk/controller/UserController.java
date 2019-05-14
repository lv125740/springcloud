package com.jk.controller;

import com.jk.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value="/hello",method= RequestMethod.POST)
    public User queryUser(@RequestBody User user){
        System.out.println(user);
        User u = new User();
        u.setUserId(123);
        u.setUserName("真对");
        return u;
    }

}
