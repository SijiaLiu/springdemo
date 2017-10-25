package com.lsj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liusijia on 2017/10/25.
 */
@RestController
public class UserController {

    @RequestMapping("/")
    public String index(){
        return "hello SpringBoot!";
    }
}
