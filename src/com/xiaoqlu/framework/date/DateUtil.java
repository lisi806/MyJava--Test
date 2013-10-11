package com.xiaoqlu.framework.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Title: DateUtil Description: 时间日期工具类 Copyright: Copyright (c) 2008
 * Company:深圳彩讯科技有限公司
 * 
 * @author 罗旭东
 * @CreateDate 2013-5-28 下午3:52:11
 * @version 1.0
 */
public class DateUtil {
	/**
	 * 格式 yyyyMMddHHmmss
	 */
	public static final String DATE_FORMAT_1 = "yyyyMMddHHmmss";
	public static final String DATE_FORMAT_2 = "yyyyMMdd";
	/**
	 * 年月日时分秒
	 */
	public static final SimpleDateFormat SDF1 = new SimpleDateFormat(
			DATE_FORMAT_1, Locale.getDefault());

	public static final SimpleDateFormat SDF2 = new SimpleDateFormat(
			DATE_FORMAT_2, Locale.getDefault());

	/**
	 * 
	 * getDate 获取当前时间
	 * 
	 */
	public static Date getDate() {
		Date nowAndroid = new Date();
		long nowPlant = nowAndroid.getTime();
		Date nowPlantDate = new Date(nowPlant);
		return nowPlantDate;
	}

	/**
	 * 
	 * getDateString 获取日期字符串
	 * 
	 */
	public static String getDateString(Date date) {
		return SDF1.format(date);
	}

	public static String getCurrentFormattedDate() {
		return getDateString(getDate());
	}

	public static String formatTo2(long time) {
		Date nowDate = new Date(time);
		return SDF2.format(nowDate);
	}

}
