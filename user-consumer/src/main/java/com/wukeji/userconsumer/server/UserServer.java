package com.wukeji.userconsumer.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name ="aaaaa" ,url="localhost:8083")
public interface UserServer {

    @GetMapping("/userProvider/alive")
    public String alive();
}
