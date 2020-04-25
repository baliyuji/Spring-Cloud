package com.wukeji.userconsumer.config;


import com.wukeji.userconsumer.server.UserServer;
import org.springframework.stereotype.Component;

@Component
public class UserProviderBack implements UserServer {

    @Override
    public String alive() {
        return "降级了！！！";
    }
}
