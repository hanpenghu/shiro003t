package com.hanhan.test1.hanhan;

import java.util.LinkedList;
import java.util.List;

public class linklist {


//    public static void main(String[]args){
//        List<Object> g = linklist.b().a("1").a("2").g();
//        p.p(g);//[1, 2]
//    }



    private   List<Object> list=null;

    public linklist(){
        list=new LinkedList<>();
        //构造函数里初始化list
    }

    //建造者//build的意思
    public static linklist b(){
        return new linklist();
    }


    //持续加入数据的方法//add的意思
    public linklist a(Object o){
        list.add(o);
        return this;
    }

    //加入数据,最后一步调这个方法得到我们想要的加满数据的LinkedList
    //get的意思
    public List<Object> g(){
        return list;
    }

}
