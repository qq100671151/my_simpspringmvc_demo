package com.fxb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengxianbin
 * @description: 测试springmvc
 * @create 2020-12-22 15:10
 */
@Controller
@RequestMapping("/helloWord")
public class HelloWordController {


    @RequestMapping("/getTestDataMap/{id}")
    public String getTestDataMap(@PathVariable("id") String id){
        System.out.println("进来了"+id);
        Map<String,String> map=new HashMap<>();
        map.put("id","1");
        map.put("name","张小斐");
        return "admin/you";
    }


    @RequestMapping("/getTestDataMap2/{id}")
    @ResponseBody
    public Map<String,String> getTestDataMap2(@PathVariable("id") String id){
        System.out.println("进来了"+id);
        Map<String,String> map=new HashMap<>();
        map.put("id","1");
        map.put("name","张小斐");
        return map;
    }
}
