package com.wukeji.eurekaprovider.controller;

import com.wukeji.eurekaprovider.service.HealthStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    HealthStatusService healthStatusSrv;

    @GetMapping("/getHi")
    public String getHi(){
        return "hi";
    }

    //手动服务上下线
    @GetMapping("/health")
    public String health(@RequestParam("status") Boolean status) {

        healthStatusSrv.setStatus(status);
        return healthStatusSrv.getStatus();
    }

}
