package com.jk.service;

import com.jk.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface HelloServiceApi {
    @RequestMapping(value="/hi",method = RequestMethod.GET)
    String hello(@RequestParam(value="name")String name);

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    User helloUser(@RequestBody User user);

}
