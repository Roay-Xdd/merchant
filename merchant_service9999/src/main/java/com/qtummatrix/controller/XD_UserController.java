package com.qtummatrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import org.springframework.stereotype.Controller;

@Controller
@DefaultProperties(defaultFallback = "defaultFallbackMethod")
public class XD_UserController {

    public String defaultFallbackMethod(){
        return "网络异常，请稍后再试，/(ㄒoㄒ)/~~";
    }

}
