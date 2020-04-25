package com.wukeji.userprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/userProvider")
public class UserController {

    @GetMapping("/alive")
    public String alive(){
        return "ok";
    }
}
