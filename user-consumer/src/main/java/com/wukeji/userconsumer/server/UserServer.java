package com.wukeji.userconsumer.server;

import com.wukeji.userconsumer.config.UserProviderBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name ="user-provider" ,url="localhost:8083",fallback = UserProviderBack.class)
public interface UserServer {

    @GetMapping("/userProvider/alive")
    public String alive();
}
