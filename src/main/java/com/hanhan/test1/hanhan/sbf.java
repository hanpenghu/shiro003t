package com.hanhan.test1.hanhan;

/**
 *使用StringBuffer添加成一个字符串
 * */
public class sbf {


//    public static void main(String[]args){
//        String g = sbf.b().a("我曹").a("你妈").g();
//        p.p(g);
//    }

    private StringBuffer s=null;
    //构造函数
    public sbf(){
        s=new StringBuffer();
    }

    //建造者
    public static sbf b(){
        return new sbf();
    }

    //添加者//s是要相加的字符串
    public sbf a(String str){
        s.append(str);
        return this;
    }

    //收获者

    public String g(){
        return s.toString();
    }

}
