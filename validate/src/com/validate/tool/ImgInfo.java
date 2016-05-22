package com.validate.tool;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.Serializable;

public class ImgInfo implements Serializable{
	/**
	 * @author 张豪锋 QQ:1034465036@qq.com
	 * @version 1.0
	 * */
	
	
	private Integer height;//图片高度
	private Integer width;//图片宽度
	private Integer codeNum;//验证码数量
	private Integer codeType;//验证码类型：纯数字、字母等
	private Integer lineNum;//干扰线
	private String font;//字体
	private Integer imgType;//图片类型
	private boolean openSingleCase;//是否需要单例
	
	private BufferedImage bufferedImage;//返回的图片缓存
	private int fontSize;//图片文字大小
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
