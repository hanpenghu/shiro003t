package com.hanhan.test1.hanhan;

import java.util.Arrays;
import java.util.List;

public interface pI {
     String[] hexDigits = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };//md5用

    public  final static String phonePattern =
            "^1[3|4|5|7|8][0-9]\\d{8}$";

     String emailPattern1 =
            "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

     String emailPattern2 =
            "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";



     String jpeg=".jpeg";
     String jpg="jpg";
     String noExceptionSign ="《没有异常》";
     String knownExceptionSign ="《已知异常》";
     String unKnownExceptionSign ="《未知异常》";
     String beiChuShu="beiChuShu";
     String chuShu="chuShu";
     String shang="shang";
     String yuShu="yuShu";
     String xg="/";//斜杠
     String sxg="//";//双斜杠
     String gq="_____________________RuanJianGuoQi__________________________The software has expired, please contact the supplier_____________________RuanJianGuoQi__________________________";//过期提醒
     String NULL1="NULL";
     String null1="null";
     String excel="excel";
     String zhifgf="~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";//至分隔符
     String zhi="~";//至符号
	 String zuHeFgf="<~>";//这种可以用于正则中和  split()函数中
     String zuHeFenGeFu="{~}";//组合分隔符,常用于分隔各种字符串组合//这种不能用于正则和字符串的split()函数中
     String manyMinus="--------------------------------------------";
     String manyMinusBefore="\n--------------------------------------------";
     String manyMinusAfter="--------------------------------------------\n";
     String manyMinus2="\n--------------------------------------------\n";
     String dexhx="_________________";//短英文下划线
     String cexhx="____________________________________________";//长英文下划线
     String dzwxhx="————————————————";//短中文下划线
     String hlfgxd="…………………………………………";//就是^的中文状态多个组合
     String zwh="？";//中文问号
     String eeh="?";//英文问号
     String xh="*";
     String qdz="&";//and符号或者取地址符号
     String zcf="……";//中文状态下的次方符号
     String cf="^";//excel中的次方符号
     String jnh="#";
     String zgth="！";//中文感叹号
     String egth="!";//英文感叹号
     String at="@";
     String rmb="￥";
     String dollor="$";
     String bfh="%";
     String zmh="：";//中文冒号
     String emh=":";//英文冒号
     String zdh="、";//顿号、,只有中文有,英文没有
     String fxg="\\";//这个其实代表一个\,因为第一个\是转义符号
     String ys="|";//一竖
     String edyh="'";//英文单引号的一半
     String esyh="\"";//英文双引号的一半
     String ejh=".";//英文句号
     String zjh="。";//中文句号
     String zd="，";//中文逗号
     String ed=",";//英文逗号
     String xyh="<";
     String dyh=">";
     String dh="=";//等号
     String j="+";//加号
     String xhx="_";//下划线
     String jh="-";//减号
     String fh=";";//分好
     String space="";//空字符串
     String  enCodeSpace="%20";
     String spac=" ";//空格
     String undefined="undefined";
     String UTF8="UTF-8";
     String GBK="GBK";
     String GB2312="GB2312";
     //2017-09-02 12-22 33.333这种才算毫秒级
    //_________________2017-12-29 19:10:52.717_________________
     String d1="yyyy-MM-dd HH:mm:ss.SS";//最后的SS是毫秒//like//2017-12-16 16:19:23.670
    //_________________2017-12-29 19:10:52.717_________________
     String d16="yyyy-MM-dd HH:mm:ss.SSS";
    //_________________2017-12-29 19:10:52,717_________________
     String d17="yyyy-MM-dd HH:mm:ss,SSS";
     String d2="yyyy-MM-dd HH:mm:ss";
     String d3="yyyy-MM-dd";

     String d4="yyyy/MM/dd HH:mm:ss.SS";
     String d5="yyyy/MM/dd HH:mm:ss";
     String d6="yyyy/MM/dd";

     String d7="yyyy.MM.dd HH:mm:ss.SS";
     String d8="yyyy.MM.dd HH:mm:ss";
     String d9="yyyy.MM.dd";

     String d10="yyyyMMddHHmmssSS";
     String d11="yyyyMMddHHmmss";
     String d12="yyyyMMdd";

     String fail="fail";
     String FAIL="FAIL";
     String success="success";
     String SUCCESS="SUCCESS";

     String d13="yyyy.MM.dd HH.mm.ss.SS";
     String d14="yyyy.MM.dd.HH.mm.ss.SS";
     String d15="yyyy.MM.dd.HH.mm.ss";
     String unixBir="1970-01-01";
     String hanhanBirthday_="1986-12-26";
     String hanhanBirthday="1986/12/26";

     String DateType="java.util.Date";
     String StringType="java.lang.String";
     String BigDecimalType="java.math.BigDecimal";

     List<String> numberTypelist
            = Arrays.asList(new String[]{"int","java.lang.Integer",
            "double","java.lang.Double",
            "float","java.lang.Float","java.lang.Long"
            ,"long","java.lang.Short","short"});

     //注意 Boolean类型的json化后是true或者false处理
	List<String> canBeJsonTypes
			= Arrays.asList(new String[]{"int","java.lang.Integer",
			"double","java.lang.Double",
			"float","java.lang.Float","java.lang.Long"
			,"long","java.lang.Short","short","java.lang.String","String"
			,"java.math.BigDecimal","BigDecimal","byte","java.lang.Byte","char"
			,"boolean","java.lang.Boolean"});

     String intType="int";
     String IntegerType="java.lang.Integer";
     String doubleType="double";
     String DoubleType="java.lang.Double";
     String floatType="float";
     String FloatType="java.lang.Float";
     String LongType="java.lang.Long";
     String longType="long";
     String ShortType="java.lang.Short";
     String shortType="short";

    final static int[] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE };

     String baoCunShiBai="baoCunShiBai";
     String baoCunShiBaiCh="保存失败";
     String baoCunChengGong="baoCunChengGong";
     String baoCunChengGongCh="保存成功";
     String charsetUtf8="application/json;charset=utf-8";

	/**
	 *常用的请求头
	 * produces={"application/json;charset=utf-8"}
     * 这种是用于告诉调用我接口的人我返回的是什么格式
	 * */
	String producesJson="application/json;charset=utf-8";
	String producesXml="application/xml;charset=utf-8";
	String producesHtml="text/html;charset=utf-8";
    //text/plain：窗体数据以纯文本形式进行编码，其中不含任何控件或格式字符
    String producesPlain="text/plain;charset=utf-8";
	//application/x-www-form-urlencoded为标准编码格式
    //窗体数据被编码为名称/值对。这是标准的编码格式
	String producesWww="application/x-www-form-urlencoded;charset=utf-8";

	//这种是规定调用我接口的人  发送过来的是什么格式
    //multipart/form-data一般用来传输文件
    String consumesMultipart="multipart/form-data";



     long fuckIt=5*1000;
     String fuckTime="2019-12-25";

    	int	n0	=	0	;
    	int	n1	=	1	;
    	int	n2	=	2	;
    	int	n3	=	3	;
    	int	n4	=	4	;
    	int	n5	=	5	;
    	int	n6	=	6	;
    	int	n7	=	7	;
    	int	n8	=	8	;
    	int	n9	=	9	;
    	int	n10	=	10	;
    	int	n11	=	11	;
    	int	n12	=	12	;
    	int	n13	=	13	;
    	int	n14	=	14	;
    	int	n15	=	15	;
    	int	n16	=	16	;
    	int	n17	=	17	;
    	int	n18	=	18	;
    	int	n19	=	19	;
    	int	n20	=	20	;
    	int	n21	=	21	;
    	int	n22	=	22	;
    	int	n23	=	23	;
    	int	n24	=	24	;
    	int	n25	=	25	;
    	int	n26	=	26	;
    	int	n27	=	27	;
    	int	n28	=	28	;
    	int	n29	=	29	;
    	int	n30	=	30	;
    	int	n31	=	31	;
    	int	n32	=	32	;
    	int	n33	=	33	;
    	int	n34	=	34	;
    	int	n35	=	35	;
    	int	n36	=	36	;
    	int	n37	=	37	;
    	int	n38	=	38	;
    	int	n39	=	39	;
    	int	n40	=	40	;
    	int	n41	=	41	;
    	int	n42	=	42	;
    	int	n43	=	43	;
    	int	n44	=	44	;
    	int	n45	=	45	;
    	int	n46	=	46	;
    	int	n47	=	47	;
    	int	n48	=	48	;
    	int	n49	=	49	;
    	int	n50	=	50	;
    	int	n51	=	51	;
    	int	n52	=	52	;
    	int	n53	=	53	;
    	int	n54	=	54	;
    	int	n55	=	55	;
    	int	n56	=	56	;
    	int	n57	=	57	;
    	int	n58	=	58	;
    	int	n59	=	59	;
    	int	n60	=	60	;
    	int	n61	=	61	;
    	int	n62	=	62	;
    	int	n63	=	63	;
    	int	n64	=	64	;
    	int	n65	=	65	;
    	int	n66	=	66	;
    	int	n67	=	67	;
    	int	n68	=	68	;
    	int	n69	=	69	;
    	int	n70	=	70	;
    	int	n71	=	71	;
    	int	n72	=	72	;
    	int	n73	=	73	;
    	int	n74	=	74	;
    	int	n75	=	75	;
    	int	n76	=	76	;
    	int	n77	=	77	;
    	int	n78	=	78	;
    	int	n79	=	79	;
    	int	n80	=	80	;
    	int	n81	=	81	;
    	int	n82	=	82	;
    	int	n83	=	83	;
    	int	n84	=	84	;
    	int	n85	=	85	;
    	int	n86	=	86	;
    	int	n87	=	87	;
    	int	n88	=	88	;
    	int	n89	=	89	;
    	int	n90	=	90	;
    	int	n91	=	91	;
    	int	n92	=	92	;
    	int	n93	=	93	;
    	int	n94	=	94	;
    	int	n95	=	95	;
    	int	n96	=	96	;
    	int	n97	=	97	;
    	int	n98	=	98	;
    	int	n99	=	99	;
    	int	n100	=	100	;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    	String	s0	=	"0"	;
    	String	s1	=	"1"	;
    	String	s2	=	"2"	;
    	String	s3	=	"3"	;
    	String	s4	=	"4"	;
    	String	s5	=	"5"	;
    	String	s6	=	"6"	;
    	String	s7	=	"7"	;
    	String	s8	=	"8"	;
    	String	s9	=	"9"	;
    	String	s10	=	"10"	;
    	String	s11	=	"11"	;
    	String	s12	=	"12"	;
    	String	s13	=	"13"	;
    	String	s14	=	"14"	;
    	String	s15	=	"15"	;
    	String	s16	=	"16"	;
    	String	s17	=	"17"	;
    	String	s18	=	"18"	;
    	String	s19	=	"19"	;
    	String	s20	=	"20"	;
    	String	s21	=	"21"	;
    	String	s22	=	"22"	;
    	String	s23	=	"23"	;
    	String	s24	=	"24"	;
    	String	s25	=	"25"	;
    	String	s26	=	"26"	;
    	String	s27	=	"27"	;
    	String	s28	=	"28"	;
    	String	s29	=	"29"	;
    	String	s30	=	"30"	;
    	String	s31	=	"31"	;
    	String	s32	=	"32"	;
    	String	s33	=	"33"	;
    	String	s34	=	"34"	;
    	String	s35	=	"35"	;
    	String	s36	=	"36"	;
    	String	s37	=	"37"	;
    	String	s38	=	"38"	;
    	String	s39	=	"39"	;
    	String	s40	=	"40"	;
    	String	s41	=	"41"	;
    	String	s42	=	"42"	;
    	String	s43	=	"43"	;
    	String	s44	=	"44"	;
    	String	s45	=	"45"	;
    	String	s46	=	"46"	;
    	String	s47	=	"47"	;
    	String	s48	=	"48"	;
    	String	s49	=	"49"	;
    	String	s50	=	"50"	;
    	String	s51	=	"51"	;
    	String	s52	=	"52"	;
    	String	s53	=	"53"	;
    	String	s54	=	"54"	;
    	String	s55	=	"55"	;
    	String	s56	=	"56"	;
    	String	s57	=	"57"	;
    	String	s58	=	"58"	;
    	String	s59	=	"59"	;
    	String	s60	=	"60"	;
    	String	s61	=	"61"	;
    	String	s62	=	"62"	;
    	String	s63	=	"63"	;
    	String	s64	=	"64"	;
    	String	s65	=	"65"	;
    	String	s66	=	"66"	;
    	String	s67	=	"67"	;
    	String	s68	=	"68"	;
    	String	s69	=	"69"	;
    	String	s70	=	"70"	;
    	String	s71	=	"71"	;
    	String	s72	=	"72"	;
    	String	s73	=	"73"	;
    	String	s74	=	"74"	;
    	String	s75	=	"75"	;
    	String	s76	=	"76"	;
    	String	s77	=	"77"	;
    	String	s78	=	"78"	;
    	String	s79	=	"79"	;
    	String	s80	=	"80"	;
    	String	s81	=	"81"	;
    	String	s82	=	"82"	;
    	String	s83	=	"83"	;
    	String	s84	=	"84"	;
    	String	s85	=	"85"	;
    	String	s86	=	"86"	;
    	String	s87	=	"87"	;
    	String	s88	=	"88"	;
    	String	s89	=	"89"	;
    	String	s90	=	"90"	;
    	String	s91	=	"91"	;
    	String	s92	=	"92"	;
    	String	s93	=	"93"	;
    	String	s94	=	"94"	;
    	String	s95	=	"95"	;
    	String	s96	=	"96"	;
    	String	s97	=	"97"	;
    	String	s98	=	"98"	;
    	String	s99	=	"99"	;
    	String	s100	=	"100"	;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	int	n_100	=	-100	;
    	int	n_99	=	-99	;
    	int	n_98	=	-98	;
    	int	n_97	=	-97	;
    	int	n_96	=	-96	;
    	int	n_95	=	-95	;
    	int	n_94	=	-94	;
    	int	n_93	=	-93	;
    	int	n_92	=	-92	;
    	int	n_91	=	-91	;
    	int	n_90	=	-90	;
    	int	n_89	=	-89	;
    	int	n_88	=	-88	;
    	int	n_87	=	-87	;
    	int	n_86	=	-86	;
    	int	n_85	=	-85	;
    	int	n_84	=	-84	;
    	int	n_83	=	-83	;
    	int	n_82	=	-82	;
    	int	n_81	=	-81	;
    	int	n_80	=	-80	;
    	int	n_79	=	-79	;
    	int	n_78	=	-78	;
    	int	n_77	=	-77	;
    	int	n_76	=	-76	;
    	int	n_75	=	-75	;
    	int	n_74	=	-74	;
    	int	n_73	=	-73	;
    	int	n_72	=	-72	;
    	int	n_71	=	-71	;
    	int	n_70	=	-70	;
    	int	n_69	=	-69	;
    	int	n_68	=	-68	;
    	int	n_67	=	-67	;
    	int	n_66	=	-66	;
    	int	n_65	=	-65	;
    	int	n_64	=	-64	;
    	int	n_63	=	-63	;
    	int	n_62	=	-62	;
    	int	n_61	=	-61	;
    	int	n_60	=	-60	;
    	int	n_59	=	-59	;
    	int	n_58	=	-58	;
    	int	n_57	=	-57	;
    	int	n_56	=	-56	;
    	int	n_55	=	-55	;
    	int	n_54	=	-54	;
    	int	n_53	=	-53	;
    	int	n_52	=	-52	;
    	int	n_51	=	-51	;
    	int	n_50	=	-50	;
    	int	n_49	=	-49	;
    	int	n_48	=	-48	;
    	int	n_47	=	-47	;
    	int	n_46	=	-46	;
    	int	n_45	=	-45	;
    	int	n_44	=	-44	;
    	int	n_43	=	-43	;
    	int	n_42	=	-42	;
    	int	n_41	=	-41	;
    	int	n_40	=	-40	;
    	int	n_39	=	-39	;
    	int	n_38	=	-38	;
    	int	n_37	=	-37	;
    	int	n_36	=	-36	;
    	int	n_35	=	-35	;
    	int	n_34	=	-34	;
    	int	n_33	=	-33	;
    	int	n_32	=	-32	;
    	int	n_31	=	-31	;
    	int	n_30	=	-30	;
    	int	n_29	=	-29	;
    	int	n_28	=	-28	;
    	int	n_27	=	-27	;
    	int	n_26	=	-26	;
    	int	n_25	=	-25	;
    	int	n_24	=	-24	;
    	int	n_23	=	-23	;
    	int	n_22	=	-22	;
    	int	n_21	=	-21	;
    	int	n_20	=	-20	;
    	int	n_19	=	-19	;
    	int	n_18	=	-18	;
    	int	n_17	=	-17	;
    	int	n_16	=	-16	;
    	int	n_15	=	-15	;
    	int	n_14	=	-14	;
    	int	n_13	=	-13	;
    	int	n_12	=	-12	;
    	int	n_11	=	-11	;
    	int	n_10	=	-10	;
    	int	n_9	=	-9	;
    	int	n_8	=	-8	;
    	int	n_7	=	-7	;
    	int	n_6	=	-6	;
    	int	n_5	=	-5	;
    	int	n_4	=	-4	;
    	int	n_3	=	-3	;
    	int	n_2	=	-2	;
    	int	n_1	=	-1	;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	String	s_100	=	"-100"	;
    	String	s_99	=	"-99"	;
    	String	s_98	=	"-98"	;
    	String	s_97	=	"-97"	;
    	String	s_96	=	"-96"	;
    	String	s_95	=	"-95"	;
    	String	s_94	=	"-94"	;
    	String	s_93	=	"-93"	;
    	String	s_92	=	"-92"	;
    	String	s_91	=	"-91"	;
    	String	s_90	=	"-90"	;
    	String	s_89	=	"-89"	;
    	String	s_88	=	"-88"	;
    	String	s_87	=	"-87"	;
    	String	s_86	=	"-86"	;
    	String	s_85	=	"-85"	;
    	String	s_84	=	"-84"	;
    	String	s_83	=	"-83"	;
    	String	s_82	=	"-82"	;
    	String	s_81	=	"-81"	;
    	String	s_80	=	"-80"	;
    	String	s_79	=	"-79"	;
    	String	s_78	=	"-78"	;
    	String	s_77	=	"-77"	;
    	String	s_76	=	"-76"	;
    	String	s_75	=	"-75"	;
    	String	s_74	=	"-74"	;
    	String	s_73	=	"-73"	;
    	String	s_72	=	"-72"	;
    	String	s_71	=	"-71"	;
    	String	s_70	=	"-70"	;
    	String	s_69	=	"-69"	;
    	String	s_68	=	"-68"	;
    	String	s_67	=	"-67"	;
    	String	s_66	=	"-66"	;
    	String	s_65	=	"-65"	;
    	String	s_64	=	"-64"	;
    	String	s_63	=	"-63"	;
    	String	s_62	=	"-62"	;
    	String	s_61	=	"-61"	;
    	String	s_60	=	"-60"	;
    	String	s_59	=	"-59"	;
    	String	s_58	=	"-58"	;
    	String	s_57	=	"-57"	;
    	String	s_56	=	"-56"	;
    	String	s_55	=	"-55"	;
    	String	s_54	=	"-54"	;
    	String	s_53	=	"-53"	;
    	String	s_52	=	"-52"	;
    	String	s_51	=	"-51"	;
    	String	s_50	=	"-50"	;
    	String	s_49	=	"-49"	;
    	String	s_48	=	"-48"	;
    	String	s_47	=	"-47"	;
    	String	s_46	=	"-46"	;
    	String	s_45	=	"-45"	;
    	String	s_44	=	"-44"	;
    	String	s_43	=	"-43"	;
    	String	s_42	=	"-42"	;
    	String	s_41	=	"-41"	;
    	String	s_40	=	"-40"	;
    	String	s_39	=	"-39"	;
    	String	s_38	=	"-38"	;
    	String	s_37	=	"-37"	;
    	String	s_36	=	"-36"	;
    	String	s_35	=	"-35"	;
    	String	s_34	=	"-34"	;
    	String	s_33	=	"-33"	;
    	String	s_32	=	"-32"	;
    	String	s_31	=	"-31"	;
    	String	s_30	=	"-30"	;
    	String	s_29	=	"-29"	;
    	String	s_28	=	"-28"	;
    	String	s_27	=	"-27"	;
    	String	s_26	=	"-26"	;
    	String	s_25	=	"-25"	;
    	String	s_24	=	"-24"	;
    	String	s_23	=	"-23"	;
    	String	s_22	=	"-22"	;
    	String	s_21	=	"-21"	;
    	String	s_20	=	"-20"	;
    	String	s_19	=	"-19"	;
    	String	s_18	=	"-18"	;
    	String	s_17	=	"-17"	;
    	String	s_16	=	"-16"	;
    	String	s_15	=	"-15"	;
    	String	s_14	=	"-14"	;
    	String	s_13	=	"-13"	;
    	String	s_12	=	"-12"	;
    	String	s_11	=	"-11"	;
    	String	s_10	=	"-10"	;
    	String	s_9	=	"-9"	;
    	String	s_8	=	"-8"	;
    	String	s_7	=	"-7"	;
    	String	s_6	=	"-6"	;
    	String	s_5	=	"-5"	;
    	String	s_4	=	"-4"	;
    	String	s_3	=	"-3"	;
    	String	s_2	=	"-2"	;
    	String	s_1	=	"-1"	;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	String	stra	=	"a"	;
    	String	strb	=	"b"	;
    	String	strc	=	"c"	;
    	String	strd	=	"d"	;
    	String	stre	=	"e"	;
    	String	strf	=	"f"	;
    	String	strg	=	"g"	;
    	String	strh	=	"h"	;
    	String	stri	=	"i"	;
    	String	strj	=	"j"	;
    	String	strk	=	"k"	;
    	String	strl	=	"l"	;
    	String	strm	=	"m"	;
    	String	strn	=	"n"	;
    	String	stro	=	"o"	;
    	String	strp	=	"p"	;
    	String	strq	=	"q"	;
    	String	strr	=	"r"	;
    	String	strs	=	"s"	;
    	String	strt	=	"t"	;
    	String	stru	=	"u"	;
    	String	strv	=	"v"	;
    	String	strw	=	"w"	;
    	String	strx	=	"x"	;
    	String	stry	=	"y"	;
    	String	strz	=	"z"	;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	String	strA	=	"A"	;
    	String	strB	=	"B"	;
    	String	strC	=	"C"	;
    	String	strD	=	"D"	;
    	String	strE	=	"E"	;
    	String	strF	=	"F"	;
    	String	strG	=	"G"	;
    	String	strH	=	"H"	;
    	String	strI	=	"I"	;
    	String	strJ	=	"J"	;
    	String	strK	=	"K"	;
    	String	strL	=	"L"	;
    	String	strM	=	"M"	;
    	String	strN	=	"N"	;
    	String	strO	=	"O"	;
    	String	strP	=	"P"	;
    	String	strQ	=	"Q"	;
    	String	strR	=	"R"	;
    	String	strS	=	"S"	;
    	String	strT	=	"T"	;
    	String	strU	=	"U"	;
    	String	strV	=	"V"	;
    	String	strW	=	"W"	;
    	String	strX	=	"X"	;
    	String	strY	=	"Y"	;
    	String	strZ	=	"Z"	;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





}
