package com.hanhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 韩寒 on 2017-07-17.
 * @RestController无法return一个路径,但是: @Controller可以返回一个路径
 */
@Controller
@RequestMapping("/test2")
public class Test2 {
    //注意web.xml中的配置,下面这种url才能访问,  下面/f 不用加action也等于加了
    //http://localhost:8080/test2/f.action
    @RequestMapping(value="/f",method = RequestMethod.GET,produces = {"text/html;charset=UTF-8"})
    public String f(){
        return "/jsp1.jsp";
    }
}
