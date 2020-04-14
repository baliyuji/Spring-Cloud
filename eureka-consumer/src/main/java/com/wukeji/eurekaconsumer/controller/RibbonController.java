package com.wukeji.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Autowired
    LoadBalancerClient lb;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/client")
    public Object client(){
        ServiceInstance instance =  lb.choose("provider");
        String url = "http://" + instance.getHost() + ":"+ instance.getPort() + "/getHi";
        String respStr = restTemplate.getForObject(url,String.class);
        return  respStr;
    }


}
