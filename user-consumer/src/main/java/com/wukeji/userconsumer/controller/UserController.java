package com.wukeji.userconsumer.controller;

import com.wukeji.userconsumer.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/userConsumer")
public class UserController {

    @Autowired
    UserServer userServer;

    @GetMapping("/getAlive")
    public  String getAlive(){
        System.out.println("执行了");
        return  userServer.alive();
    }
}
