package com.jk.controller;

import com.jk.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;


    // restful编程风格
    @GetMapping(value = "/hi")  //这是get请求  查询  @RequestMapping(value = "",method = RequestMethod.GET)
    // @PostMapping  //这是post请求   新增   @RequestMapping(value = "",method = RequestMethod.POST)
    //@PutMapping   //这是put请求   修改    @RequestMapping(value = "",method = RequestMethod.PUT)
    //@DeleteMapping //这是delete请求  删除  @RequestMapping(value = "",method = RequestMethod.DELETE)
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}

