package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-hi")
public interface HelloService extends HelloServiceApi{
    /*@RequestMapping(value="/hi",method = RequestMethod.GET)
    String hello(@RequestParam(value="name")String name);

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    User helloUser(@RequestBody User user);*/
}
