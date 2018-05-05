package com.hanhan.controller.controllerRest;

import com.hanhan.test1.hanhan.p;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class HelloWorldRestController {



    /**
     * 由于web.xml 里面springMVC拦截是*.action的
     *http://localhost:8080/testLog.action
     结果:
     <Test xmlns="">
     <str>player</str>
     </Test>

     * */
    @RequestMapping("/hello/{player}")
    public Test message(@PathVariable String player) {

        Test msg = new Test();
        msg.setStr(player);
        return msg;
    }

    /**
     url
     http://localhost:8080/hello1/caoNi.action  //带action是以为 web.xml中配置的mvc的拦截方式
     //caoNi是放入{player}中的参数
     结果
     {
         str: "caoNi"
     }
     * */
    @RequestMapping(value="/hello1/{player}",produces = {p.producesJson})
    public @ResponseBody Test message1(@PathVariable String player) {

        Test msg = new Test();
        msg.setStr(player);
        return msg;
    }

}
