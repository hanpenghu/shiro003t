package com.hanhan.test1.hanhan;

import java.util.ArrayList;
import java.util.List;

public class arraylist  {


//    public static void main(String[]args){
//        List<Object> g = arraylist.b().a("1").a("2").g();
//        p.p(g);//[1, 2]
//    }



    private List<Object> list= null;

    //构造函数
    public arraylist(){
        list=new ArrayList<>();
        //构造函数里初始化list
    }

    //建造者//b是bulid的意思
    public static arraylist b(){
        return new arraylist();
    }


    //持续加入数据的方法//a是add的意思
    public arraylist a(Object o){
        list.add(o);
        return this;
    }

    //g是最后get数据的意思
    //加入数据,最后一步调这个方法得到我们想要的加满数据的ArrayList
    public List<Object> g(){
        return list;
    }
}
