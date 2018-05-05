package com.hanhan.test1.hanhan;

import javax.crypto.Cipher;
import java.security.Key;
import java.security.Security;


/**
 * DES加解密算法
 * DES算法为密码体制中的对称密码体制，
 * 又被成为美国数据加密标准，是1972年美国IBM公司研制的对称密码体制加密算法。
 * 明文按64位进行分组, 密钥长64位，密钥事实上是56位参与DES运算
 * （第8、16、24、32、40、48、56、64位是校验位， 使得每个密钥都有奇数个1）
 * 分组后的明文组和56位的密钥按位替代或交换的方法形成密文组的加密方法。
 *
 *
 * 该方法如果在new的时候给构造函数传入key,就会使用传入的key,否则,会使用默认的
 * key(在类中)进行加密和解密
 */
public class SecretDES {


    //默认用来加密的key
    private static String strDefaultKey = "hanpenghulimengruhanjiacheng";
    private Cipher encryptCipher = null;
    private Cipher decryptCipher = null;

    /*public static void main(String[]args) throws Exception {
        //使用默认key(strDefaultKey)加密
        SecretDES des = new SecretDES();
        //对"我曹你妈啊"加密
        String str = des.encrypt("我曹你妈啊");
        p.p("-------------------------------------------------------");
        p.p(str);//6b2239aabe31c64c55a7c4a4afe2cb8c
        p.p("-------------------------------------------------------");
        //对密码解密,使用默认的key,就是使用strDefaultKey
        String decrypt = des.decrypt("6b2239aabe31c64c55a7c4a4afe2cb8c");
        p.p("-------------------------------------------------------");
        p.p(decrypt);//我曹你妈啊
        p.p("-------------------------------------------------------");
    }*/
   /* public static void main(String[]args) throws Exception {
        //使用传入的key加密
        SecretDES des = new SecretDES("外日");
        //对"我曹你妈啊一会"加密
        String str = des.encrypt("我曹你妈啊一会");
        p.p("-------------------------------------------------------");
        p.p(str);//b8588f387fb0e458519b60644ae2ecd67cb76c5a66d6a955
        p.p("-------------------------------------------------------");


        //对密码解密,使用出入的key   外日
        String decrypt = des.decrypt("b8588f387fb0e458519b60644ae2ecd67cb76c5a66d6a955");
        p.p("-------------------------------------------------------");
        p.p(decrypt);//我曹你妈啊一会
        p.p("-------------------------------------------------------");
    }
*/
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * 加密字符串的方法
     * @param strIn 需加密的字符串
     * @return 加密后的字符串
     * @throws Exception
     */
    public String encrypt(String strIn) throws Exception {
        return byteArr2HexStr(encrypt(strIn.getBytes()));
    }

    /**
     * 解密字符串的方法
     * @param strIn 需解密的字符串
     * @return 解密后的字符串
     * @throws Exception
     */
    public String decrypt(String strIn) throws Exception {
        return new String(decrypt(hexStr2ByteArr(strIn)));
    }

    /**
     *得到默认key的方式
     * 默认key就是我在类中设置的死key,用来解密字符串的key
     * */
    public static String getStrDefaultKey() {
        return strDefaultKey;
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //建造者
    public static SecretDES b() throws Exception {
        return new SecretDES();
    }
    public static SecretDES b(String strKey) throws Exception {
        return new SecretDES(strKey);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * 默认构造方法，使用默认密钥
     * @throws Exception
     */
    public SecretDES() throws Exception {
        this(strDefaultKey);
    }


    /**
     * 指定密钥构造方法
     * @param strKey 指定的密钥
     * @throws Exception
     */
    public SecretDES(String strKey) throws Exception {
        Security.addProvider(new com.sun.crypto.provider.SunJCE());
        Key key = getKey(strKey.getBytes());
        encryptCipher = Cipher.getInstance("DES");
        encryptCipher.init(Cipher.ENCRYPT_MODE, key);
        decryptCipher = Cipher.getInstance("DES");
        decryptCipher.init(Cipher.DECRYPT_MODE, key);
    }





    /**
     * 加密字节数组
     * @param arrB 需加密的字节数组
     * @return 加密后的字节数组
     * @throws Exception
     */
    public byte[] encrypt(byte[] arrB) throws Exception {
        return encryptCipher.doFinal(arrB);
    }






    /**
     * 解密字节数组
     * @param arrB 需解密的字节数组
     * @return 解密后的字节数组
     * @throws Exception
     */
    public byte[] decrypt(byte[] arrB) throws Exception {
        return decryptCipher.doFinal(arrB);
    }



    /**
     * 从指定字符串生成密钥，密钥所需的字节数组长度为8位
     * 不足8位时后面补0，超出8位只取前8位
     * @param arrBTmp 构成该字符串的字节数组
     * @return 生成的密钥
     * @throws Exception
     */
    private Key getKey(byte[] arrBTmp) throws Exception {
        byte[] arrB = new byte[8];
        for (int i = 0; i < arrBTmp.length && i < arrB.length; i++) {
            arrB[i] = arrBTmp[i];
        }
        Key key = new javax.crypto.spec.SecretKeySpec(arrB, "DES");
        return key;
    }



    /**
     * 将byte数组转换为表示16进制值的字符串，
     * 如：byte[]{8,18}转换为：0813，
     * 和public static byte[] hexStr2ByteArr(String strIn)
     * 互为可逆的转换过程
     * @param arrB 需要转换的byte数组
     * @return 转换后的字符串
     * @throws Exception 本方法不处理任何异常，所有异常全部抛出
     */
    public static String byteArr2HexStr(byte[] arrB) throws Exception {
        int iLen = arrB.length;
        StringBuffer sb = new StringBuffer(iLen * 2);
        for (int i = 0; i < iLen; i++) {
            int intTmp = arrB[i];
            while (intTmp < 0) {
                intTmp = intTmp + 256;
            }
            if (intTmp < 16) {
                sb.append("0");
            }
            sb.append(Integer.toString(intTmp, 16));
        }
        return sb.toString();
    }



    /**
     * 将表示16进制值的字符串转换为byte数组，
     * 和public static String byteArr2HexStr(byte[] arrB)
     * 互为可逆的转换过程
     * @param strIn 需要转换的字符串
     * @return 转换后的byte数组
     * @throws Exception 本方法不处理任何异常，所有异常全部抛出
     */
    public static byte[] hexStr2ByteArr(String strIn) throws Exception {
        byte[] arrB = strIn.getBytes();
        int iLen = arrB.length;
        byte[] arrOut = new byte[iLen / 2];
        for (int i = 0; i < iLen; i = i + 2) {
            String strTmp = new String(arrB, i, 2);
            arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
        }
        return arrOut;
    }


}