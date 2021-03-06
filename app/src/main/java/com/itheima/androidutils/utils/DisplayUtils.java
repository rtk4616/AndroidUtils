package com.itheima.androidutils.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;

/**
 * ============================================================
 * Copyright：Google有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * 博客：http://blog.csdn.net/axi295309066
 * 微博：AndroidDeveloper
 * <p>
 * Project_Name：AndroidUtils2
 * Package_Name：com.itheima.androidutils
 * Version：1.0
 * time：2016/2/15 11:50
 * des ：Android工具类
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/

public class DisplayUtils {
	/**
	 * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
	 */
	public static int dip2px(Context context, float dpValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);
	}

	/**
	 * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
	 */
	public static int px2dip(Context context, float pxValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (pxValue / scale + 0.5f);
	}

	/**
	 * 得到的屏幕的宽度
	 */
	public static int getWidthPx(Activity activity) {
		// DisplayMetrics 一个描述普通显示信息的结构，例如显示大小、密度、字体尺寸
		DisplayMetrics displaysMetrics = new DisplayMetrics();// 初始化一个结构
		activity.getWindowManager().getDefaultDisplay().getMetrics(displaysMetrics);// 对该结构赋值
		return displaysMetrics.widthPixels;
	}

	/**
	 * 得到的屏幕的高度
	 */
	public static int getHeightPx(Activity activity) {
		// DisplayMetrics 一个描述普通显示信息的结构，例如显示大小、密度、字体尺寸
		DisplayMetrics displaysMetrics = new DisplayMetrics();// 初始化一个结构
		activity.getWindowManager().getDefaultDisplay().getMetrics(displaysMetrics);// 对该结构赋值
		return displaysMetrics.heightPixels;
	}

	/**
	 * 得到屏幕的dpi
	 * @param activity
	 * @return
	 */
	public static int getDensityDpi(Activity activity) {
		// DisplayMetrics 一个描述普通显示信息的结构，例如显示大小、密度、字体尺寸
		DisplayMetrics displaysMetrics = new DisplayMetrics();// 初始化一个结构
		activity.getWindowManager().getDefaultDisplay().getMetrics(displaysMetrics);// 对该结构赋值
		return displaysMetrics.densityDpi;
	}

	/**
	 * 返回状态栏/通知栏的高度
	 * 
	 * @param activity
	 * @return
	 */
	public static int getStatusHeight(Activity activity) {
		Rect frame = new Rect();
		activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
		int statusBarHeight = frame.top;
		return statusBarHeight;
	}
}
