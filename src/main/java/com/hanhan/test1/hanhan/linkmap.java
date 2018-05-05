package com.hanhan.test1.hanhan;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkmap {
//        public static void main(String[]args){
//        Map g = linkmap.b()
//                .a("1", "韩寒")
//                .a("3", "梦如")
//                .a("2", "佳城").g();
//        p.p(g);
//    }
    private Map<Object,Object> m=null;
    //构造函数
    public linkmap(){
        m=new LinkedHashMap<>();
    }

    //建造者
    public static linkmap b(){
        return new linkmap();
    }

    //添加者

    public linkmap a(Object k, Object v){
        m.put(k,v);
        return this;
    }

    //收获者
    public Map g(){
        return m;
    }
}
