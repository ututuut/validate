package com.validate.tool;

/**
 * @author �ź���QQ:1034465036@qq.com
 * @version 1.0
 * ��ȡ���������
 * 
 * */
public class Random implements RandomBase{

	private static final String[] B_S_N_LETTER_V = { "1", "3", "4", "5", "6", "7", "8",//��������ַ���,��Сд���
			"9", "a", "b", "c", "d", "e", "f", "i", "j", "k", "m", "n", "p",
			"q", "r", "s", "t", "u", "v", "w", "x", "y", "A", "B", "C", "D",
			"E", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R", "S", "T",
			"U", "V", "W", "X", "Y" };
	
	private static final String[] B_S_N_LETTER_N = {"1", "3", "4", "5", "6", "7", "8",//���������ַ�������Сд���
		"9","0", "a", "b", "c", "d", "e", "f","g","h", "i", "j", "k", "m", "n","o", "p",
		"q", "r", "s", "t", "u", "v", "w", "x", "y","z", "A", "B", "C", "D",
		"E", "F", "G", "H", "J", "K", "M", "N", "P", "O","Q", "R", "S", "T",
		"U", "V", "W", "X", "Y","Z"};
	
	private static final Integer[] NUM = {1,2,3,4,5,6,7,8,9,0};//�����ֵ���֤��
	
	private static final String[] S_LETTER = {//Сд��ĸ
		"a", "b", "c", "d", "e", "f","g","h", "i", "j", "k", "m", "n","o", "p",
		"q", "r", "s", "t", "u", "v", "w", "x", "y","z"};
	
	private static final String[] B_LETTER = {"A", "B", "C", "D",//��д��ĸ
		"E", "F", "G", "H", "J", "K", "M", "N", "P", "O","Q", "R", "S", "T",
		"U", "V", "W", "X", "Y","Z"};
	
	private static final String[] B_N_LETTER_V = {//��д��ĸ�����ֻ�ϣ�����ģ��
		"1", "3", "4", "5", "6", "7", "8","9","A", "B", "C", "D",
		"E", "F", "G", "H", "J", "K", "M", "N", "P", "O","Q", "R", "S", "T",
		"U", "V", "W", "X", "Y"
	};
	
	private static final String[] B_N_LETTER_N = {//��д��ĸ�����ֻ�ϣ��ر�ģ��
		"1", "3", "4", "5", "6", "7", "8","9","0","A", "B", "C", "D",
		"E", "F", "G", "H","I", "J", "K", "M", "N", "P", "O","Q", "R", "S", "T",
		"U", "V", "W", "X", "Y","Z"
	};
	
	private static final String[] S_N_LETTER_V = {//Сд��ĸ�����ֻ�ϣ�����ģ��
		"1", "3", "4", "5", "6", "7", "8","9","0",
		 "a", "b", "c", "d", "e", "f", "i", "j", "k", "m", "n", "p","q", "r", "s", "t", "u", "v", "w", "x", "y"
	};
	
	private static final String[] S_N_LETTER_N = {//Сд��ĸ�����ֻ�ϣ��ر�ģ��
		"1", "3", "4", "5", "6", "7", "8","9","0",
		"a", "b", "c", "d", "e", "f","g","h", "i", "j", "k", "m", "n","o", "p","q", "r", "s", "t", "u", "v", "w", "x", "y","z"
	};
	
	
	private static volatile Random random = null;//�Ƿ�ʹ�õ���ģʽ
	

//	public  Random()//Ĭ�ϵ���ģʽ��
//	{
//		if(random == null)
//		{
//			synchronized (Random.class) {
//				if(random == null)
//				{
//					random = new Random();//�ڴ����
//				}
//			}
//		}
//	}
//	
//	public Random(boolean notOpenSingleCase)//�Ƿ�򿪵���ģʽ��true�򿪵���ģʽ��false��ʹ�õ���ģʽ
//	{
//		if(notOpenSingleCase == false)//��������ģʽ
//		{
//			
//		}
//	}
	
	
	
	public static Random getInstance(boolean openSingleCase)//�Ƿ�������ģʽ���Ƿ�����ĸ�ַ���0o����Ĭ�Ͽ���
	{
		if(openSingleCase == true)//��������ģʽ
		{
			if(random == null)
			{
				synchronized (Random.class) {
					random = new Random();
				}
			}
		}else//����������ģʽ
		{
			return new Random();
		}
		
		return random;
	}

	public String get(Integer length,int codeType) {
		StringBuffer stringBuffer =  new StringBuffer();
		
		switch (codeType) {
		case CodeType.CODE_TYPE_NUM://������
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(NUM.length);
				stringBuffer.append(NUM[n]);
			}
			break;
		case CodeType.CODE_TYPE_B_LETTER://����д��ĸ
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(B_LETTER.length);
				stringBuffer.append(B_LETTER[n]);
			}
			break;
		case CodeType.CODE_TYPE_S_LETTER://��Сд��ĸ
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(S_LETTER.length);
				stringBuffer.append(S_LETTER[n]);
			}
			break;
		case CodeType.CODE_TYPE_B_N_LETTER_N://��д��ĸ�����ֻ�ϣ�������ģ��
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(B_N_LETTER_N.length);
				stringBuffer.append(B_N_LETTER_N[n]);
			}
			break;
		case CodeType.CODE_TYPE_B_N_LETTER_V://��д��ĸ�����ֻ�ϣ�����ģ��
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(B_N_LETTER_V.length);
				stringBuffer.append(B_N_LETTER_V[n]);
			}
			break;
		case CodeType.CODE_TYPE_S_N_LETTER_N://Сд��ĸ�����ֻ�ϣ�������ģ��
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(S_N_LETTER_N.length);
				stringBuffer.append(S_N_LETTER_N[n]);
			}
			break;
		case CodeType.CODE_TYPE_S_N_LETTER_V://Сд��ĸ�����ֻ�ϣ�����ģ��
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(S_N_LETTER_V.length);
				stringBuffer.append(S_N_LETTER_V[n]);
			}
			break;
		case CodeType.CODE_TYPE_B_S_N_LETTER_N://Сд��ĸ�����ֻ�ϣ�����ģ��
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(B_S_N_LETTER_N.length);
				stringBuffer.append(B_S_N_LETTER_N[n]);
			}
			break;
		case CodeType.CODE_TYPE_B_S_N_LETTER_V://Сд��ĸ�����ֻ�ϣ�����ģ��
			for(int i = 1; i <= length; i++) {
				java.util.Random random = new java.util.Random();
				int n = random.nextInt(B_S_N_LETTER_V.length);
				stringBuffer.append(B_S_N_LETTER_V[n]);
			}
			break;
		default:
			break;
		}
		
		
//		if(vague == true)//���� 
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
