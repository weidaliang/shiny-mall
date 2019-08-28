package com.ljj.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/name")
    public Map<String, String> showName(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Map<String, String> map=new HashMap<String, String>();
        map.put("name",name);
        return map;
    }

}
