package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dingshuo on 2017/3/17.
 */
@RestController
public class HelloController {
    @Autowired
    private IHello iHello;

    @RequestMapping(value = "gethello",method = RequestMethod.GET)
    public String getHello(){
       return iHello.getHello();
    }
}
