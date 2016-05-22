package com.validate.tool;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.Serializable;

public class ImgInfo implements Serializable{
	/**
	 * @author �ź��� QQ:1034465036@qq.com
	 * @version 1.0
	 * */
	
	
	private Integer height;//ͼƬ�߶�
	private Integer width;//ͼƬ���
	private Integer codeNum;//��֤������
	private Integer codeType;//��֤�����ͣ������֡���ĸ��
	private Integer lineNum;//������
	private String font;//����
	private Integer imgType;//ͼƬ����
	private boolean openSingleCase;//�Ƿ���Ҫ����
	
	private BufferedImage bufferedImage;//���ص�ͼƬ����
	private int fontSize;//ͼƬ���ִ�С
	private String code;
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getCodeNum() {
		return codeNum;
	}
	public void setCodeNum(Integer codeNum) {
		this.codeNum = codeNum;
	}
	public Integer getLineNum() {
		return lineNum;
	}
	public void setLineNum(Integer lineNum) {
		this.lineNum = lineNum;
	}
	
	
	
	public boolean isOpenSingleCase() {
		return openSingleCase;
	}
	public void setOpenSingleCase(boolean openSingleCase) {
		this.openSingleCase = openSingleCase;
	}
	public Integer getImgType() {
		return imgType;
	}
	public void setImgType(Integer imgType) {
		this.imgType = imgType;
	}
	public Integer getCodeType() {
		return codeType;
	}
	public void setCodeType(Integer codeType) {
		this.codeType = codeType;
	}
	public String getFont() {
		return font;
	}
	public void setFont(String font) {
		this.font = font;
	}
	
	
	public BufferedImage getBufferedImage() {
		return bufferedImage;
	}
	public void setBufferedImage(BufferedImage bufferedImage) {
		this.bufferedImage = bufferedImage;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public int getFontSize() {
		return fontSize;
	}
	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	
}
