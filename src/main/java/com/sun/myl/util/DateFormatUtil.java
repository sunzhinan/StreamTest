package com.sun.myl.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateFormatUtil 
{
	public static String getDateByString(String str)
	{
		SimpleDateFormat sd = new SimpleDateFormat(str);
		
		String dateStr = sd.format(new Date());
		
		return dateStr;
	}
}
