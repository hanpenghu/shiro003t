package com.hanhan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hanhan on 2017-07-17.
 * @RestController无法return一个路径,但是: @Controller可以返回一个路径
 */
@RestController
@RequestMapping("test1")
public class Test1 {
    @RequestMapping(value="f",method = RequestMethod.GET,produces = {"text/html;charset=UTF-8"})
    public ModelAndView  f(){
//        ModelAndView mv = new ModelAndView("/other/index1.html");//默认为forward模式//转发//但是作为静态资源会被拦截
//      ModelAndView mv = new ModelAndView("redirect:/other/index1.html");//redirect模式//重定向
//        ModelAndView mv = new ModelAndView("/other/index1.html");//该资源在controller内部不会被拦截
//        ModelAndView mv = new ModelAndView("/WEB-INF/a/aa.html");//WEB-INF下不能被直接访问,但是可以被controller内部forward
        ModelAndView mv = new ModelAndView("/jsp1.jsp");
        return mv;
    }



}
