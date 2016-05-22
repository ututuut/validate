package com.validate.tool;


/**
 * @author 张豪锋 QQ:1034465036@qq.com
 * @version 1.0
 * */
public class CodeType {
	public static final int CODE_TYPE_NUM = 1;//验证码为纯数字
	public static final int CODE_TYPE_B_LETTER = 2;//验证码为纯大写字母
	public static final int CODE_TYPE_S_LETTER = 3;//验证码为纯小写字母
	public static final int CODE_TYPE_B_N_LETTER_N = 4;//验证码为大写字母与数字混合，不开启模糊
	public static final int CODE_TYPE_B_N_LETTER_V = 5;//验证码为大写字母与数字混合，开启模糊
	public static final int CODE_TYPE_S_N_LETTER_N = 6;//验证码为小写字母与数字混合，不开启模糊
	public static final int CODE_TYPE_S_N_LETTER_V = 7;//验证码为小写字母与数字混合，开启模糊
	public static final int CODE_TYPE_B_S_N_LETTER_N = 8;//验证码为大小写字母数字混合,不开启模糊
	public static final int CODE_TYPE_B_S_N_LETTER_V = 9;//验证码为大小写字母数字混合,开启模糊
	
	
}
