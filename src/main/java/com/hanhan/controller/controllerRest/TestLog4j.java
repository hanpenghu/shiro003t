package com.hanhan.controller.controllerRest;

import com.hanhan.test1.hanhan.p;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class TestLog4j {



    //http://localhost:8080/testLog.action
    /**
     *返回
             {
                     str: ""
             }

     说明   json  接口也是由springMVC  扫描加载的
     * */
    @RequestMapping(value="/testLog",method=RequestMethod.GET,produces = {p.producesJson})
    public @ResponseBody  Test f(){




            return new Test();

    }













}
