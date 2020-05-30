package net.dhg.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
    //写一个返回请求路径参数的控制器
    @RequestMapping("/world/{name}")
    @ResponseBody
    public String hello(@PathVariable String name){
        return String.format("hello world %s ",name );
    }
}
