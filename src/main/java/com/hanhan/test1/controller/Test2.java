package com.hanhan.test1.controller;

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
    @RequestMapping(value="/f",method = RequestMethod.GET,produces = {"text/html;charset=UTF-8"})
    public String f(){
        return "/jsp1.jsp";
    }
}
