package com.jk.controller;

import com.jk.model.User;
import com.jk.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService schedualServiceHi;

//    @Autowired
//    private UserService userService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.hello( name );
    }

    @GetMapping(value = "/hello")
    public User sayHello(@RequestParam String name) {

        User user =new User();
        user.setUserId(1);
        user.setUserName("李四");

        return schedualServiceHi.helloUser( user );
    }
}
