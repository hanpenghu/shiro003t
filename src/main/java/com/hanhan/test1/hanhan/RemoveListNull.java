package com.hanhan.test1.hanhan;

import java.util.List;

public class RemoveListNull<T> {
    public void remove(List<T> list){
        while (list.contains(null)){
            list.remove(null);
        }


    }

//    public static void main(String[]args){
//        List g = new linklistT<String>().a("1").a("2").a(null).g();
//        p.p("-------------------------------------------------------");
//        p.p(g);//[1, 2, null]
//        p.p("-------------------------------------------------------");
//        new RemoveListNull<String>().remove(g);
//        p.p("-------------------------------------------------------");
//        p.p(g);//[1, 2]
//        p.p("-------------------------------------------------------");
//
//    }
}
