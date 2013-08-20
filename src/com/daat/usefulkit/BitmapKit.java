package com.daat.usefulkit;

import java.io.InputStream;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

//從resource中讀取bitmap時節省記憶體
public class BitmapKit {
	public static Bitmap readBitMap(Context context, int resId){ 
		   BitmapFactory.Options opt = new BitmapFactory.Options();  
		   opt.inPreferredConfig = Bitmap.Config.RGB_565;   
		   opt.inPurgeable = true;  
		   opt.inInputShareable = true;  
		   //獲取資源圖片
		   InputStream is = context.getResources().openRawResource(resId);  
		   return BitmapFactory.decodeStream(is,null,opt);  
		}
}
