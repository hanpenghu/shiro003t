package com.hanhan.test1.hanhan;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *用于测试封装外部jar包的工具
 * */
public class pp {


    /**
     *封装log4j的得到实例
     * */
    public static org.apache.log4j.Logger getLogger(Object o){
        return org.apache.log4j.LogManager.getLogger(o.getClass().getName());
    }


    /**
     *封装apahce包的sha1加密
     * */
    public static String sha1(String s){



        return DigestUtils.shaHex(s);
    }


    /**
     *根据编码来读取文本
     * 参数  luJing
     * 可以是全路径
     * springboot的如果是跟jar包同一级路径的文件,只要写文件名就好了
     * */

    public static String usCodeReadTxt(String luJing,String bianMa)  {
        try {
            return IOUtils.toString(new FileInputStream(luJing),bianMa);
        } catch (IOException e) {
            return "";
        }
    }

    public static String usCodeReadTxt(File file,String bianMa) {
        try {
            return IOUtils.toString(new FileInputStream(file),bianMa);
        } catch (IOException e) {
            return "";
        }
    }




}
