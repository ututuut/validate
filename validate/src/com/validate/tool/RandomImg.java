package com.validate.tool;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class RandomImg{

	private static volatile RandomImg randomImg  = null;
	
	private RandomImg(){}
	
	public RandomImg getInstance(boolean openSingleCase)
	{
		if(openSingleCase == true)//��������ģʽ
		{
			if(randomImg == null)
			{
				synchronized (RandomImg.class) {
					if(randomImg == null)
					{
						randomImg = new RandomImg();
					}
				}
			}
		}else//����������ģʽ
		{
			return new RandomImg();
		}
		return randomImg;
	} 
	
	public ImgInfo getImg(ImgInfo imgInfo)throws Exception
	{
		
		
		int x = 0,fontHeight=0,codeY=0;  
        int red = 0, green = 0, blue = 0;  
          
        x = imgInfo.getWidth() / (imgInfo.getCodeNum() +2);//ÿ���ַ��Ŀ��  
        fontHeight = imgInfo.getHeight() - 2;//����ĸ߶�  
        codeY = (int)(imgInfo.getHeight()/1.3 ); //y���ά��Ϊ
        
		BufferedImage buffereedImage = new BufferedImage(imgInfo.getWidth(), imgInfo.getHeight(), imgInfo.getImgType());
		
		
		Random random = new Random().getInstance(imgInfo.isOpenSingleCase());
		
		String code = random.get(imgInfo.getCodeNum(),imgInfo.getCodeType());
		
		imgInfo.setCode(code);//�õ�����ַ���
		
		
		Graphics2D graphics2D = buffereedImage.createGraphics();
		
		graphics2D.setColor(Color.WHITE);//����մȡ��ɫ
		
		graphics2D.fillRect(0, 0, imgInfo.getWidth(), imgInfo.getHeight());//������
		
		
		Font font = new Font("Arial", imgInfo.getFontSize(), imgInfo.getFontSize());
		
		graphics2D.setFont(font);
		graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //���������
		java.util.Random randomBase = new java.util.Random(); 
		
		for (int i = 0; i < imgInfo.getLineNum(); i++) 
		{  
			int xs = randomBase.nextInt(imgInfo.getWidth());  
	        int ys = randomBase.nextInt(imgInfo.getHeight());  
	        int xe = xs+randomBase.nextInt(imgInfo.getWidth()/8);  
	        int ye = ys+randomBase.nextInt(imgInfo.getHeight()/8);  
	        red = randomBase.nextInt(255);  
	        green = randomBase.nextInt(255);  
	        blue = randomBase.nextInt(255);  
	        graphics2D.setColor(new Color(red, green, blue));  
	        graphics2D.drawLine(xs, ys, xe, ye);
	        
	    }
		
		for (int i = 0; i < imgInfo.getCodeNum(); i++) {  
            String strRand = String.valueOf(code.charAt(i));  
            // �����������ɫֵ���������ÿ���ַ�����ɫֵ������ͬ��  
            red = randomBase.nextInt(255);  
            green = randomBase.nextInt(255);  
            blue = randomBase.nextInt(255);  
            graphics2D.setColor(new Color(red, green, blue));  
           // graphics2D.drawString(strRand, (i + 1) * x-(int)(imgInfo.getFontSize()/1.2), codeY);
            graphics2D.drawString(strRand, (i + 2) * x-(int)(imgInfo.getFontSize()/1.8), codeY);  
            
            // ���������ĸ�����������һ��    
        } 
		
		
		imgInfo.setBufferedImage(buffereedImage);
		return imgInfo;
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		RandomImg randomImg = new RandomImg().getInstance(true);
		
		ImgInfo imginfo = new ImgInfo();
		
		imginfo.setCodeNum(4);
		imginfo.setCodeType(CodeType.CODE_TYPE_B_LETTER);
		imginfo.setFont("");
		imginfo.setFontSize(49);
		imginfo.setHeight(60);
		imginfo.setImgType(BufferedImage.TYPE_INT_RGB);
		imginfo.setLineNum(23);
		imginfo.setOpenSingleCase(true);
		imginfo.setWidth(200);
		
		 
		
		
		randomImg.getImg(imginfo);
		
		File f = new File("E:/e.png");
	
		ImageIO.write(imginfo.getBufferedImage(),"png", f);
		
		
	}

}
