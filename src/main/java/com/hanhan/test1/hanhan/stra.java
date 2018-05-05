package com.hanhan.test1.hanhan;

/**
 *使用相加的方式得到字符串
 * */
public class stra {


//    public static void main(String[]args){
//        String g = stra.b().a("我曹").a("你妈").a("一会").g();
//        p.p(g);
//    }

    private String s="";

    //建造者
    public static stra b(){
        return new stra();
    }

    //添加者//s是要相加的字符串
    public stra a(String str){
        s+=str;
        return this;
    }

    //收获者

    public String g(){
        return s;
    }

}
