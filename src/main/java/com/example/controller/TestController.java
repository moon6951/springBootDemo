package com.example.controller;

import com.example.entity.TUser;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController  {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/testData")
    @ResponseBody
    public List<TUser> testData() {
        List<TUser> dates = userService.queryAll();
        return dates;
    }

    @RequestMapping(value="/toIndex")
    @ResponseBody
    public Map<String,Object> toIndex(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","jack");
        map.put("age",12);
        return  map;
    }

    @RequestMapping(value = "/toFirst")
    public String toFirst(){
        return "first";
    }
}
