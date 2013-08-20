package com.daat.usefulkit;

import java.io.InputStream;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

//�qresource��Ū��bitmap�ɸ`�ٰO����
public class BitmapKit {
	public static Bitmap readBitMap(Context context, int resId){ 
		   BitmapFactory.Options opt = new BitmapFactory.Options();  
		   opt.inPreferredConfig = Bitmap.Config.RGB_565;   
		   opt.inPurgeable = true;  
		   opt.inInputShareable = true;  
		   //����귽�Ϥ�
		   InputStream is = context.getResources().openRawResource(resId);  
		   return BitmapFactory.decodeStream(is,null,opt);  
		}
}
