package com.hanhan.test1.hanhan;


import java.util.Set;
import java.util.TreeSet;

/**
 *TreeSet类
 TreeSet是SortedSet接口的唯一实现类，TreeSet可以确保集合元素处于排序状态。
 TreeSet支持两种排序方式，自然排序 和定制排序，其中自然排序为默认的排序方式。
 向TreeSet中加入的应该是同一个类的对象。
 TreeSet判断两个对象不相等的方式是两个对象通过equals方法返回false，
 或者通过CompareTo方法比较没有返回0
 自然排序
 自然排序使用要排序元素的CompareTo（Object obj）方法来比较元素之间大小关系，然后将元素按照升序排列。
 Java提供了一个Comparable接口，该接口里定义了一个compareTo(Object obj)方法，
 该方法返回一个整数值，实现了该接口的对象就可以比较大小。
 obj1.compareTo(obj2)方法如果返回0，则说明被比较的两个对象相等，如果返回一个正数，
 则表明obj1大于obj2，如果是 负数，则表明obj1小于obj2。
 如果我们将两个对象的equals方法总是返回true，则这两个对象的compareTo方法返回应该返回0
 定制排序
 自然排序是根据集合元素的大小，以升序排列，如果要定制排序，应该使用Comparator接口，
 实现 int compare(T o1,T o2)方法。

 最重要：

 1、TreeSet 是二差树实现的,Treeset中的数据是自动排好序的，不允许放入null值。

 2、HashSet 是哈希表实现的,HashSet中的数据是无序的，可以放入null，
 但只能放入一个null，两者中的值都不能重复，就如数据库中唯一约束。

 3、HashSet要求放入的对象必须实现HashCode()方法，放入的对象，
 是以hashcode码作为标识的，而具有相同内容的 String对象，hashcode是一样，所以放入的内容不能重复。
 有序可以重复
 但是同一个类的对象可以放入不同的实例 。
 * */
public class treeset {

    public static void main(String[]args){

//        try {
//            Set<Object> g = treeset.b().a(7).a("3").a(1).a(1).a("2").a("0").g();
//            p.p(g);//报错,因为,treeset中必须添加形同的东西
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        Set<Object> g = treeset.b().a("9").a("6").a("3").a("1").a("1").a("2").a("0").g();
//        p.p(g);//[0, 1, 2, 3, 6, 9]//自动去重复//自动升序//必须存入一样的对象
    }


    private Set<Object> s=null;

    public treeset(){
        s=new TreeSet<>();
    }

    public static treeset b(){
        return new treeset();
    }

    public treeset a(Object o) {
        s.add(o);
        return this;
    }

    public Set<Object> g(){
        return s;
    }
}
