package com.validate.tool;

/**
 * @author 张豪锋QQ:1034465036@qq.com
 * @version 1.0
 * 获取各种随机数
 * 
 * */
public class Random implements RandomBase{

	private static final String[] B_S_N_LETTER_V = { "1", "3", "4", "5", "6", "7", "8",//开启后的字符串,大小写混合
			"9", "a", "b", "c", "d", "e", "f", "i", "j", "k", "m", "n", "p",
			"q", "r", "s", "t", "u", "v", "w", "x", "y", "A", "B", "C", "D",
			"E", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R", "S", "T",
			"U", "V", "W", "X", "Y" };
	
	private static final String[] B_S_N_LETTER_N = {"1", "3", "4", "5", "6", "7", "8",//不开启的字符串，大小写混合
		"9","0", "a", "b", "c", "d", "e", "f","g","h", "i", "j", "k", "m", "n","o", "p",
		"q", "r", "s", "t", "u", "v", "w", "x", "y","z", "A", "B", "C", "D",
		"E", "F", "G", "H", "J", "K", "M", "N", "P", "O","Q", "R", "S", "T",
		"U", "V", "W", "X", "Y","Z"};
	
	private static final Integer[] NUM = {1,2,3,4,5,6,7,8,9,0};//纯数字的验证码
	
	private static final String[] S_LETTER = {//小写字母
		"a", "b", "c", "d", "e", "f","g","h", "i", "j", "k", "m", "n","o", "p",
		"q", "r", "s", "t", "u", "v", "w", "x", "y","z"};
	
	private static final String[] B_LETTER = {"A", "B", "C", "D",//大写字母
		"E", "F", "G", "H", "J", "K", "M", "N", "P", "O","Q", "R", "S", "T",
		"U", "V", "W", "X", "Y","Z"};
	
	private static final String[] B_N_LETTER_V = {//大写字母与数字混合，开启模糊
		"1", "3", "4", "5", "6", "7", "8","9","A", "B", "C", "D",
		"E", "F", "G", "H", "J", "K", "M", "N", "P", "O","Q", "R", "S", "T",
		"U", "V", "W", "X", "Y"
	};
	
	private static final String[] B_N_LETTER_N = {//大写字母与数字混合，关闭模糊
		"1", "3", "4", "5", "6", "7", "8","9","0","A", "B", "C", "D",
		"E", "F", "G", "H","I", "J", "K", "M", "N", "P", "O","Q", "R", "S", "T",
		"U", "V", "W", "X", "Y","Z"
	};
	
	private static final String[] S_N_LETTER_V = {//小写字母与数字混合，开启模糊
		"1", "3", "4", "5", "6", "7", "8","9","0",
		 "a", "b", "c", "d", "e", "f", "i", "j", "k", "m", "n", "p","q", "r", "s", "t", "u", "v", "w", "x", "y"
	};
	
	private static final String[] S_N_LETTER_N = {//小写字母与数字混合，关闭模糊
		"1", "3", "4", "5", "6", "7", "8","9","0",
		"a", "b", "c", "d", "e", "f","g","h", "i", "j", "k", "m", "n","o", "p","q", "r", "s", "t", "u", "v", "w", "x", "y","z"
	};
	
	
	private static volatile Random random = null;//是否使用单例模式
	

//	public  Random()//默认单例模式打开
//	{
//		if(random == null)
//		{
//			synchronized (Random.class) {
//				if(random == null)
//				{
//					random = new Random();//内存溢出
//				}
//			}
//		}
//	}
//	
//	public Random(boolean notOpenSingleCase)//是否打开单例模式，true打开单例模式，false不使用单例模式
//	{
//		if(notOpenSingleCase == false)//不开单例模式
//		{
//			
//		}
//	}
	
	
	
	public static Random getInstance(boolean openSingleCase)//是否开启单例模式，是否开启字母字符，0o区分默认开启
	{
		if(openSingleCase == true)//开启单例模式
		{
			if(random == null)
			{
				synchronized (Random.class) {
					random = new Random();
				}
			}
		}else//不开启单例模式
		{
			return new Random();
		}
		
		return random;
	}

	public String get(Integer length,int codeType) {
		StringBuffer stringBuffer =  new StringBuffer();
		
		switch (codeType) {
		case CodeType.CODE_TYPE_NUM://纯数字
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(NUM.length);
				stringBuffer.append(NUM[n]);
			}
			break;
		case CodeType.CODE_TYPE_B_LETTER://纯大写字母
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(B_LETTER.length);
				stringBuffer.append(B_LETTER[n]);
			}
			break;
		case CodeType.CODE_TYPE_S_LETTER://纯小写字母
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(S_LETTER.length);
				stringBuffer.append(S_LETTER[n]);
			}
			break;
		case CodeType.CODE_TYPE_B_N_LETTER_N://大写字母与数字混合，不开启模糊
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(B_N_LETTER_N.length);
				stringBuffer.append(B_N_LETTER_N[n]);
			}
			break;
		case CodeType.CODE_TYPE_B_N_LETTER_V://大写字母与数字混合，开启模糊
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(B_N_LETTER_V.length);
				stringBuffer.append(B_N_LETTER_V[n]);
			}
			break;
		case CodeType.CODE_TYPE_S_N_LETTER_N://小写字母与数字混合，不开启模糊
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(S_N_LETTER_N.length);
				stringBuffer.append(S_N_LETTER_N[n]);
			}
			break;
		case CodeType.CODE_TYPE_S_N_LETTER_V://小写字母与数字混合，开启模糊
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(S_N_LETTER_V.length);
				stringBuffer.append(S_N_LETTER_V[n]);
			}
			break;
		case CodeType.CODE_TYPE_B_S_N_LETTER_N://小写字母与数字混合，开启模糊
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(B_S_N_LETTER_N.length);
				stringBuffer.append(B_S_N_LETTER_N[n]);
			}
			break;
		case CodeType.CODE_TYPE_B_S_N_LETTER_V://小写字母与数字混合，开启模糊
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(B_S_N_LETTER_V.length);
				stringBuffer.append(B_S_N_LETTER_V[n]);
			}
			break;
		default:
			break;
		}
		
		
//		if(vague == true)//开启 
//		{
//			for (int i = 1; i <= length; i++) {
//				java.util.Random random = new java.util.Random();
//				int n = random.nextInt(50);
//				stringBuffer.append(rBase[n]);
//			}
//		}else
//		{
//			for (int i = 1; i <= length; i++) {
//				java.util.Random random = new java.util.Random();
//				int n = random.nextInt(58);
//				stringBuffer.append(rBaseVague[n]);
//			}
//		}
		
		return stringBuffer.toString();

	}

	
	
}
