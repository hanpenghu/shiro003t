package com.hanhan.test1.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TestLog4j {



    @RequestMapping(value="",method= RequestMethod.GET,produces = {""})
    public void f(){




    }



}
