package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dingshuo on 2017/3/17.
 */
@FeignClient("CLIENT-SERVICE1")
public interface IHello {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String getHello();
}