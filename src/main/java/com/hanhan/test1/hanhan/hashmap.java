package com.hanhan.test1.hanhan;

import java.util.HashMap;
import java.util.Map;

/**
 *HashMap添加
 * */
public class hashmap {
//    public static void main(String[]args){
//        Map g = hashmap.b()
//                .a("1", "韩寒")
//                .a("3", "梦如")
//                .a("2", "佳城").g();
//        p.p(g);
//    }
    private Map<Object,Object> m=null;
    //构造函数
    public hashmap(){
        m=new HashMap<>();
    }

    //建造者
    public static hashmap b(){
        return new hashmap();
    }

    //添加者

    public hashmap a(Object k, Object v){
        m.put(k,v);
        return this;
    }

    //收获者
    public Map g(){
        return m;
    }


}
