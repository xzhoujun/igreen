package com.chinasofti.basic.utils;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class ImageUtils {	
		     /** 
		      *  
		      * @param pressImg 水印图片 
		      * @param targetImg 目标图片 
		      * @param x 修正值 默认在中间 
		      * @param y 修正值 默认在中间 
		      * @param alpha 透明度 
		      * @param waterPos 水印位置，有10种状态，0为指定位置；   
		      *                 1为顶端居左，2为顶端居中，3为顶端居右；   
		      *                 4为中部居左，5为中部居中，6为中部居右；   
		      *                 7为底端居左，8为底端居中，9为底端居右；   
		      */  
		     public final static void pressImage(String pressImg, String targetImg, int x, int y, float alpha,int waterPos) {  
		         try {  
		             File img = new File(targetImg);  
		             Image src = ImageIO.read(img);  
		             int width = src.getWidth(null);  
		             int height = src.getHeight(null);  
		             BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);  
		             Graphics2D g = image.createGraphics();  
		             g.drawImage(src, 0, 0, width, height, null);  
		             //水印文件  
		             Image src_biao = ImageIO.read(new File(pressImg));  
		             int width_biao = src_biao.getWidth(null);  
		             int height_biao = src_biao.getHeight(null);  
		             int pos[] = setWaterPos(width,height,width_biao,height_biao,x,y,waterPos);  
		             g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alpha));  
		             g.drawImage(src_biao, pos[0], pos[1], width_biao, height_biao, null);  
		             //水印文件结束  
		             g.dispose();  
		             ImageIO.write((BufferedImage) image, "jpg", img);  
		         } catch (Exception e) {  
		             e.printStackTrace();  
		         }  
		     }  
		     /** 
		      * 
		      * @param pressText 水印文字 
		      * @param targetImg 目标图片 
		      * @param fontName 字体名称 
		      * @param fontStyle 字体样式 
		      * @param color 字体颜色 
		      * @param fontSize 字体大小 
		      * @param x 修正值 
		      * @param y 正值 
		      * @param alpha 透明度 
		      */  
		     public static void pressText(String pressText, File targetImg, String fontName, int fontStyle, Color color, int fontSize, int x, int y, float alpha,int waterPos) {  
		         try {  
		             //File img = new File(targetImg);  
		             Image src = ImageIO.read(targetImg);  
		             int width = src.getWidth(null);  
		             int height = src.getHeight(null);  
		             BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);  
		             Graphics2D g = image.createGraphics();  
		             g.drawImage(src, 0, 0, width, height, null);  
		             g.setColor(color);  
		             g.setFont(new Font(fontName, fontStyle, fontSize));  
		             g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alpha));  
		             int pos[] = setWaterPos(width,height,getLength(pressText) * fontSize,fontSize,x,y,waterPos);  
		 //          g.drawString(pressText, (width - (getLength(pressText) * fontSize)) / 2 + x, (height - fontSize) / 2 + y);  
		             g.drawString(pressText, pos[0], pos[1]+fontSize);  
		             g.dispose();  
		             //ImageIO.write((BufferedImage) image, "jpg", img);  
		             FileOutputStream out = new FileOutputStream(targetImg);
		              JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
		              JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(image);
		              param.setQuality(50f, true);
		              encoder.encode(image, param);		             
		         } catch (Exception e) {  
		             e.printStackTrace();  
		         }  
		     }  
		     /** 
		      * 
		      * @param filePath 图片路径 
		      * @param height 高度 
		      * @param width 宽度 
		      * @param bb 比例不对时是否需要补白 
		      */  
		     public static void resize(String filePath, int height, int width, boolean bb) {  
		         try {  
		             double ratio = 0.0; //缩放比例   
		             File f = new File(filePath);  
		             BufferedImage bi = ImageIO.read(f);  
		             Image itemp = bi.getScaledInstance(width, height, bi.SCALE_SMOOTH);  
		             //计算比例  
		             if ((bi.getHeight() > height) || (bi.getWidth() > width)) {  
		                 if (bi.getHeight() > bi.getWidth()) {  
		                     ratio = (new Integer(height)).doubleValue() / bi.getHeight();  
		                 } else {  
		                     ratio = (new Integer(width)).doubleValue() / bi.getWidth();  
		                 }  
		                 AffineTransformOp op = new AffineTransformOp(AffineTransform.getScaleInstance(ratio, ratio), null);  
		                 itemp = op.filter(bi, null);  
		             }  
		             if (bb) {  
		                 BufferedImage image =   
		                  new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);  
		                 Graphics2D g = image.createGraphics();  
		                 g.setColor(Color.white);  
		                 g.fillRect(0, 0, width, height);  
		                 if (width == itemp.getWidth(null))  
		                     g.drawImage(itemp, 0, (height - itemp.getHeight(null)) / 2, itemp.getWidth(null), itemp.getHeight(null), Color.white, null);  
		                 else  
		         g.drawImage(itemp, (width - itemp.getWidth(null)) / 2, 0, itemp.getWidth(null), itemp.getHeight(null), Color.white, null);  
		                 g.dispose();  
		                 itemp = image;  
		             }  
		             ImageIO.write((BufferedImage) itemp, "jpg", f);  
		         } catch (IOException e) {  
		             e.printStackTrace();  
		         }  
		     }  
		   
		     public static int getLength(String text) {  
		         int length = 0;  
		         for (int i = 0; i < text.length(); i++) {  
		             if (new String(text.charAt(i) + "").getBytes().length > 1) {  
		                 length += 2;  
		             } else {  
		                 length += 1;  
		             }  
		         }  
		         return length / 2;  
		     }  
		   
		   
		     private static int[]  setWaterPos(int ground_w,int ground_h,int w_width,int w_height,int width,int height,int waterPos){  
		         int pos[] = new int[2];   
		         switch (waterPos) {  
		         case 0:    //0为指定位置  
		             pos[0]=width;  
		             pos[1]=height;  
		             break;  
		         case 1:   //1为顶端居左   
		             pos[0]=0;  
		             pos[1]=0;  
		         break;  
		         case 2:  //2为顶端居中  
		             pos[0]=(ground_w - w_width) / 2;  
		             pos[1]=0;  
		         break;  
		         case 3:  //3为顶端居右     
		             pos[0]=ground_w - w_width;  
		             pos[1]=0;  
		         break;  
		         case 4:  //4为中部居左  
		             pos[0]=0;  
		             pos[1]=(ground_h - w_height) / 2;  
		         break;   //5为中部居中  
		         case 5:  
		             pos[0]=(ground_w - w_width) / 2;  
		             pos[1]=(ground_h - w_height) / 2;  
		         break;  //6为中部居右  
		         case 6:  
		             pos[0]=ground_w - w_width;  
		             pos[1]=(ground_h - w_height) / 2;  
		         break;  
		         case 7:  //7为底端居左   
		             pos[0]=0;  
		             pos[1]=ground_h - w_height;  
		         break;  
		         case 8:  //8为底端居中  
		             pos[0]=(ground_w - w_width) / 2;  
		             pos[1]=ground_h - w_height;  
		         break;  
		         case 9: //9为底端居右  
		             pos[0]=ground_w - w_width;  
		             pos[1]=ground_h - w_height;  
		         break;  
		         default:  //指定位置  
		             pos[0]=width;  
		             pos[1]=height;  
		         break;  
		         }  
		         return pos;  
		     }  
		     public static void main(String[] args) throws IOException {  
		         //pressImage("D:\\attach\\logo.jpg", "D:\\attach\\dly_ems.jpg", 0, 0, 0.5f,9); 
		    	 //
		         //pressText("我是牛人", "D:\\Water lilies.bmp", "黑体", 36, Color.GREEN, 25, 0, 0, 0.8f,8);  
		         //resize("D:\\attach\\thumbnail.jpg", 500, 500, true);  
		     }  
 
}
