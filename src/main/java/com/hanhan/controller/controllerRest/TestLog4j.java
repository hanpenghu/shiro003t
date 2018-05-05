package com.hanhan.controller.controllerRest;

import com.hanhan.test1.hanhan.p;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class TestLog4j {

private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());

    //http://localhost:8080/testLog.action//这里带action是因为web.xml中mvc的拦截方式
    /**
     *返回
             {
                     str: ""
             }

     说明   json  接口也是由springMVC  扫描加载的
     * */
    @RequestMapping(value="/testLog",method=RequestMethod.GET,produces = {p.producesJson})
    public @ResponseBody  Test f(){

        l.info("--------我日------------");
            l.error("----我曹----------");


            return new Test();

    }













}
