package com.hanhan.test1.hanhan;
import java.util.HashSet;
import java.util.Set;

/**
 *无序不重复
 * HashSet有以下特点
  不能保证元素的排列顺序，顺序有可能发生变化
  不是同步的
  集合元素可以是null,但只能放入一个null
 当向HashSet集合中存入一个元素时，HashSet会调用该对象的hashCode()方法来得到该对象的hashCode值，
 然后根据 hashCode值来决定该对象在HashSet中存储位置。
 简单的说，HashSet集合判断两个元素相等的标准是两个对象通过equals方法比较相等，
 并且两个对象的hashCode()方法返回值相 等
 注意，如果要把一个对象放入HashSet中，重写该对象对应类的equals方法，
 也应该重写其hashCode()方法。
 其规则是如果两个对 象通过equals方法比较返回true时，其hashCode也应该相同。另外
 ，对象中用作equals比较标准的属性，都应该用来计算 hashCode的值。
 * */
public class hashset {


//    public static void main(String[]args){
//        Set<Object> g = hashset.b().a(7).a("3").a(1).a(1).a("2").a("0").g();
//        p.p(g);//[0, 1, 2, 3, 7]//无序,去重复,可以存多种对象
//    }


    private Set<Object> s=null;

    public hashset(){
        s=new HashSet();
    }

    public static hashset b(){
        return new hashset();
    }

    public hashset a(Object o) {
        s.add(o);
        return this;
    }

    public Set<Object> g(){
        return s;
    }

}
